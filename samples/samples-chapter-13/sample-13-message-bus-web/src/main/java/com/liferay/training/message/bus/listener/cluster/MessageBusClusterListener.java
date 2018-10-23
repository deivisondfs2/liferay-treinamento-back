package com.liferay.training.message.bus.listener.cluster;

import com.liferay.portal.kernel.cluster.messaging.ClusterBridgeMessageListener;
import com.liferay.portal.kernel.messaging.Destination;
import com.liferay.portal.kernel.messaging.MessageListener;
import com.liferay.training.message.bus.constants.TrainingDestinationNames;

import org.osgi.service.component.annotations.Activate;
import org.osgi.service.component.annotations.Component;
import org.osgi.service.component.annotations.Deactivate;
import org.osgi.service.component.annotations.Reference;

@Component(
    immediate = true,
    service = MessageBusClusterListener.class
)
public class MessageBusClusterListener {

	@Activate
    protected void activate() {

        _clusterBridgeMessageListener = new ClusterBridgeMessageListener();
        _destination.register(_clusterBridgeMessageListener);
    }
    
    @Deactivate
    protected void deactivate() {

        _destination.unregister(_clusterBridgeMessageListener );
    }

    @Reference(target = "(destination.name=" + TrainingDestinationNames.TRAINING_DESTINATION + ")")
    private Destination _destination;

    private MessageListener _clusterBridgeMessageListener;
}