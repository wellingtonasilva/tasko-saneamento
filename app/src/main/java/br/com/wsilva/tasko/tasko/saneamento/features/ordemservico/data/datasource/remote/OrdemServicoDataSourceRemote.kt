package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.datasource.remote

import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico
import br.com.wsilva.tasko.tasko.core.domain.repository.datasource.OrdemServicoDataSource
import br.com.wsilva.tasko.tasko.saneamento.service.ApiService

class OrdemServicoDataSourceRemote(private val service: ApiService) : OrdemServicoDataSource {
    override suspend fun save(ordemServico: OrdemServico) {
        TODO("Not yet implemented")
    }

    override suspend fun findById(id: Long): OrdemServico? {
        TODO("Not yet implemented")
    }

    override suspend fun findAll(): List<OrdemServico> {
        return service.findAll()
    }

    override suspend fun remove(ordemServico: OrdemServico) {
        TODO("Not yet implemented")
    }

    override suspend fun removeById(id: Long) {
        TODO("Not yet implemented")
    }

}