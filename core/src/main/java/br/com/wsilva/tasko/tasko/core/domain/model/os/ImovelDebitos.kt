package br.com.wsilva.tasko.tasko.core.domain.model.os

import java.util.*

data class ImovelDebitos(
    var idImovelDebitos: Int,
    var idImovel: Int,
    var referencia: Int,
    var dataVencimento: Date? = null,
    var descricaoTipoDocumento: String? = null,
    var valorDocumento: Double? = null,
    var valorAcrescimento: Double? = null,
    var valorTotal: Double? = null,
    var numeroDiasVencido: Int = 0
)