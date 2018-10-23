    AUI().ready(
        function() { 
            Liferay.Loader.require('tippy', function(tippy) {
                tippy('.gradebook-tip', {
                    hideOnClick: false
                }); 
            });
        }
    );