package br.com.wsilva.tasko.tasko.core.domain.model.os

data class FiltroEncerrarOrdemServicoInstalacaoHidrometro(
    var idUsuario: String? = null,
    var idFuncionarioExecutor: Int? = null,
    var coordLatitude: String? = null,
    var coordLongitude: String? = null,
    var idOrdemServico: Int? = null,
    var idMotivo: Int? = null,
    var parecer: String? = null,
    var dataEncerramento: String? = null,
    var numeroHidrometro: String? = null,
    var idFuncionarioResp: String? = null,
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
    var percentualCobranca: Int,
    var quantidadeParcelas: Int = 0,
    var valorAtual: Int = 0
)