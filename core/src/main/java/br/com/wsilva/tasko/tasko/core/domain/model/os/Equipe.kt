package br.com.wsilva.tasko.tasko.core.domain.model.os

data class Equipe(
    var idEquipe: Int = 0,
    var nomeEquipe: String? = null,
    var numeroPlacaVeiculo: String? = null,
    var cargaHorarioTrabalhoDia: Int = 0
)