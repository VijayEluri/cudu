/// <reference path="../../../typings/tsd.d.ts"/>
/// <reference path="../services.d.ts"/>
/// <reference path="../support"/>

module Cudu.Liquidaciones {

  interface LiquidacionGrupoDto { }

  interface LiquidacionesGruposScope extends ng.IScope {
    rondaId: number;
    rondaActual: number;
    grupos: LiquidacionGrupoDto[];
  }

  export class LiquidacionesGruposController {
    constructor(private $scope: LiquidacionesGruposScope,
        private $location: ng.ILocationService,
        private service: LiquidacionesService) {
      this.$scope.rondaActual = service.rondaActual();
      this.cargarDatosRonda(this.$scope.rondaActual);
    }

    verBalance(grupoId: string, rondaId: string) {
      this.$location.path('/liquidaciones/balance/' + grupoId + "/" + rondaId);
    }

    cargarDatosRonda(rondaId: number) {
      this.service.resumenPorGrupos(rondaId).then(g => {
        this.$scope.grupos = g;
        this.$scope.rondaId = rondaId;
      });
    }
  }

  interface LiquidacionBalanceDetalle {
    activos: number;
    ajusteManual: number;
    balance: number;
    borrador: boolean;
    creadoEn: string;
    diferencia: number;
    grupoId: string;
    liquidacionId: number;
    pagado: number;
    precioUnitario: number;
    rondaId: number;
    subtotal: number;
    referencia: string;
  }

  interface InformacionPago {
    concepto: string;
  }

  interface LiquidacionBalanceDto {
    numeroActualAsociados: number;
    total: number;
    balance: LiquidacionBalanceDetalle[];
    informacionPago: InformacionPago;
    nombreGrupo: string;
  }

  interface LiquidacionesBalanceScope extends ng.IScope {
    resumen: LiquidacionBalanceDto;
    totalAjustado: number;
    totalAjustadoAbs: number;
    balancePositivo: boolean;
    grupoId: string;
    rondaId: number;
    informacionPago: InformacionPago;
    rondaEtiqueta: string;
    nombreGrupo: string;
    seleccionada?: LiquidacionBalanceDetalle;
  }

  interface LiquidacionesBalanceRouteParams extends angular.route.IRouteParamsService {
    grupoId: string;
    rondaId: number;
  }

  export class LiquidacionesBalanceController {
    constructor(private $scope: LiquidacionesBalanceScope,
        private $location: ng.ILocationService,
        private $routeParams: LiquidacionesBalanceRouteParams,
        private modalEditarLiquidacion: Cudu.Ux.Modal,
        private service: LiquidacionesService) {
      this.$scope.grupoId = $routeParams.grupoId;
      this.$scope.rondaId = $routeParams.rondaId || service.rondaActual();
      this.$scope.rondaEtiqueta = this.$scope.rondaId + '-' + (1 + parseInt(<any>this.$scope.rondaId));
      this.cargarBalanceGrupo($routeParams.grupoId, this.$scope.rondaId);
      this.modalEditarLiquidacion.subscribe(Cudu.Ux.ModalEvent.BeforeHide, () => this.despuesCerrarModalLiquidacion());
      $scope.$on('$destroy', () => { this.modalEditarLiquidacion.unsubscribe(); });
    }

    cargarBalanceGrupoActual(rondaId: number) {
      this.cargarBalanceGrupo(this.$routeParams.grupoId, rondaId);
    }

    verDesglose(liquidacionId: string) {
      this.$location.path('/liquidaciones/desglose/' + liquidacionId);
    }

    nuevaLiquidacion() {
      this.service.crearLiquidacion(this.$scope.grupoId, this.$scope.rondaId).then(resumen => {
        this.$scope.seleccionada = _.last(resumen.balance);
        this.modalEditarLiquidacion.show();
      });
      // TODO Error
      // .catch(e => { });
    }

    editarLiquidacion(l: LiquidacionBalanceDetalle) {
      // this.$scope.seleccionada = _.clone(liquidacion);
      this.$scope.seleccionada = l;
      this.modalEditarLiquidacion.show();
    }

    eliminarLiquidacion(l: LiquidacionBalanceDetalle) {
      this.$scope.seleccionada = null;
      this.service.eliminarLiquidacion(l.grupoId, l.rondaId, l.liquidacionId).then(() => {
        this.modalEditarLiquidacion.hide();
      });
    }

    guardarLiquidacion(l: LiquidacionBalanceDetalle) {
      // TODO Si se abre como nueva, no guardar, solo recarga de resumen
      var ajusteManual = <any>l.ajusteManual == "0" ? null : l.ajusteManual;
      var pagado = <any>l.pagado == "0" ? null : l.pagado;
      this.service.guardarLiquidacion(l.grupoId, l.rondaId, l.liquidacionId, l.ajusteManual, l.pagado, l.borrador).then(resumen => {
        this.modalEditarLiquidacion.hide();
      });
    }

    crearReferencia(liquidacion: LiquidacionBalanceDetalle) {
      if (!liquidacion) {
        return "";
      }
      return liquidacion.grupoId + "-" + liquidacion.rondaId + "-" + liquidacion.liquidacionId;
    }

