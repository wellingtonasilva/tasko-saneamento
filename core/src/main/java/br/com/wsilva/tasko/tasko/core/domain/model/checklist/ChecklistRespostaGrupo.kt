package br.com.wsilva.tasko.tasko.core.domain.model.checklist

data class ChecklistRespostaGrupo(
    var idGrupo: Int = 0,
    var dataMovimento: String? = null,
    var salvouSaida: Int = 0,
    var salvouRetorno: Int = 0
)