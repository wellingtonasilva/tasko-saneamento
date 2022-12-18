package br.com.wsilva.tasko.tasko.core.domain.model.os

data class EquipeComponentes(
    var idEquipe: Int = 0,
    var idEquipeComponente: Int = 0,
    var indicadorResponsavel: Int = 0,
    var nomeComponente: String? = null,
    var idFuncionario: String? = null,
)