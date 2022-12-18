package br.com.wsilva.tasko.tasko.core.domain.repository.datasource

import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServicoCorte

interface OrdemServicoCorteDataSource : GenericDataSource<OrdemServicoCorte> {
    suspend fun findAllByNumeroOrdemServico(numeroOrdemServico: Int): List<OrdemServicoCorte>
}