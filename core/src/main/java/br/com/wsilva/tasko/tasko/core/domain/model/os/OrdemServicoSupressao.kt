package br.com.wsilva.tasko.tasko.core.domain.model.os

import java.util.Date

data class OrdemServicoSupressao(
    var idOrdemServicoSupressao: Int = 0,
    var idOrdemServico: Int = 0,
    var dataSupressao: Date? = null,
    var horaSupressao: String? = null,
    var leituraSupressao: Int = 0,
    var numeroSelo: String? = null,
    var idFuncionario: String? = null,
    var numeroHidrometro: String? = null,
    var idMotivoSupressao: Int = 0,
    var idSupressaoTipo: Int = 0,
    var idEquipeExecucao: Int = 0,
    var descricaoEquipeExecucao: String? = null,
    var indicadorEnvio: Int = 0,
)