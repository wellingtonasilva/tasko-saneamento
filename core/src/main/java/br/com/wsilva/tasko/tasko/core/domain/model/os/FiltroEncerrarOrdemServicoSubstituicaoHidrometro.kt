package br.com.wsilva.tasko.tasko.core.domain.model.os

data class FiltroEncerrarOrdemServicoSubstituicaoHidrometro(
    var idUsuario: String? = null,
    var idFuncionarioExecutor: Int? = null,
    var coordLatitude: String? = null,
    var coordLongitude: String? = null,
    var idOrdemServico: Int? = null,
    var idMotivo: Int? = null,
    var parecer: String? = null,
    var dataEncerramento: String? = null,
    var idFuncionarioResp: String? = null,

    // HM Anterior
    var numeroHidrometroAnterior: String? = null,
    var dataRetiradaHm: String? = null,
    var leituraRetirada: Int? = null,
    var idSituacaoHm: Int? = null,
    var idLocalArmazenagem: Int? = null,

    // HM Novo
    var numeroHidrometroNovo: String? = null,
    var dataInstalacaoHm: String? = null,
    var idTipoMedicao: Int? = null,
    var idLocalInstalacao: Int? = null,
    var idTipoProtecao: Int? = null,
    var idTrocaProtecao: Int? = null,
    var idTrocaRegistro: Int? = null,
    var numLacre: String? = null,
    var leituraInstalacao: Int? = null,
    var idCavalete: Int? = null,

    // Informacoes para geracao de debito
    var idMotivoNaoCobranca: String? = null,
    var percentualCobranca: Int = 0,
    var quantidadeParcelas: Int = 0,
    var valorAtual: Int = 0,
)