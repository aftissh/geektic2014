var app = angular.module("geektic", ['ngRoute']);

app.controller('HelloCtrl', function($scope, $http) {
    $http.get('/api/hello').success(function(helloMessage) {
        $scope.helloMessage = helloMessage;
    });
});

app.controller('Recherche', function($scope, $http) {
    $http.get('/geek-list.html').success(function(helloMessage) {
    $scope.helloMessage = helloMessage;
});


app.config(['$routeProvider', function ($routeProvider) {
    $routeProvider
        .when('/', {
            templateUrl: '/main.html',
            controller: 'Recherche'
        })
        .when('/list', {
            templateUrl: '/geek-list.html',
            controller: 'GeekListCtrl'
        })
        .when('/details', {
            templateUrl: '/geek-details.html',
            controller: 'GeekDetailsCtrl'
        })
        .otherwise({
            redirectTo: '/main.html'
        });
}]);

