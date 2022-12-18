package br.com.wsilva.tasko.tasko.core.domain.model.checklist

data class Checklist(
    var dataMovimento: String? = null,
    var tipoVeiculo: String? = null,
    var matricula: Int = 0,
    var nomeCondutor: String? = null,
    var nomeSetor: String? = null,
    var dataSaida: String? = null,
    var horaSaida: String? = null,
    var kmSaida: Int = 0,
    var dataRetorno: String? = null,
    var horaRetorno: String? = null,
    var kmRetorno: Int = 0,
    var numeroPlacaVeiculo: String? = null,
    var finalizouSaida: Int = 0,
    var finalizouRetorno: Int = 0,
    var numeroCNH: String? = null
)