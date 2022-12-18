package br.com.wsilva.tasko.tasko.core.domain.model.os

data class FiltroEncerrarOrdemServico(
    var idUsuario: String? = null,
    var idFuncinarioExecutor: Int? = null,
    var coordLatitude: String? = null,
    var coordLongitude: String? = null,
    var idOrdemServico: Int? = null,
    var idMotivo: Int? = null,
    var parecer: String? = null,
    var dataEncerramento: String? = null
)