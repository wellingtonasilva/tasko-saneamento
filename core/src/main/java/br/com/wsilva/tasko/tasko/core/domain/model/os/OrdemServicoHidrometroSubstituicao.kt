package br.com.wsilva.tasko.tasko.core.domain.model.os

import java.util.*

data class OrdemServicoHidrometroSubstituicao(
    var idOrdemServicoSubstituicaoHM: Int = 0,
    var numerHidrometroAtual: String? = null,
    var indicadorTipoMedicaoAtual: String? = null,
    var dataRetirada: Date? = null,
    var leituraRetirada: Int = 0,
    var idSituacaoHidrometro: Int = 0,
    var idLocalArmazenagemHidrometro: Int = 0,
    var numeroHidrometroNovo: String? = null,
    var dataInstalacaoHidrometroNovo: Date? = null,
    var indicadorTipoMedicao: String? = null,
    var idLocalInstalacaoHidrometro: Int = 0,
    var idProtecaoHidrometro: Int = 0,
    var indicadorTrocaProtecao: Int = 0,
    var indicadorTrocaRegistro: Int = 0,
    var leituraInstalacao: Int = 0,
    var numeroSelo: String? = null,
    var indicadorCavalete: String? = null,
    var idFuncionario: String? = null,
    var idOrdemServico: Int = 0,
    var idTipoSubstituicaoHM: Int = 0,
    var horaInstalacaoHidrometroNovo: String? = null,
    var idEquipeExecucao: Int = 0,
    var descricaoEquipeExecucao: String? = null,
    var indicadorEnvio: Int = 0,
)