package br.com.wsilva.tasko.tasko.core.domain.model.os

import java.util.*

data class Imovel(
    var idImovel : Int = 0,
    var idSituacaoLigacaoAgua : Int = 0,
    var descricaoSituacaoLigacaoAgua: String? = null,
    var idSituacaoLigacaoEsgoto : Int = 0,
    var descricaoSituacaoLigacaoEsgoto: String? = null,
    var numeroInscricao: String? = null,
    var nomeClienteResponsavel: String? = null,
    var nomeClienteUsuario: String? = null,
    var nomeClienteProprietario: String? = null,
    var numeroCortes : Int = 0,
    var numeroSupressoes : Int = 0,
    var numeroReparcelamentos : Int = 0,
    var diaVencimento : Int = 0,
    var indicadorSituacaoEspecialCobranca : Int = 0,
    var indicadorSituacaoEspecialFaturamento : Int = 0,
    var idGrupoFaturamento : Int = 0,
    var numeroRota : Int = 0,
    var sequenciaRota : Int = 0,
    var dataLigacao: Date? = null,
    var numeroHidrometro: String? = null,
    var dataInstalacaoHidrometro: Date? = null,
)