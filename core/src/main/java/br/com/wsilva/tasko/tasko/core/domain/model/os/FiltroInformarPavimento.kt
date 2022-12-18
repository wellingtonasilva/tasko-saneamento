package br.com.wsilva.tasko.tasko.core.domain.model.os

data class FiltroInformarPavimento(
    var idUsuario: String?= null,
    var coordLatitude: String?= null,
    var coordLongitude: String?= null,
    var idOrdemServico: Int?= null,
    var idPavimentoRua: Int?= null,
    var idPavimentoCalcada: Int?= null,
    var areaPavimentoRua: String?= null,
    var areaPavimentoCalcada: String?= null,
    var observacao: String?= null,
    var idUnidadeRepavimentadora: Int?= null,
)