    private despuesCerrarModalLiquidacion() {
      this.cargarBalanceGrupo(this.$scope.grupoId, this.$scope.rondaId);
    }

    private cargarBalanceGrupo(grupoId: string, rondaId: number) {
      this.service.balanceGrupo(grupoId, rondaId).then(resumen => {
        this.procesarResumen(resumen, rondaId);
      });
    }

    private procesarResumen(resumen: LiquidacionBalanceDto, rondaId: number) {
      this.$scope.resumen = resumen;
      this.$scope.nombreGrupo = resumen.nombreGrupo;
      this.$scope.totalAjustado = this.limitarTotal(resumen.total);
      this.$scope.totalAjustadoAbs = Math.abs(this.$scope.totalAjustado);
      this.$scope.balancePositivo = resumen.total > 0;
      this.$scope.rondaId = rondaId;
      this.$scope.informacionPago = resumen.informacionPago;
      var ultimaSinPagar = _.findLast(resumen.balance, b => b.pagado === 0);
      if (ultimaSinPagar) {
        this.$scope.informacionPago.concepto = this.crearReferencia(ultimaSinPagar);
      } else {
        this.$scope.informacionPago.concepto = "—";
      }
    }

    private limitarTotal(total: number): number {
      var minimo = Math.min(0, total);
      if (isNaN(minimo)) {
        return 0;
      }
      return minimo;
    }
  }

  interface LiquidacionesDesgloseScope extends ng.IScope {
    hello: string;
  }

  interface LiquidacionesDesgloseRouteParams extends angular.route.IRouteParamsService {
    liquidacionId: string;
  }

  export class LiquidacionesDesgloseController { 
    constructor(private $scope: LiquidacionesDesgloseScope,
        private $routeParams: LiquidacionesDesgloseRouteParams,
        private service: LiquidacionesService) {
    }
  }

  interface LiquidacionesService {
    rondaActual(): number;
    resumenPorGrupos(rondaId: number): ng.IPromise<LiquidacionGrupoDto[]>;
    balanceGrupo(grupoId: string, rondaId: number): ng.IPromise<LiquidacionBalanceDto>;
    crearLiquidacion(grupoId: string, rondaId: number): ng.IPromise<LiquidacionBalanceDto>;
    eliminarLiquidacion(grupoId: string, rondaId: number, liquidacionId: number): ng.IPromise<LiquidacionBalanceDto>;
    guardarLiquidacion(grupoId: string, rondaId: number, liquidacionId: number, ajusteManual: number, pagado: number, borrador: boolean): ng.IPromise<LiquidacionBalanceDto>
  }

  class LiquidacionesServiceImpl implements LiquidacionesService {
    constructor(private http: ng.IHttpService) { }

    rondaActual(): number {
      var m = moment();
      if (m.month() >= 8) {
        return m.year();
      }
      return m.year() - 1;
    }

    resumenPorGrupos(rondaId: number): ng.IPromise<LiquidacionGrupoDto[]> {
      return this.http.get<LiquidacionGrupoDto[]>("/api/liquidaciones/grupos/" + rondaId).then(g => g.data);
    }

    balanceGrupo(grupoId: string, rondaId: number) {
      return this.http.get<LiquidacionBalanceDto>("/api/liquidaciones/balance/" + grupoId + '/' + rondaId).then(g => g.data);
    }

    crearLiquidacion(grupoId: string, rondaId: number) {
      return this.http.post("/api/liquidaciones/balance/" + grupoId + '/' + rondaId, {}).then(f => f.data);
    }

    eliminarLiquidacion(grupoId: string, rondaId: number, liquidacionId: number) {
      return this.http.delete("/api/liquidaciones/balance/" + grupoId + '/' + rondaId + "/" + liquidacionId);
    }

    guardarLiquidacion(grupoId: string, rondaId: number, liquidacionId: number, ajusteManual: number, pagado: number, borrador: boolean) {
      var payload = { id: liquidacionId, ajusteManual: ajusteManual, pagado: pagado, borrador: borrador };
      return this.http.put("/api/liquidaciones/balance/" + grupoId + '/' + rondaId + "/" + liquidacionId, payload).then(f => f.data);
    }
  }

  export function LiquidacionesServiceFactory($http: ng.IHttpService) : LiquidacionesService {
    return new LiquidacionesServiceImpl($http);
  }
}

angular.module('cuduApp')
  .factory('LiquidacionesService', ['$http', Cudu.Liquidaciones.LiquidacionesServiceFactory])
  .factory('ModalEditarLiquidacion', Cudu.Ux.ModalFactory("#dlgEditarLiquidacion"))
  .controller('LiquidacionesGruposController', ['$scope', '$location', 'LiquidacionesService', Cudu.Liquidaciones.LiquidacionesGruposController])
  .controller('LiquidacionesBalanceController', ['$scope', '$location', '$routeParams', 'ModalEditarLiquidacion', 'LiquidacionesService', Cudu.Liquidaciones.LiquidacionesBalanceController])
  .controller('LiquidacionesDesgloseController', ['$scope', '$routeParams', 'LiquidacionesService', Cudu.Liquidaciones.LiquidacionesDesgloseController]);
