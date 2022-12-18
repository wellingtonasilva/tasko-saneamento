package br.com.wsilva.tasko.tasko.core.domain.model.os

data class LocalOcorrencia(
    var idLocalOcorrencia: Int,
    var descricaoLocalOcorrencia: String,
    var indicadorRua: Int,
    var indicadorCalcada: Int,
)