package br.com.wsilva.tasko.tasko.core.domain.model.os

class FiltroEncerrarOrdemServicoCorte (
    var idUsuario: String? = null,
    var idFuncinarioExecutor: Int? = null,
    var coordLatitude: String? = null,
    var coordLongitude: String? = null,
    var idOrdemServico: Int? = null,
    var idMotivo: Int? = null,
    var parecer: String? = null,
    var dataEncerramento: String? = null,
    var idFuncionarioResp: String? = null,
    var dataCorte: String? = null,
    var leituraCorte: Int? = null,
    var numLacre: Int? = null,
    var numeroHidrometro: String? = null,
    var idMotivoCorte: Int? = null,
    var idTipoCorte: Int? = null,
    var idMotivoNaoCobranca: String = "",
    var percentualCobranca: Int,
    var quantidadeParcelas: Int,
    var valorAtual: Int
)