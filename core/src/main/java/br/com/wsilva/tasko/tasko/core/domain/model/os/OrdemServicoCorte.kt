package br.com.wsilva.tasko.tasko.core.domain.model.os

import java.util.Date

data class OrdemServicoCorte(
    var idOrdemServicoCorte: Int = 0,
    var idOrdemServico: Int = 0,
    var dataCorte: Date? = null,
    var horaCorte: String? = null,
    var leituraCorte: Int = 0,
    var numeroSelo: String? = null,
    var idFuncionario: String? = null,
    var numeroHidrometro: String? = null,
    var idMotivoCorte: Int = 0,
    var idCorteTipo: Int = 0,
    var idEquipeExecucao: Int = 0,
    var descricaoEquipeExecucao: String? = null,
    var indicadorEnvio: Int = 0,
)