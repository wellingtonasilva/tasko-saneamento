package br.com.wsilva.tasko.tasko.core.domain.model.os

data class FiltroInformarOrdemServicoEmAndamento(
    var imei: String? = null,
    var latitude: String? = null,
    var longitude: String? = null,
    var usuario: String? = null,
    var idOrdemServico: Int? = null,
)