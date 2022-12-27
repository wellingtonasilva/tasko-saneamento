package br.com.wsilva.tasko.tasko.core.domain.repository

import br.com.wsilva.tasko.tasko.core.domain.repository.datasource.OrdemServicoDataSource
import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico

class OrdemServicoRepository(private val localDataSource: OrdemServicoDataSource,
                             private val remoteDataSource: OrdemServicoDataSource) :
    GenericRepository<OrdemServico> {

    override suspend fun save(entity: OrdemServico) {
        localDataSource.save(entity)
    }

    override suspend fun findById(id: Long): OrdemServico? {
        return localDataSource.findById(id)
    }

    override suspend fun findAll(): List<OrdemServico> {
        val list = localDataSource.findAll()
        if (list.isEmpty()) {
            val remoteList = remoteDataSource.findAll()
            remoteList.forEach { ordemServico ->  localDataSource.save(ordemServico)}
            return localDataSource.findAll()
        }

        return list
    }

    override suspend fun remove(entity: OrdemServico) {
        localDataSource.remove(entity)
    }

    override suspend fun removeById(id: Long) {
        localDataSource.removeById(id)
    }
}