app.controller('navController', function ($location) {
    var ctrl = this;
    
    ctrl.isActive = function (viewLocation) { 
        return viewLocation === $location.path();
    };
});

app.controller('reportController', function (reportService) {
    var ctrl = this;

    ctrl.report = [];

    reportService.findAll().success(function (response) {
        response.forEach(function (meeting) {
            meeting.dateTime = moment.unix(meeting.dateTime);
        });
        ctrl.report = response;
    });
});

