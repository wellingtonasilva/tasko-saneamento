package br.com.wsilva.tasko.tasko.core.domain.model.checklist

data class Veiculos (
    var numeroPlacaVeiculo: String? = null,
    var modelo: String? = null,
    var tipoVeiculo: String? = null,
    var marca: String? = null,
    var kmAcumulada: Int = 0,
    var dataUltimaRevisao: String? = null
)