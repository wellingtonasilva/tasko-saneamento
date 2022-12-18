package br.com.wsilva.tasko.tasko.core.domain.model.ocorrencia

data class Interrupcao(
    var dataMovimento: String? = null,
    var nomeEquipe: String? = null,
    var matricula: Int = 0,
    var numeroOS: Int = 0,
    var idInterrupcaoMotivo: Int = 0,
    var descricaoInterrupcaoMotivo: String? = null,
    var observacaoInicio: String? = null,
    var observacaoFim: String? = null,
    var dataInicio: String? = null,
    var horaInicio: String? = null,
    var dataFim: String? = null,
    var horaFim: String? = null,
    var indicadorAtivo: Int = 0,
    var indicadorEnviouSMSInicio: Int = 0,
    var indicadorEnviouSMSFim: Int = 0,
    var kmInicial: Int = 0,
    var kmFinal: Int = 0,
    var indicadorInicioAtividade: Boolean = false,
    var indicadorFimAtividade: Boolean = false,
    var indicadorChecklistSaida: Boolean = false,
    var indicadorChecklistRetorno: Boolean = false,
    var indicadorSolicitarKMInicio: Boolean = false,
    var indicadorSolicitarKMFim: Boolean = false
)