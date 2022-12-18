package br.com.wsilva.tasko.tasko.core.domain.model.os

data class FiltroInserirFoto(
    var imei: String? = null,
    var latitude: String? = null,
    var longitude: String? = null,
    var usuario: String? = null,
    var numeroOS: Int = 0,
    var nomeFoto: String? = null,
    var descricaoFoto: String? = null,
    var tipoFoto: Int = 0,
    var latitudeFoto: String? = null,
    var longitudeFoto: String? = null,
    var dataFoto: String? = null,
    var horaFoto: String? = null,
    var idEquipe: String? = null,
    var descricaoEquipe: String? = null,
    var numeroFoto: Int = 0,
    var image: String? = null,
)