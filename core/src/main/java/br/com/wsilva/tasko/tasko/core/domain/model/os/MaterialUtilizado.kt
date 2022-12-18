package br.com.wsilva.tasko.tasko.core.domain.model.os

data class MaterialUtilizado(
    var numeroOS : Int = 0,
    var idMaterial : Int = 0,
    var descricaoMateriall: String? = null,
    var idUnidadeMedida : Int = 0,
    var descricaoUnidadeMedida: String? = null,
    var quantidade: Double? = null,
    var idEquipeExecucao : Int = 0,
    var descricaoEquipeExecucao: String? = null,
    var indicadorEnvio : Int = 0,
    var idAtividade : Int = 0,
    var descricaoAtividade: String? = null,
    var idEstoque : Int = 0,
    var descricaoEstoque: String? = null,
)