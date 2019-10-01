var app = angular.module('app', []);

 
app.controller('getcontroller', function($scope, $http, $location) {
  $scope.getfunction = function(){
    var url = $location.absUrl() + "persons";
    
    $http.get(url).then(function (response) {
      $scope.response = response.data
    }, function error(response) {
      $scope.postResultMessage = "Error with status: " +  response.statusText;
    });
  }
});

app.controller('getController2', function($scope, $http, $location) {
    $scope.submitForm = function(){
        var config = {
            headers : {
                'Content-Type': 'application/json;charset=utf-8;'}}
        var data = {
            id: $scope.id
        };
 
        var url = $location.absUrl() + "persons/" + id;
 
        $http.get(url, data, config).then(function (response) {
        	 $scope.response = response.data
        }, function error(response) {
          $scope.postResultMessage = "Error with status: " +  response.statusText;
        });
    }
});