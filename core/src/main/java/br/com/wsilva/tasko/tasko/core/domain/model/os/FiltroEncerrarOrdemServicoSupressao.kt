package br.com.wsilva.tasko.tasko.core.domain.model.os

data class FiltroEncerrarOrdemServicoSupressao(
    var idUsuario: String? = null,
    var idFuncionarioExecutor: Int? = null,
    var coordLatitude: String? = null,
    var coordLongitude: String? = null,
    var idOrdemServico: Int? = null,
    var idMotivo: Int? = null,
    var parecer: String? = null,
    var dataEncerramento: String? = null,
    var idFuncionarioResp: String? = null,
    var dataSupressao: String? = null,
    var numLacre: Int? = null,
    var leituraSupressao: Int? = null,
    var idMotivoSupressao: Int? = null,
    var idTipoSupressao: Int? = null,
    var idMotivoNaoCobranca: String? = null,
    var percentualCobranca: Int = 0,
    var quantidadeParcelas: Int = 0,
    var valorAtual: Int = 0
)