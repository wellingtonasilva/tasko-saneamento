package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico

@Entity(tableName = "ordem_servico")
data class OrdemServicoEntity(
    @PrimaryKey(autoGenerate = false) val id: String,
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
    @Embedded
    var dadosEncerramento: OrdemServicoDadosEncerramento?,

    //Dados de Execu��o
    @Embedded
    var ordemServicoDadosExecucao: OrdemServicoDadosExecucao?,

    //Dados Rede/Ramal de �gua
    @Embedded
    var ordemServicoRedeRamalAgua: OrdemServicoRedeRamalAgua?,

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
) {
    companion object {
        fun from(ordemServico: OrdemServico): OrdemServicoEntity {
            return OrdemServicoEntity(
                id = ordemServico.id,
                numeroOS = ordemServico.numeroOS,
                numeroRA = ordemServico.numeroRA,
                situacaoOS = ordemServico.situacaoOS,
                situacaoRA = ordemServico.situacaoRA,
                desricaoSituacaoRA = ordemServico.desricaoSituacaoRA,
                descricaoSituacaoOS = ordemServico.descricaoSituacaoOS,
                dataGeracaoOS = ordemServico.dataGeracaoOS,
                dataGeracaoRA = ordemServico.dataGeracaoRA,
                idTipoServico = ordemServico.idTipoServico,
                descricaoTipoServico = ordemServico.descricaoTipoServico,
                observacaoOS = ordemServico.observacaoOS,
                observacaoRA = ordemServico.observacaoRA,
                idUnidadeGeracao = ordemServico.idUnidadeGeracao,
                descricaoUnidadeGeracao = ordemServico.descricaoUnidadeGeracao,
                idTipoServicoExecutado = ordemServico.idTipoServicoExecutado,
                descricaoTipoServicoExecutado = ordemServico.descricaoTipoServicoExecutado,
                dadosEncerramento = OrdemServicoDadosEncerramento(
                    dataEncerramentoOS = ordemServico.dataEncerramentoOS,
                    horaEncerramentoOS = ordemServico.horaEncerramentoOS,
                    idMotivoEncerramento = ordemServico.idMotivoEncerramento,
                    descricaoMotivoEncerramento = ordemServico.descricaoMotivoEncerramento,
                    parecerEncerramento = ordemServico.parecerEncerramento,
                ),
                ordemServicoDadosExecucao = OrdemServicoDadosExecucao(
                    dataExecucao = ordemServico.dataExecucao,
                    horaInicialExecucao = ordemServico.horaInicialExecucao,
                    horaFinalExecucao = ordemServico.horaFinalExecucao,
                    idEquipeExecucao = ordemServico.idEquipeExecucao ?: 0,
                    descricaoEquipeExecucao = ordemServico.descricaoEquipeExecucao,
                ),
                ordemServicoRedeRamalAgua = OrdemServicoRedeRamalAgua(
                    tipoRede = ordemServico.tipoRede,
                    descricaoTipoRede = ordemServico.descricaoTipoRede,
                    idDiametroRede = ordemServico.idDiametroRede,
                    descricaoDiametroRede = ordemServico.descricaoDiametroRede,
                    idMaterialRede = ordemServico.idMaterialRede,
                    descricaoMaterialRede = ordemServico.descricaoMaterialRede,
                    profundidadeRede = ordemServico.profundidadeRede,
                    pressaoRede = ordemServico.pressaoRede,
                    idAgenteExterno = ordemServico.idAgenteExterno,
                    agenteExterno = ordemServico.agenteExterno,
                    idCausaRede = ordemServico.idCausaRede,
                    descricaoCausaRede = ordemServico.descricaoCausaRede,
                    idUsuario = ordemServico.idUsuario,
                    descricaoUsuario = ordemServico.descricaoUsuario,
                ),
                logradouro = ordemServico.logradouro,
                bairro = ordemServico.bairro,
                numeroImovel = ordemServico.numeroImovel,
                idCliente = ordemServico.idCliente,
                idImovel = ordemServico.idImovel,
                nomeCliente = ordemServico.nomeCliente,
                dataCancelamento = ordemServico.dataCancelamento,
                horaCancelamento = ordemServico.horaCancelamento,
                idTipoServicoGerar = ordemServico.idTipoServicoGerar,
                descricaoTipoServicoGerar = ordemServico.descricaoTipoServicoGerar,
                idMovimentoRecebito = ordemServico.idMovimentoRecebito,
                idColetorEnvioItem = ordemServico.idColetorEnvioItem,
                idColetorEnvio = ordemServico.idColetorEnvio,
                kmInicial = ordemServico.kmInicial,
                kmFinal = ordemServico.kmFinal,
                idOrdemServico = ordemServico.idOrdemServico,
                numeroLacreAnterior = ordemServico.numeroLacreAnterior,
                numeroLocreNovo = ordemServico.numeroLocreNovo,
                numeroHidrometro = ordemServico.numeroHidrometro,
                leitura = ordemServico.leitura,
                observacaoCampo = ordemServico.observacaoCampo,
                indicadorOrdemServicoAvulsa = ordemServico.indicadorOrdemServicoAvulsa,

                idSetorComercial = ordemServico.idSetorComercial,
                numeroLote = ordemServico.numeroLote,
                numeroSublote = ordemServico.numeroSublote,
                sequenciaRota = ordemServico.sequenciaRota,
                numeroQuadra = ordemServico.numeroQuadra,
                indicadorEnvio = ordemServico.indicadorEnvio,
                tipoLogradouro = ordemServico.tipoLogradouro,
                latitude = ordemServico.latitude,
                longitude = ordemServico.longitude,
                logradouroProximidade = ordemServico.logradouroProximidade
            )
        }
    }

    fun toDomain(): OrdemServico {
        return OrdemServico(
            id = this.id,
            numeroOS = this.numeroOS,
            numeroRA = this.numeroRA,
            situacaoOS = this.situacaoOS,
            situacaoRA = this.situacaoRA,
            desricaoSituacaoRA = this.desricaoSituacaoRA,
            descricaoSituacaoOS = this.descricaoSituacaoOS,
            dataGeracaoOS = this.dataGeracaoOS,
            dataGeracaoRA = this.dataGeracaoRA,
            idTipoServico = this.idTipoServico,
            descricaoTipoServico = this.descricaoTipoServico,
            observacaoOS = this.observacaoOS,
            observacaoRA = this.observacaoRA,
            idUnidadeGeracao = this.idUnidadeGeracao,
            descricaoUnidadeGeracao = this.descricaoUnidadeGeracao,
            idTipoServicoExecutado = this.idTipoServicoExecutado,
            descricaoTipoServicoExecutado = this.descricaoTipoServicoExecutado,

            dataEncerramentoOS = this.dadosEncerramento?.dataEncerramentoOS,
            horaEncerramentoOS = this.dadosEncerramento?.horaEncerramentoOS,
            idMotivoEncerramento = this.dadosEncerramento?.idMotivoEncerramento,
            descricaoMotivoEncerramento = this.dadosEncerramento?.descricaoMotivoEncerramento,
            parecerEncerramento = this.dadosEncerramento?.parecerEncerramento,

            dataExecucao = this.ordemServicoDadosExecucao?.dataExecucao,
            horaInicialExecucao = this.ordemServicoDadosExecucao?.horaInicialExecucao,
            horaFinalExecucao = this.ordemServicoDadosExecucao?.horaFinalExecucao,
            idEquipeExecucao = this.ordemServicoDadosExecucao?.idEquipeExecucao,
            descricaoEquipeExecucao = this.ordemServicoDadosExecucao?.descricaoEquipeExecucao,

            tipoRede = ordemServicoRedeRamalAgua?.tipoRede ?: 0,
            descricaoTipoRede = ordemServicoRedeRamalAgua?.descricaoTipoRede,
            idDiametroRede = ordemServicoRedeRamalAgua?.idDiametroRede ?: 0,
            descricaoDiametroRede = ordemServicoRedeRamalAgua?.descricaoDiametroRede,
            idMaterialRede = ordemServicoRedeRamalAgua?.idMaterialRede ?: 0,
            descricaoMaterialRede = ordemServicoRedeRamalAgua?.descricaoMaterialRede,
            profundidadeRede = ordemServicoRedeRamalAgua?.profundidadeRede,
            pressaoRede = ordemServicoRedeRamalAgua?.pressaoRede,
            idAgenteExterno = ordemServicoRedeRamalAgua?.idAgenteExterno ?: 0,
            agenteExterno = ordemServicoRedeRamalAgua?.agenteExterno,
            idCausaRede = ordemServicoRedeRamalAgua?.idCausaRede ?: 0,
            descricaoCausaRede = ordemServicoRedeRamalAgua?.descricaoCausaRede,
            idUsuario = ordemServicoRedeRamalAgua?.idUsuario ?: 0,
            descricaoUsuario = ordemServicoRedeRamalAgua?.descricaoUsuario,

            logradouro = this.logradouro,
            bairro = this.bairro,
            numeroImovel = this.numeroImovel,
            idCliente = this.idCliente,
            idImovel = this.idImovel,
            nomeCliente = this.nomeCliente,
            dataCancelamento = this.dataCancelamento,
            horaCancelamento = this.horaCancelamento,
            idTipoServicoGerar = this.idTipoServicoGerar,
            descricaoTipoServicoGerar = this.descricaoTipoServicoGerar,
            idMovimentoRecebito = this.idMovimentoRecebito,
            idColetorEnvioItem = this.idColetorEnvioItem,
            idColetorEnvio = this.idColetorEnvio,
            kmInicial = this.kmInicial,
            kmFinal = this.kmFinal,
            idOrdemServico = this.idOrdemServico,
            numeroLacreAnterior = this.numeroLacreAnterior,
            numeroLocreNovo = this.numeroLocreNovo,
            numeroHidrometro = this.numeroHidrometro,
            leitura = this.leitura,
            observacaoCampo = this.observacaoCampo,
            indicadorOrdemServicoAvulsa = this.indicadorOrdemServicoAvulsa,

            idSetorComercial = this.idSetorComercial,
            numeroLote = this.numeroLote,
            numeroSublote = this.numeroSublote,
            sequenciaRota = this.sequenciaRota,
            numeroQuadra = this.numeroQuadra,
            indicadorEnvio = this.indicadorEnvio,
            tipoLogradouro = this.tipoLogradouro,
            latitude = this.latitude,
            longitude = this.longitude,
            logradouroProximidade = this.logradouroProximidade
        )
    }
}