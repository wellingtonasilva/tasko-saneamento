package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.datasource.local

import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico
import br.com.wsilva.tasko.tasko.core.domain.repository.datasource.OrdemServicoDataSource
import br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.entity.OrdemServicoEntity

class OrdemServicoDataSourceLocal(private val ordemServicoDao: OrdemServicoDao) : OrdemServicoDataSource {
    override suspend fun save(ordemServico: OrdemServico) {
        ordemServicoDao.save(OrdemServicoEntity.from(ordemServico))
    }

    override suspend fun findById(id: Long): OrdemServico? {
        return ordemServicoDao.findById(id)?.toDomain()
    }

    override suspend fun findAll(): List<OrdemServico> {
        return ordemServicoDao.findAll().map { entity -> entity.toDomain() }
    }

    override suspend fun remove(ordemServico: OrdemServico) {
        ordemServicoDao.remove(OrdemServicoEntity.from(ordemServico))
    }

    override suspend fun removeById(id: Long) {
        ordemServicoDao.removeById(id)
    }
}