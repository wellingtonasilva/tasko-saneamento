package br.com.wsilva.tasko.tasko.core.domain.model.checklist

class Funcionarios(
    var idFuncionario: Int = 0,
    var matricula: Int = 0,
    var nomeFuncionario: String? = null,
    var nomeSetor: String? = null,
    var numeroCNH: String? = null,
    var senha: String? = null,
    var isAtivo: Boolean = false
)