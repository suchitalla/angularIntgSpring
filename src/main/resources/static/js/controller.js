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

app.controller('getcontroller2', function($scope, $http, $location) {
	  $scope.submitForm = function(){
	    var url = $location.absUrl() + "persons/"+$scope.firstName;
	    	   
	    $http.get(url).then(function (response) {
	      $scope.postResultMessage = response.data;
	    }, function error(response) {
	      $scope.postResultMessage = "Error with status: " +  response.statusText;
	    });
	    
	    $scope.firstname = "";
	    $scope.lastname = "";
	  }
	});