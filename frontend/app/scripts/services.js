'use strict';

var cuduServices = angular.module('cuduServices', ['ngResource']);
 
cuduServices.factory('Asociado', ['$resource',
  function($resource) {
    return $resource('test_data/asociados.json');
    /* return $resource('asociado/:idAsociado', {}, {
      query: { method: 'GET', params: { }, isArray: true }
    }); */
  }]);
  
cuduServices.factory('Grupo', ['$resource',
  function($resource) {
    return $resource('test_data/grupo.json');
    // return $resource('grupo/:idGroup');
  }]);
