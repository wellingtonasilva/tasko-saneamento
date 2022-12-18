package br.com.wsilva.tasko.tasko.core.domain.model.os

import java.util.*

data class OrdemServicoHidrometroInstalacao(
    var idOrdemServicoInstalacaoHM: Int = 0,
    var numeroHidrometro: String? = null,
    var dataInstalacaoHidrometro: Date? = null,
    var idTipoMedicao: String? = null,
    var idLocalInstalacaoHidrometro: Int = 0,
    var idProtecaoHidrometro: Int = 0,
    var idOrdemServico: Int = 0,
    var indicadorTrocaProtecao: Int = 0,
    var indicadorTrocaRegistro : Int = 0,
    var leituraInstalacao: Int = 0,
    var numeroSelo: String? = null,
    var indcadorCavalete: String? = null,
    var idFuncionario: String? = null,
    var idTipoInstalacaoHM: Int = 0,
    var horaInstalacaoHidrometro: String? = null,
    var idEquipeExecucao: Int = 0,
    var descricaoEquipeExecucao: String? = null,
    var indicadorEnvio : Int = 0
)