app.factory('lodgeService', function ($http) {

  var service = {};
  
  service.findAll = function() {
    return $http.get('/lodges');
  };

  return service;
});