package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.entity

data class OrdemServicoDadosEncerramento(
    var dataEncerramentoOS: String? = null,
    var horaEncerramentoOS: String? = null,
    var idMotivoEncerramento: Int? = 0,
    var descricaoMotivoEncerramento: String? = null,
    var parecerEncerramento: String? = null,
)
