var app = angular.module('carson', ['ngRoute','ui.bootstrap']);

app.config(function ($routeProvider, $httpProvider) {
  $routeProvider.when("/", {templateUrl: "view/report.html"});
  $routeProvider.when("/login", {templateUrl: "login.html"});
  
  $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
});

