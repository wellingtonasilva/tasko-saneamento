package br.com.wsilva.tasko.tasko.core.domain.model.os

import java.util.*

data class GPSCoordenadas(
    var data: Date? = null,
    var hora: String? = null,
    var latitude: Double? = null,
    var longitude: Double? = null,
    var idEquipe: Int,
    var idEquipeExecucao: Int,
    var descricaoEquipeExecucao: String? = null,
    var indicadorEnvio: Int = 0
)