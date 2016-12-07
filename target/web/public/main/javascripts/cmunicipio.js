// Main cmunicipio module
var cmunicipio = angular.module('myApp', ['ui.bootstrap', 'confirmDialogBoxModule']);

cmunicipio.controller('munCtrl', function($scope, $http, $timeout, $uibModal, municipioService) {

 $scope.muns = [];

    function getAllMunicipio() {
       municipioService.getAll().then(function(res){
             $scope.muns = res.data;
        }, function(err){
           // error
        });
     }
     
 
    getAllMunicipio();

    $scope.alerts = [];

    function showAlertMessage(status, message) {
              if(status == "success") {
                    $scope.alerts.push({type: "alert-success", title: "SUCCESS", content: message});
              } else if(status == "error") {
                     $scope.alerts.push({type: "alert-danger", title: "ERROR", content: message});
              }
    };

  });


/**
 * Directive for alert notification. You can also use angular ui-bootstrap for better alert notifications
 */
cmunicipio.directive('notification', function($timeout){
  return {
    restrict: 'E',
    replace: true,
    scope: {
      ngModel: '='
    },
    template: '<div ng-class="ngModel.type" class="alert alert-box">{{ngModel.content}}</div>',
     link: function(scope, element, attrs) {
          $timeout(function(){
            element.hide();
          }, 3000);
      }
  }
});



cmunicipio.service("municipioService", function($http, $q) {

   var task = this;
   task.taskList = {};

   task.getAll = function() {
          var defer = $q.defer();
          $http.get('/municipio/list')
          .success(function(res){
                task.taskList = res;
                defer.resolve(res);
           })
           .error(function(err, status){
              defer.reject(err);
           });

         return defer.promise;
     }

   return task;

 });


/**
 * Module for confirm dialog box
 * To use this, add this module as a dependency in app module.
 */
angular.module('confirmDialogBoxModule', ['ui.bootstrap'])
  .directive('ngConfirmClick', ['$uibModal', function($uibModal) {

      var modalInstanceCtrl = function($scope, $uibModalInstance) {
        $scope.ok = function() {
          $uibModalInstance.close();
        };

        $scope.cancel = function() {
          $uibModalInstance.dismiss('cancel');
        };
      };

      return {
        restrict: 'A',
        scope:{
          ngConfirmClick:"&"
        },
        link: function(scope, element, attrs) {
          element.bind('click', function() {
            var message = attrs.ngConfirmMessage || "Are you sure ?";

            // Template for confirmation dialog box
            var modalHtml = '<div class="modal-body">' + message + '</div>';
            modalHtml += '<div class="modal-footer"><button class="btn btn-primary" ng-click="ok()">OK</button><button class="btn btn-default" ng-click="cancel()">Cancel</button></div>';

            var modalInstance = $uibModal.open({
              template: modalHtml,
              controller: modalInstanceCtrl
            });

            modalInstance.result.then(function() {
              scope.ngConfirmClick();
            }, function() {
              //Modal dismissed
            });
          });

        }
      }
    }
  ]);
