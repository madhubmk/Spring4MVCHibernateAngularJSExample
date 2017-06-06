'use strict';

App.factory('ItemService', [ '$http', '$q', function($http, $q) {

	return {
		fetchAllItems : function(category) {
			return $http.get('http://localhost:8080/Spring4MVCHibernateAngularJSExample/' + category)
				.then(
					function(response) {
						return response.data;
					},
					function(errResponse) {
						console.error('Error while fetching Items');
						return $q.reject(errResponse);
					}
			);
		}
	};

} ]);