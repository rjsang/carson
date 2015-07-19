app.controller('reportController', function (lodgeService) {
    var ctrl = this;

    ctrl.lodgeList = [];

    lodgeService.findAll().success(function (response) {
        response.content.forEach(function (lodge) {
            momentise(lodge.meetings);
        });
        ctrl.lodgeList = response.content;
    });
});

function momentise(meetings) {
    meetings.forEach(function (meeting) {
        meeting.dateTime = moment(meeting.dateTime);
    });
}