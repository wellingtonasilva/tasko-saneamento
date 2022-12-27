package br.com.wsilva.tasko.tasko.core.domain.model.os

data class OrdemServico(
    val id: String,
    var numeroOS: String = "",
    var numeroRA: String = "",
    var situacaoOS: String =  "",
    var situacaoRA: String = "",
    var desricaoSituacaoRA: String? = null,
    var descricaoSituacaoOS: String? = null,
    var dataGeracaoOS: String? = null,
    var dataGeracaoRA: String? = null,
    var idTipoServico: String = "",
    var descricaoTipoServico: String? = null,
    var observacaoOS: String? = null,
    var observacaoRA: String? = null,
    var idUnidadeGeracao: String = "0",
    var descricaoUnidadeGeracao: String? = null,
    var idTipoServicoExecutado: String = "0",
    var descricaoTipoServicoExecutado: String? = null,

    //Dados do Encerramento
    var dataEncerramentoOS: String? = null,
    var horaEncerramentoOS: String? = null,
    var idMotivoEncerramento: String = "0",
    var descricaoMotivoEncerramento: String? = null,
    var parecerEncerramento: String? = null,

    //Dados de Execu��o
    var dataExecucao: String? = null,
    var horaInicialExecucao: String? = null,
    var horaFinalExecucao: String? = null,
    var idEquipeExecucao: String = "0",
    var descricaoEquipeExecucao: String? = null,

    //Dados Rede/Ramal de �gua
    var tipoRede: String = "0",
    var descricaoTipoRede: String? = null,
    var idDiametroRede: String = "0",
    var descricaoDiametroRede: String? = null,
    var idMaterialRede: String = "0",
    var descricaoMaterialRede: String? = null,
    var profundidadeRede: String? = null,
    var pressaoRede: String? = null,
    var idAgenteExterno: String = "0",
    var agenteExterno: String? = null,
    var idCausaRede: String = "0",
    var descricaoCausaRede: String? = null,
    var idUsuario: String = "0",
    var descricaoUsuario: String? = null,

    //Endere�o
    var logradouro: String? = null,
    var bairro: String? = null,
    var numeroImovel: String? = null,
    var idCliente: String = "0",
    var idImovel: String = "0",
    var nomeCliente: String? = null,
    var dataCancelamento: String? = null,
    var horaCancelamento: String? = null,
    var idTipoServicoGerar: String = "0",
    var descricaoTipoServicoGerar: String? = null,
    var idMovimentoRecebito: String = "0",
    var idColetorEnvioItem: String = "0",
    var idColetorEnvio: String = "0",
    var kmInicial: String = "0",
    var kmFinal: String = "0",
    var idOrdemServico: String = "0",
    var numeroLacreAnterior: String = "0",
    var numeroLocreNovo: String = "0",
    var numeroHidrometro: String? = null,
    var leitura: String = "0",
    var observacaoCampo: String? = null,
    var indicadorOrdemServicoAvulsa: String = "0",

    /**
     * Adiciona os campos:
     * 1. Setor Comercial
     * 2. Lote
     * 3. Sublote
     * 4. Sequencia na Rota
     * 5. Quadra
     */
    var idSetorComercial: String = "0",
    var numeroLote: String = "0",
    var numeroSublote: String = "0",
    var sequenciaRota: String = "0",
    var numeroQuadra: String? = null,
    var indicadorEnvio: String = "0",
    var tipoLogradouro: String? = null,
    var latitude: String? = null,
    var longitude: String? = null,
    var logradouroProximidade: String? = null,
)