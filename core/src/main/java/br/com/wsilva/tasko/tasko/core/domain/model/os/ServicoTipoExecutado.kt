package br.com.wsilva.tasko.tasko.core.domain.model.os

data class ServicoTipoExecutado(
    var idServicoTipo: Int,
    var descricaoServicoTipo: String,
    var indicadorPavimento: Int = 0,
    var indicadorVistoria: Int = 0
)