package br.com.wsilva.tasko.tasko.core.domain.model.os

data class FiltroBasico(
    var imei: String? = null,
    var latitude: String? = null,
    var longitude: String? = null,
    var usuario: String? = null,
)