package br.com.wsilva.tasko.tasko.core.domain.model.os

import java.util.*

data class Foto(
    var numeroOS : Int = 0,
    var nomeFoto: String? = null,
    var descricaoFoto: String? = null,
    var tipoFoto : Int = 0,
    var latitude: String? = null,
    var longitude: String? = null,
    var dataFoto: Date? = null,
    var horaFoto: String? = null,
    var idEquipeExecucao : Int = 0,
    var descricaoEquipeExecucao: String? = null,
    var indicadorEnvio : Int = 0,
    var numeroFoto : Int = 0,
    var image: String,
    var filename: String? = null,
)