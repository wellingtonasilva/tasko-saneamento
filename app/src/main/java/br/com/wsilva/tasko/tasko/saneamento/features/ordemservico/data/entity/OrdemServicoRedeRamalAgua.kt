package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.entity

data class OrdemServicoRedeRamalAgua(
    var tipoRede: Int = 0,
    var descricaoTipoRede: String? = null,
    var idDiametroRede: Int = 0,
    var descricaoDiametroRede: String? = null,
    var idMaterialRede: Int = 0,
    var descricaoMaterialRede: String? = null,
    var profundidadeRede: String? = null,
    var pressaoRede: String? = null,
    var idAgenteExterno: Int = 0,
    var agenteExterno: String? = null,
    var idCausaRede: Int = 0,
    var descricaoCausaRede: String? = null,
    var idUsuario: Int = 0,
    var descricaoUsuario: String? = null,
)
