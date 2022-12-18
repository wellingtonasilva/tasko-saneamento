package br.com.wsilva.tasko.tasko.core.domain.model.os

import java.util.Date

data class OrdemServicoRemanejamento(
    var idOrdemServicoReligacao: Int = 0,
    var dataRemanejamento: Date? = null,
    var horaRemanejamento: String? = null,
    var idFuncionario: String? = null,
    var numeroHidrometro: String? = null,
    var dataInstalacaoHidrometro: Date? = null,
    var idLocalInstalacaoHidrometro: Int = 0,
    var idProtecaoHidrometro: Int = 0,
    var leituraInstalacao: Int = 0,
    var numeroSelo: String? = null,
    var indicadorCavalete: String? = null,
    var idOrdemServico: Int = 0,
    var indicadorTrocaRegistro: Int = 0,
    var indicadorTrocaProtecao: Int = 0,
    var idEquipeExecucao: Int = 0,
    var descricaoEquipeExecucao: String? = null,
    var indicadorEnvio: Int = 0
)