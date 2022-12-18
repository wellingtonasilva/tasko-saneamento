package br.com.wsilva.tasko.tasko.core.domain.model.os

data class FiltroInformarAtividade(
    var idUsuario: String? = null,
    var coordLatitude: String? = null,
    var coordLongitude: String? = null,
    var idOrdemServico: Int? = null,
    var idAtividade: Int? = null,
)