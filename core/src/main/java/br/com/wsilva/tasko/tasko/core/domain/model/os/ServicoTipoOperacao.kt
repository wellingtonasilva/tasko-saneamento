package br.com.wsilva.tasko.tasko.core.domain.model.os

data class ServicoTipoOperacao(
    var idServicoTipo: Int,
    var descricaoServicoTipo: String,
    var idOperacao: Int = 0,
    var descricaoOperacao: String? = null
)