package br.com.wsilva.tasko.tasko.core.domain.repository

import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServicoCorte
import br.com.wsilva.tasko.tasko.core.domain.repository.datasource.OrdemServicoCorteDataSource

class OrdemServicoCorteRepository(private val dataSource: OrdemServicoCorteDataSource) :
    GenericRepository<OrdemServicoCorte> {
    override suspend fun save(entity: OrdemServicoCorte) {
        dataSource.save(entity)
    }

    override suspend fun findById(id: Long): OrdemServicoCorte? {
        return dataSource.findById(id)
    }

    override suspend fun findAll(): List<OrdemServicoCorte> {
        return dataSource.findAll()
    }

    override suspend fun remove(entity: OrdemServicoCorte) {
        dataSource.remove(entity)
    }

    override suspend fun removeById(id: Long) {
        dataSource.removeById(id)
    }

    suspend fun findAllByNumeroOrdemServico(numeroOrdemServico: Int): List<OrdemServicoCorte> {
        return dataSource.findAllByNumeroOrdemServico(numeroOrdemServico)
    }
}