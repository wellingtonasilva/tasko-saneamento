package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.entity

import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey
import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico
import java.util.UUID

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
                id = UUID.randomUUID().toString(),
                numeroOS = ordemServico.numeroOS.toInt(),
                numeroRA = ordemServico.numeroRA.toInt(),
                situacaoOS = ordemServico.situacaoOS.toInt(),
                situacaoRA = ordemServico.situacaoRA.toInt(),
                desricaoSituacaoRA = ordemServico.desricaoSituacaoRA,
                descricaoSituacaoOS = ordemServico.descricaoSituacaoOS,
                dataGeracaoOS = ordemServico.dataGeracaoOS,
                dataGeracaoRA = ordemServico.dataGeracaoRA,
                idTipoServico = ordemServico.idTipoServico.toInt(),
                descricaoTipoServico = ordemServico.descricaoTipoServico,
                observacaoOS = ordemServico.observacaoOS,
                observacaoRA = ordemServico.observacaoRA,
                idUnidadeGeracao = ordemServico.idUnidadeGeracao.toInt(),
                //descricaoUnidadeGeracao = ordemServico.descricaoUnidadeGeracao,
                //idTipoServicoExecutado = ordemServico.idTipoServicoExecutado.toInt(),
                descricaoTipoServicoExecutado = ordemServico.descricaoTipoServicoExecutado,
                dadosEncerramento = OrdemServicoDadosEncerramento(
                    dataEncerramentoOS = ordemServico.dataEncerramentoOS,
                    horaEncerramentoOS = ordemServico.horaEncerramentoOS,
                    //idMotivoEncerramento = ordemServico.idMotivoEncerramento.toInt(),
                    descricaoMotivoEncerramento = ordemServico.descricaoMotivoEncerramento,
                    parecerEncerramento = ordemServico.parecerEncerramento,
                ),
                ordemServicoDadosExecucao = OrdemServicoDadosExecucao(
                    dataExecucao = ordemServico.dataExecucao,
                    horaInicialExecucao = ordemServico.horaInicialExecucao,
                    horaFinalExecucao = ordemServico.horaFinalExecucao,
                    idEquipeExecucao = ordemServico.idEquipeExecucao.toInt() ?: 0,
                    descricaoEquipeExecucao = ordemServico.descricaoEquipeExecucao,
                ),
                ordemServicoRedeRamalAgua = OrdemServicoRedeRamalAgua(
                    //tipoRede = ordemServico.tipoRede.toInt(),
                    descricaoTipoRede = ordemServico.descricaoTipoRede,
                    //idDiametroRede = ordemServico.idDiametroRede.toInt(),
                    descricaoDiametroRede = ordemServico.descricaoDiametroRede,
                    //idMaterialRede = ordemServico.idMaterialRede.toInt(),
                    descricaoMaterialRede = ordemServico.descricaoMaterialRede,
                    profundidadeRede = ordemServico.profundidadeRede,
                    pressaoRede = ordemServico.pressaoRede,
                    //idAgenteExterno = ordemServico.idAgenteExterno.toInt(),
                    agenteExterno = ordemServico.agenteExterno,
                    //idCausaRede = ordemServico.idCausaRede.toInt(),
                    descricaoCausaRede = ordemServico.descricaoCausaRede,
                    //idUsuario = ordemServico.idUsuario.toInt(),
                    descricaoUsuario = ordemServico.descricaoUsuario,
                ),
                logradouro = ordemServico.logradouro,
                bairro = ordemServico.bairro,
                numeroImovel = ordemServico.numeroImovel,
                //idCliente = ordemServico.idCliente.toInt(),
                //idImovel = ordemServico.idImovel.toInt(),
                nomeCliente = ordemServico.nomeCliente,
                dataCancelamento = ordemServico.dataCancelamento,
                horaCancelamento = ordemServico.horaCancelamento,
                //idTipoServicoGerar = ordemServico.idTipoServicoGerar.toInt(),
                descricaoTipoServicoGerar = ordemServico.descricaoTipoServicoGerar,
                //idMovimentoRecebito = ordemServico.idMovimentoRecebito.toInt(),
                //idColetorEnvioItem = ordemServico.idColetorEnvioItem.toInt(),
                //idColetorEnvio = ordemServico.idColetorEnvio.toInt(),
                //kmInicial = ordemServico.kmInicial.toInt(),
                //kmFinal = ordemServico.kmFinal.toInt(),
                //idOrdemServico = ordemServico.idOrdemServico.toInt(),
                //numeroLacreAnterior = ordemServico.numeroLacreAnterior.toInt(),
                //numeroLocreNovo = ordemServico.numeroLocreNovo.toInt(),
                numeroHidrometro = ordemServico.numeroHidrometro,
                //leitura = ordemServico.leitura.toInt(),
                observacaoCampo = ordemServico.observacaoCampo,
                //indicadorOrdemServicoAvulsa = ordemServico.indicadorOrdemServicoAvulsa.toInt(),

                //idSetorComercial = ordemServico.idSetorComercial.toInt(),
                //numeroLote = ordemServico.numeroLote.toInt(),
                //numeroSublote = ordemServico.numeroSublote.toInt(),
                //sequenciaRota = ordemServico.sequenciaRota.toInt(),
                //numeroQuadra = ordemServico.numeroQuadra,
                //indicadorEnvio = ordemServico.indicadorEnvio.toInt(),
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
            numeroOS = this.numeroOS.toString(),
            numeroRA = this.numeroRA.toString(),
            situacaoOS = this.situacaoOS.toString(),
            situacaoRA = this.situacaoRA.toString(),
            desricaoSituacaoRA = this.desricaoSituacaoRA,
            descricaoSituacaoOS = this.descricaoSituacaoOS,
            dataGeracaoOS = this.dataGeracaoOS,
            dataGeracaoRA = this.dataGeracaoRA,
            idTipoServico = this.idTipoServico.toString(),
            descricaoTipoServico = this.descricaoTipoServico,
            observacaoOS = this.observacaoOS,
            observacaoRA = this.observacaoRA,
            idUnidadeGeracao = this.idUnidadeGeracao.toString(),
            descricaoUnidadeGeracao = this.descricaoUnidadeGeracao,
            idTipoServicoExecutado = this.idTipoServicoExecutado.toString(),
            descricaoTipoServicoExecutado = this.descricaoTipoServicoExecutado,

            dataEncerramentoOS = this.dadosEncerramento?.dataEncerramentoOS,
            horaEncerramentoOS = this.dadosEncerramento?.horaEncerramentoOS,
            idMotivoEncerramento = this.dadosEncerramento?.idMotivoEncerramento.toString(),
            descricaoMotivoEncerramento = this.dadosEncerramento?.descricaoMotivoEncerramento,
            parecerEncerramento = this.dadosEncerramento?.parecerEncerramento,

            dataExecucao = this.ordemServicoDadosExecucao?.dataExecucao,
            horaInicialExecucao = this.ordemServicoDadosExecucao?.horaInicialExecucao,
            horaFinalExecucao = this.ordemServicoDadosExecucao?.horaFinalExecucao,
            idEquipeExecucao = this.ordemServicoDadosExecucao?.idEquipeExecucao.toString(),
            descricaoEquipeExecucao = this.ordemServicoDadosExecucao?.descricaoEquipeExecucao,

            tipoRede = ordemServicoRedeRamalAgua?.tipoRede.toString() ?: "0",
            descricaoTipoRede = ordemServicoRedeRamalAgua?.descricaoTipoRede,
            idDiametroRede = ordemServicoRedeRamalAgua?.idDiametroRede.toString() ?: "0",
            descricaoDiametroRede = ordemServicoRedeRamalAgua?.descricaoDiametroRede,
            idMaterialRede = ordemServicoRedeRamalAgua?.idMaterialRede.toString() ?: "0",
            descricaoMaterialRede = ordemServicoRedeRamalAgua?.descricaoMaterialRede,
            profundidadeRede = ordemServicoRedeRamalAgua?.profundidadeRede,
            pressaoRede = ordemServicoRedeRamalAgua?.pressaoRede,
            idAgenteExterno = ordemServicoRedeRamalAgua?.idAgenteExterno.toString() ?: "0",
            agenteExterno = ordemServicoRedeRamalAgua?.agenteExterno,
            idCausaRede = ordemServicoRedeRamalAgua?.idCausaRede.toString() ?: "0",
            descricaoCausaRede = ordemServicoRedeRamalAgua?.descricaoCausaRede,
            idUsuario = ordemServicoRedeRamalAgua?.idUsuario.toString() ?: "0",
            descricaoUsuario = ordemServicoRedeRamalAgua?.descricaoUsuario,

            logradouro = this.logradouro,
            bairro = this.bairro,
            numeroImovel = this.numeroImovel,
            idCliente = this.idCliente.toString(),
            idImovel = this.idImovel.toString(),
            nomeCliente = this.nomeCliente,
            dataCancelamento = this.dataCancelamento,
            horaCancelamento = this.horaCancelamento,
            idTipoServicoGerar = this.idTipoServicoGerar.toString(),
            descricaoTipoServicoGerar = this.descricaoTipoServicoGerar,
            idMovimentoRecebito = this.idMovimentoRecebito.toString(),
            idColetorEnvioItem = this.idColetorEnvioItem.toString(),
            idColetorEnvio = this.idColetorEnvio.toString(),
            kmInicial = this.kmInicial.toString(),
            kmFinal = this.kmFinal.toString(),
            idOrdemServico = this.idOrdemServico.toString(),
            numeroLacreAnterior = this.numeroLacreAnterior.toString(),
            numeroLocreNovo = this.numeroLocreNovo.toString(),
            numeroHidrometro = this.numeroHidrometro,
            leitura = this.leitura.toString(),
            observacaoCampo = this.observacaoCampo,
            indicadorOrdemServicoAvulsa = this.indicadorOrdemServicoAvulsa.toString(),

            idSetorComercial = this.idSetorComercial.toString(),
            numeroLote = this.numeroLote.toString(),
            numeroSublote = this.numeroSublote.toString(),
            sequenciaRota = this.sequenciaRota.toString(),
            numeroQuadra = this.numeroQuadra,
            indicadorEnvio = this.indicadorEnvio.toString(),
            tipoLogradouro = this.tipoLogradouro,
            latitude = this.latitude,
            longitude = this.longitude,
            logradouroProximidade = this.logradouroProximidade
        )
    }
}