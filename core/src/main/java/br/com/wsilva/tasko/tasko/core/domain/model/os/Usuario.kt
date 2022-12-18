package br.com.wsilva.tasko.tasko.core.domain.model.os

data class Usuario(
    var idUsuario: Int,
    var login: String,
    var nome: String,
    var senha: String
)