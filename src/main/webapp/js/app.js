var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});

app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: '../view/main.html',
            controller: 'RechercheCtrl'
        })
        .when('/list', {
            templateUrl: '../view/geek-list.html',
            controller: 'GeekListCtrl'
        })
        .when('/details', {
            templateUrl: '../view/geek-details.html',
            controller: 'GeekDetailsCtrl'
        })
        .otherwise({
            redirectTo: '/'
        });
}]);

app.controller('RechercheCtrl', function($scope, $location) {
    $scope.recherche = function(){
        $location.path('/list');
    }
});

/*app.controller('GeekListCtrl', function($scope, $location) {
    $scope.retour = function(){
        $location.path('/');
    }
});*/

app.controller('GeekDetailsCtrl', function($scope, $location) {
    $scope.retour = function(){
        $location.path('/');
    }
});



app.controller('GeekListCtrl', ['$scope', '$http',
    function ($scope, $http) {
        $http.get('/list').success(function(viewGeek) { $scope.viewGeek = viewGeek; });
    }]);

