package br.com.wsilva.tasko.tasko.core.domain.model.os

data class FiltroInformarMaterial(
    var idUsuario: String? = null,
    var coordLatitude: String? = null,
    var coordLongitude: String? = null,
    var idOrdemServico: Int? = null,
    var idMaterial: Int? = null,
    var quantidade: Int? = null,
    var idAtividade: String? = null,
    var idEstoque: Int? = null,
)