package br.com.wsilva.tasko.tasko.core.domain.model.os

data class FiltroGerarOrdemServico(
    var imei: String? = null,
    var latitude: String? = null,
    var longitude: String? = null,
    var usuario: String? = null,
    var idOrdemServicoAvulsa: Int = 0,
    var idEquipe: Int = 0,
    var idUsuario: Int = 0,
    var idFuncionario: Int = 0,
    var idServicoTipo: Int = 0,
    var descricaoServicoTipo: String? = null,
    var idImovel: Int? = null,
    var observacao: String? = null,
    var dataRoteiro: String? = null,
)