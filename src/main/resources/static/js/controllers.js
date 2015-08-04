app.controller('navController', function ($location, $http, $rootScope, $scope) {
    var ctrl = this;
    
    ctrl.isNew = false;
    
    ctrl.isActive = function (viewLocation) { 
        return viewLocation === $location.path();
    };
    
    ctrl.authenticate = function (credentials, callback) {

    var headers = credentials ? {
      authorization: "Basic "
              + btoa(credentials.email + ":"
                      + credentials.password)
    } : {};

    $http.get('/auth/user', {
      headers: headers
    }).success(function (data) {
      if (data.name) {
        $rootScope.authenticated = true;
      } else {
        $rootScope.authenticated = false;
      }
      callback && callback($rootScope.authenticated);
    }).error(function () {
      $rootScope.authenticated = false;
      callback && callback(false);
    });

  }

  ctrl.authenticate();

  ctrl.credentials = {};

  ctrl.login = function () {
    ctrl.authenticate(ctrl.credentials, function (authenticated) {
      if (authenticated) {
        console.log("Login succeeded")
        $location.path("/");
        $scope.error = false;
        $rootScope.authenticated = true;
      } else {
        console.log("Login failed")
        $location.path("/login");
        $scope.error = true;
        $rootScope.authenticated = false;
      }
    })
  };

  ctrl.logout = function () {
    $http.post('/auth/logout', {}).success(function () {
      $rootScope.authenticated = false;
      $location.path("/");
    }).error(function (data) {
      console.log("Logout failed")
      $rootScope.authenticated = false;
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

app.controller('signupController', function () {
    var ctrl = this;
});