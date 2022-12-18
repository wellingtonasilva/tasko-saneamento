package br.com.wsilva.tasko.tasko.core.domain.model.os

data class Material(
    var idMaterial: Int,
    var descricaoMaterial: String,
    var idUnidadeMedida: Int,
    var descricaoUnidadeMedida: String
)