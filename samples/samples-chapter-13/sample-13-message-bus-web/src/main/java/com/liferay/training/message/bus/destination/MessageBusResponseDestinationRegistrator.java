
package com.liferay.training.message.bus.destination;

import com.liferay.portal.kernel.concurrent.CallerRunsPolicy;
import com.liferay.portal.kernel.concurrent.ThreadPoolExecutor;
import com.liferay.portal.kernel.log.Log;
import com.liferay.portal.kernel.log.LogFactoryUtil;
import com.liferay.portal.kernel.messaging.Destination;
import com.liferay.portal.kernel.messaging.DestinationConfiguration;
import com.liferay.portal.kernel.messaging.DestinationFactory;
import com.liferay.portal.kernel.messaging.DestinationFactoryUtil;
import com.liferay.portal.kernel.util.HashMapDictionary;
import com.liferay.training.message.bus.constants.TrainingDestinationNames;

import java.util.Dictionary;
import java.util.HashMap;
import java.util.Map;

import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceRegistration;
import org.osgi.service.component.ComponentContext;
import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Modified;
import org.osgi.service.component.annotations.Reference;

/**
 * Message bus destination endpoint registration component for the sample message.
 * response.
 * 
 * @author liferay
 */
@Component(
	immediate = true
)
public class MessageBusResponseDestinationRegistrator {

	@Activate
	protected void activate(ComponentContext componentContext) {

		_bundleContext = componentContext.getBundleContext();

		_log.info(
			"Registering message bus listener for " +
				TrainingDestinationNames.TRAINING_RESPONSE_DESTINATION);

		// Register a parallel destination.
		
		register(
			DestinationConfiguration.DESTINATION_TYPE_PARALLEL,
			TrainingDestinationNames.TRAINING_RESPONSE_DESTINATION, null, true);
	}

	/**
	 * Register the endpoint.
	 * 
	 * @param destinationType
	 * @param destinationName
	 * @param destinationPropertyName
	 * @param destinationPropertyValue
	 */
	protected void register(
		String destinationType, String destinationName,
		String destinationPropertyName, Object destinationPropertyValue) {

		DestinationConfiguration destinationConfiguration =
			new DestinationConfiguration(destinationType, destinationName);

		destinationConfiguration.setMaximumQueueSize(5);
		destinationConfiguration.setRejectedExecutionHandler(
			new CallerRunsPolicy() {

				@Override
				public void rejectedExecution(
					Runnable runnable, ThreadPoolExecutor threadPoolExecutor) {

					if (_log.isWarnEnabled()) {
						_log.warn(
							"The current thread will handle the request " +
								"because the graph walker's task queue is at " +
								"its maximum capacity");
					}

					super.rejectedExecution(runnable, threadPoolExecutor);
				}

			});

		Destination destination =
			_destinationFactory.createDestination(destinationConfiguration);

		Dictionary<String, Object> properties = new HashMapDictionary<>();

		properties.put(
			"destination.name", destinationConfiguration.getDestinationName());

		if (destinationPropertyName != null) {
			properties.put(destinationPropertyName, destinationPropertyValue);
		}

		ServiceRegistration<Destination> serviceRegistration =
			_bundleContext.registerService(
				Destination.class, destination, properties);

		_serviceRegistrations.put(destination.getName(), serviceRegistration);
	}

	@Deactivate
	protected void deactivate() {

		for (ServiceRegistration<Destination> serviceRegistration : _serviceRegistrations.values()) {

			Destination destination =
				_bundleContext.getService(serviceRegistration.getReference());

			serviceRegistration.unregister();

			destination.destroy();
		}

		_serviceRegistrations.clear();
	}

	@Modified
	protected void modified(ComponentContext componentContext) {

		deactivate();

		activate(componentContext);
	}

	private static final Log _log =
		LogFactoryUtil.getLog(MessageBusDestinationRegistrator.class);

	private volatile BundleContext _bundleContext;
	
	@Reference
	private DestinationFactory _destinationFactory;

	private final Map<String, ServiceRegistration<Destination>> _serviceRegistrations =
		new HashMap<>();

}
