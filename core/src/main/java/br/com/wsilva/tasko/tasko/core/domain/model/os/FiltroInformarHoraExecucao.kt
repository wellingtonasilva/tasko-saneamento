package br.com.wsilva.tasko.tasko.core.domain.model.os

data class FiltroInformarHoraExecucao(
    var idUsuario: String? = null,
    var coordLatitude: String? = null,
    var coordLongitude: String? = null,
    var idOrdemServico: Int? = null,
    var dataExecucao: String? = null,
    var inicioExecucao: String? = null,
    var fimExecucao: String? = null,
    var idAtividade: String? = null,
)