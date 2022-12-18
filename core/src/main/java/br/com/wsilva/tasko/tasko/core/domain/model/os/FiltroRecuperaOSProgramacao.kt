package br.com.wsilva.tasko.tasko.core.domain.model.os

data class FiltroRecuperaOSProgramacao(
    var imei: String? = null,
    var latitude: String? = null,
    var longitude: String? = null,
    var usuario: String? = null,
    var dataRoteiro: String = "",
    var idEquipe: Int,
    var idServicoTipo: Int,
    var idRegistroAtendimento: Int,
    var idOrdemServico: Int,
    var idImovel: Int,
    var nomeLogradouro: String,
    var nomeBairro: String,
    var nomeCidade: String,
    var nomeCliente: String,
)    