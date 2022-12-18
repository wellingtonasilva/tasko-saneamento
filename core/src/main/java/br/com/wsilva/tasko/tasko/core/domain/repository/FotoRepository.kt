package br.com.wsilva.tasko.tasko.core.domain.repository

import br.com.wsilva.tasko.tasko.core.domain.model.os.Foto
import br.com.wsilva.tasko.tasko.core.domain.repository.datasource.FotoDataSource

class FotoRepository(private val dataSource: FotoDataSource) : GenericRepository<Foto> {
    override suspend fun save(entity: Foto) {
        dataSource.save(entity)
    }

    override suspend fun findById(id: Long): Foto? {
        return dataSource.findById(id)
    }

    override suspend fun findAll(): List<Foto> {
        return dataSource.findAll()
    }

    override suspend fun remove(entity: Foto) {
        dataSource.remove(entity)
    }

    override suspend fun removeById(id: Long) {
        dataSource.removeById(id)
    }

    suspend fun findAllByNumeroOrdemServico(numeroOrdemServico: Int): List<Foto> {
        return dataSource.findAllByNumeroOrdemServico(numeroOrdemServico)
    }
}