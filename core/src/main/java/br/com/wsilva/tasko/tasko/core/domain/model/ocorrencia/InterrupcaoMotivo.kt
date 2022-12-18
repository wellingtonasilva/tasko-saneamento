package br.com.wsilva.tasko.tasko.core.domain.model.ocorrencia

class InterrupcaoMotivo(
    var idInterrupcaoMotivo: Int = 0,
    var descricao: String? = null,
    var indicadorEnviarSMSInicio: Int = 0,
    var indicadorEnviarSMSFim: Int = 0,
    var indicadorInicioAtividade: Int = 0,
    var indicadorFimAtividade: Int = 0,
    var indicadorChecklistSaida: Int = 0,
    var indicadorChecklistRetorno: Int = 0,
    var indicadorSolicitarKMInicio: Int = 0,
    var indicadorSolicitarKMFim: Int = 0
)