package br.com.wsilva.tasko.tasko.core.domain.model.checklist

data class ChecklistItem(
    var idGrupo: Int = 0,
    var idItem: Int = 0,
    var descricaoItem: String? = null,
    var idOpcaoChecked: Int = 0
)

