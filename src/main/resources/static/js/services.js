app.factory('lodgeService', function ($http) {

  var service = {};
  
  service.findAll = function() {
    return $http.get('/lodges/all');
  };

  return service;
});

app.factory('reportService', function ($http) {

  var service = {};
  
  service.findAll = function() {
    return $http.get('/reports/all');
  };

  return service;
});
