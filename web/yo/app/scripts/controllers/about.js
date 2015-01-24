'use strict';

/**
 * @ngdoc function
 * @name yoApp.controller:AboutCtrl
 * @description
 * # AboutCtrl
 * Controller of the yoApp
 */
angular.module('yoApp')
  .controller('AboutCtrl', function ($scope, $http) {

    $http.get('http://localhost:8080/angularSoup-web/rest/test/bar').
    success(function(data) {
      console.log(data);
      $scope.barData = data;
    });

    $scope.refreshTime = function() {
      $http.get('http://localhost:8080/angularSoup-web/rest/test/time').
      success(function(data) {
        console.log(data);
        $scope.time = data.time;
      });

    };

    $scope.refreshTime();

  });
