package br.com.wsilva.tasko.tasko.core.domain.model.checklist

data class ChecklistGrupoFinalizado (
    var idGrupo: Int = 0,
    var idChecklist: Int = 0,
    var finalizouSaida: Int = 0,
    var finalizouRetorno: Int = 0,
)