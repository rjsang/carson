app.controller('navController', function ($location, $http, $rootScope, $scope, authService) {
  var ctrl = this;

  ctrl.isActive = function (viewLocation) {
    return viewLocation === $location.path();
  };

  authService.authenticate();

  ctrl.credentials = {};

  ctrl.login = function () {
    authService.authenticate(ctrl.credentials, function (authenticated) {
      if (authenticated) {
        console.log("Login succeeded")
        $location.path("/");
        $scope.error = false;
        $rootScope.authenticated = true;
      } else {
        console.log("Login failed")
        $location.path("/signin");
        $scope.error = true;
        $rootScope.authenticated = false;
      }
    })
  };

  ctrl.logout = function () {
    authService.logout(function() {
      $location.path("/");
    });
  }
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

app.controller('signupController', function (brethrenService, $location, authService) {
  var ctrl = this;
  ctrl.details = {};

  ctrl.signup = function () {
    brethrenService.addUser(ctrl.details).success(function () {
      authService.authenticate(ctrl.details, function (authenticated) {
        if (authenticated) {
          console.log("Login succeeded")
          $location.path("/");
          $scope.error = false;
          $rootScope.authenticated = true;
        } else {
          console.log("Login failed")
          $location.path("/signin");
          $scope.error = true;
          $rootScope.authenticated = false;
        }
      })
    });
  }

});