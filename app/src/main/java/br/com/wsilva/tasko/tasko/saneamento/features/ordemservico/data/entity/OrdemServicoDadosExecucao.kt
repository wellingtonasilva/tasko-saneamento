package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.entity

data class OrdemServicoDadosExecucao(
    var dataExecucao: String? = null,
    var horaInicialExecucao: String? = null,
    var horaFinalExecucao: String? = null,
    var idEquipeExecucao: Int = 0,
    var descricaoEquipeExecucao: String? = null,
)