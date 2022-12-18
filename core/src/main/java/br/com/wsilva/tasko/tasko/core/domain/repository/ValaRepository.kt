package br.com.wsilva.tasko.tasko.core.domain.repository

import br.com.wsilva.tasko.tasko.core.domain.model.os.Vala
import br.com.wsilva.tasko.tasko.core.domain.repository.datasource.ValaDataSource

class ValaRepository(private val dataSource: ValaDataSource) : GenericRepository<Vala> {
    override suspend fun save(entity: Vala) {
        dataSource.save(entity)
    }

    override suspend fun findById(id: Long): Vala? {
        return dataSource.findById(id)
    }

    override suspend fun findAll(): List<Vala> {
        return dataSource.findAll()
    }

    override suspend fun remove(entity: Vala) {
        dataSource.remove(entity)
    }

    override suspend fun removeById(id: Long) {
        dataSource.removeById(id)
    }

    suspend fun findAllByNumeroOrdemServico(numeroOrdemServico: Int): List<Vala> {
        return dataSource.findAllByNumeroOrdemServico(numeroOrdemServico)
    }
}