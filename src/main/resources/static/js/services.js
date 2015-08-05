app.factory('lodgeService', function ($http) {

  var service = {};

  service.findAll = function () {
    return $http.get('/lodges/all');
  };

  return service;
});

app.factory('reportService', function ($http) {

  var service = {};

  service.findAll = function () {
    return $http.get('/reports/all');
  };

  return service;
});

app.factory('brethrenService', function ($http) {

  var service = {};

  service.addUser = function (user) {
    return $http.post('/brethren/add', user);
  }

  return service;
});

app.factory('authService', function ($http, $rootScope) {

  var service = {};

  service.authenticate = function (credentials, callback) {

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
  
  service.logout = function (callback) {
    $http.post('/auth/logout', {}).success(function () {
      $rootScope.authenticated = false;
      callback && callback();
    }).error(function (data) {
      console.log("Logout failed")
    });
  }

  return service;
});