'use strict';

var App = angular
    .module("Demo", [ "ngRoute" ])
	.config(function($routeProvider) {
		$routeProvider
			.when("/item/home", {
				templateUrl : "item/home",
				controller : "homeController",
			})
			.when("/item/courses", {
				templateUrl : "item/courses",
				controller : "CustomListController as coursesController",
				resolve:{
					async: ['ItemService','$route', function(ItemService , $route) {
	                    return ItemService.fetchAllItems('courseslist');
	               	}]
				}
			})
			.when('/item/students', {
				templateUrl: 'item/students',
				controller : "CustomListController as studentsController",
				resolve: {
	                async: ['ItemService','$route', function(ItemService , $route) {
	                    return ItemService.fetchAllItems('studentslist');
	               	}]
	            }
			})
			.otherwise({redirectTo:'/item/home'});
	})
	.controller("homeController", function($scope){
		$scope.message = "Home Page";
	})
	
//	.controller("coursesController", function($scope){
//		$scope.courses = ["JAVA","ANGULAR","JSP","JAVASCRIPT"];
//	})
	
//	.controller("studentsController", function($scope, $http){
//		$http.get("http://localhost:8080/Spring4MVCAngularJSRoutingExample/user")
//			 .then(function (response){
//				 $scope.students = response.data;
//				 $log.info(response.data);
//			 })
//	})

