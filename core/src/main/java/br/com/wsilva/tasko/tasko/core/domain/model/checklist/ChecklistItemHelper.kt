package br.com.wsilva.tasko.tasko.core.domain.model.checklist

data class ChecklistItemHelper (
    var item: ChecklistItem? = null,
    var opcoes: List<ChecklistOpcao> = emptyList(),
    var idOpcaoChecked: Int = -1
)