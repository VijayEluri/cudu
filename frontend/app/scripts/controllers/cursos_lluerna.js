var Cudu;
(function (Cudu) {
    var Lluerna;
    (function (Lluerna) {
        var Cursos;
        (function (Cursos) {
            var CursosService = (function () {
                function CursosService($http) {
                    this.http = $http;
                }
                CursosService.prototype.listarCursos = function () {
                    var result = this.http.get("/api/lluerna/curso/completo");
                    return result;
                };
                CursosService.$inject = ['$http'];
                return CursosService;
            })();
            Cursos.CursosService = CursosService;
            var CursosController = (function () {
                function CursosController($scope, service) {
                    var _this = this;
                    this.service = service;
                    this.cursos = [];
                    service.listarCursos().success(function (r) { return _this.cursos = r.content; });
                    $scope.cursos = this.cursos;
                }
                CursosController.$inject = ['$scope', 'CursosService'];
                return CursosController;
            })();
            Cursos.CursosController = CursosController;
        })(Cursos = Lluerna.Cursos || (Lluerna.Cursos = {}));
    })(Lluerna = Cudu.Lluerna || (Cudu.Lluerna = {}));
})(Cudu || (Cudu = {}));
angular.module('cuduApp')
    .controller('CursosController', Cudu.Lluerna.Cursos.CursosController)
    .service('CursosService', Cudu.Lluerna.Cursos.CursosService);