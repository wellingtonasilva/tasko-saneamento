package br.com.wsilva.tasko.tasko.core.domain.model.os

data class Vala(
    var numeroOS: Int = 0,
    var numeroVala: Int = 0,
    var idLocalOcorrencia: Int = 0,
    var descricaoLocalOcorrencia: String? = null,
    var idPavimento: Int = 0,
    var descricaoPavimento: String? = null,
    var comprimento: Double? = null,
    var largura: Double? = null,
    var profundidade: Double? = null,
    var indicadorAterro: Int = 0,
    var indicadorEntulho: Int = 0,
    var quantidadeBags: Int = 0,
    var indicadorAterradoPelaEquipe: Int = 0,
    var idEquipeExecucao: Int = 0,
    var descricaoEquipeExecucao: String? = null,
    var indicadorEnvio: Int = 0,
    var indicadorFotoValaAberta: Int = 0,
    var indicadorFotoValaFechada: Int = 0,
    var idPavimentoRua: Int = 0,
    var descricaoPavimentoRua: String? = null,
    var idPavimentoCalcada: Int = 0,
    var descricaoPavimentoCalcada: String? = null
)