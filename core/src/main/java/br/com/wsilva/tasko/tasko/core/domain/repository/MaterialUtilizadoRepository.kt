package br.com.wsilva.tasko.tasko.core.domain.repository

import br.com.wsilva.tasko.tasko.core.domain.model.os.MaterialUtilizado
import br.com.wsilva.tasko.tasko.core.domain.repository.datasource.MaterialUtilizadoDataSource

class MaterialUtilizadoRepository(private val dataSource: MaterialUtilizadoDataSource) :
    GenericRepository<MaterialUtilizado> {
    override suspend fun save(entity: MaterialUtilizado) {
        dataSource.save(entity)
    }

    override suspend fun findById(id: Long): MaterialUtilizado? {
        return dataSource.findById(id)
    }

    override suspend fun findAll(): List<MaterialUtilizado> {
        return dataSource.findAll()
    }

    override suspend fun remove(entity: MaterialUtilizado) {
        dataSource.remove(entity)
    }

    override suspend fun removeById(id: Long) {
        dataSource.removeById(id)
    }
}