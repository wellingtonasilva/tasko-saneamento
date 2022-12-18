package br.com.wsilva.tasko.tasko.core.domain.repository

import br.com.wsilva.tasko.tasko.core.domain.repository.datasource.OrdemServicoDataSource
import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico

class OrdemServicoRepository(private val ordemServicoDataSource: OrdemServicoDataSource) :
    GenericRepository<OrdemServico> {

    override suspend fun save(entity: OrdemServico) {
        ordemServicoDataSource.save(entity)
    }

    override suspend fun findById(id: Long): OrdemServico? {
        return ordemServicoDataSource.findById(id)
    }

    override suspend fun findAll(): List<OrdemServico> {
        return ordemServicoDataSource.findAll()
    }

    override suspend fun remove(entity: OrdemServico) {
        ordemServicoDataSource.remove(entity)
    }

    override suspend fun removeById(id: Long) {
        ordemServicoDataSource.removeById(id)
    }
}