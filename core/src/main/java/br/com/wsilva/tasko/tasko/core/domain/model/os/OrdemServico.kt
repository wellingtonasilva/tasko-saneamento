package br.com.wsilva.tasko.tasko.core.domain.model.os

data class OrdemServico(
    val id: String,
    var numeroOS: Int = 0,
    var numeroRA: Int = 0,
    var situacaoOS: Int = 0,
    var situacaoRA: Int = 0,
    var desricaoSituacaoRA: String? = null,
    var descricaoSituacaoOS: String? = null,
    var dataGeracaoOS: String? = null,
    var dataGeracaoRA: String? = null,
    var idTipoServico: Int = 0,
    var descricaoTipoServico: String? = null,
    var observacaoOS: String? = null,
    var observacaoRA: String? = null,
    var idUnidadeGeracao: Int = 0,
    var descricaoUnidadeGeracao: String? = null,
    var idTipoServicoExecutado: Int = 0,
    var descricaoTipoServicoExecutado: String? = null,

    //Dados do Encerramento
    var dataEncerramentoOS: String? = null,
    var horaEncerramentoOS: String? = null,
    var idMotivoEncerramento: Int? = 0,
    var descricaoMotivoEncerramento: String? = null,
    var parecerEncerramento: String? = null,

    //Dados de Execu��o
    var dataExecucao: String? = null,
    var horaInicialExecucao: String? = null,
    var horaFinalExecucao: String? = null,
    var idEquipeExecucao: Int? = 0,
    var descricaoEquipeExecucao: String? = null,

    //Dados Rede/Ramal de �gua
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

    //Endere�o
    var logradouro: String? = null,
    var bairro: String? = null,
    var numeroImovel: String? = null,
    var idCliente: Int = 0,
    var idImovel: Int = 0,
    var nomeCliente: String? = null,
    var dataCancelamento: String? = null,
    var horaCancelamento: String? = null,
    var idTipoServicoGerar: Int = 0,
    var descricaoTipoServicoGerar: String? = null,
    var idMovimentoRecebito: Int = 0,
    var idColetorEnvioItem: Int = 0,
    var idColetorEnvio: Int = 0,
    var kmInicial: Int = 0,
    var kmFinal: Int = 0,
    var idOrdemServico: Int = 0,
    var numeroLacreAnterior: Int = 0,
    var numeroLocreNovo: Int = 0,
    var numeroHidrometro: String? = null,
    var leitura: Int = 0,
    var observacaoCampo: String? = null,
    var indicadorOrdemServicoAvulsa: Int = 0,

    /**
     * Adiciona os campos:
     * 1. Setor Comercial
     * 2. Lote
     * 3. Sublote
     * 4. Sequencia na Rota
     * 5. Quadra
     */
    var idSetorComercial: Int = 0,
    var numeroLote: Int = 0,
    var numeroSublote: Int = 0,
    var sequenciaRota: Int = 0,
    var numeroQuadra: String? = null,
    var indicadorEnvio: Int = 0,
    var tipoLogradouro: String? = null,
    var latitude: String? = null,
    var longitude: String? = null,
    var logradouroProximidade: String? = null,
)