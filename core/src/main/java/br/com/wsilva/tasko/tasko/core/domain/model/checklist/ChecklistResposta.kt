package br.com.wsilva.tasko.tasko.core.domain.model.checklist

data class ChecklistResposta (
    var data: String? = null,
    var placaVeiculo: String? = null,
    var idGrupo: Int = 0,
    var idItem: Int = 0,
    var idOpcaoSaida: Int = 0,
    var dataSaida: String? = null,
    var horaSaida: String? = null,
    var idOpcaoRetorno: Int = 0,
    var dataRetorno: String? = null,
    var horaRetorno: String? = null
)