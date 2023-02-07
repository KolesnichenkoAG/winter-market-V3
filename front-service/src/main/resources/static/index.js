angular.module('market', []).controller('indexController', function ($scope, $http) {

    $scope.fillTable = function () {
        $http.get('http://localhost:8190/winter-product/api/v1/products')
            .then(function (response) {
                $scope.productsList = response.data;
                // console.log(response);
            });
    };

    $scope.deleteProduct = function (productId) {
        $http.delete('http://localhost:8190/winter-product/api/v1/products/' + productId)
            .then(function (response) {
                $scope.fillTable();
            });
    }

    $scope.createNewProduct = function () {
        // console.log($scope.newProduct);
        $http.post('http://localhost:8190/winter-product/api/v1/products', $scope.newProduct)
            .then(function (response) {
                $scope.newProduct = null;
                $scope.fillTable();
            });
    }

    $scope.fillTable();
});