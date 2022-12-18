package br.com.wsilva.tasko.tasko.core.domain.model.checklist

data class ChecklistOpcao (
    var idGrupo: Int = 0,
    var idItem: Int = 0,
    var idOpcao: Int = 0,
    var descricaoOpcao: String? = null
)