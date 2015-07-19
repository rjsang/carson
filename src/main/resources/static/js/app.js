var app = angular.module('carson', ['ui.bootstrap']);

app.config(function ($httpProvider) {

  $httpProvider.defaults.headers.common['X-Requested-With'] = 'XMLHttpRequest';
});

