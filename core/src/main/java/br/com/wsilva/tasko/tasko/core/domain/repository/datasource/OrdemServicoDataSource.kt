package br.com.wsilva.tasko.tasko.core.domain.repository.datasource

import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico

interface OrdemServicoDataSource {
    suspend fun save(ordemServico: OrdemServico)
    suspend fun findById(id: Long): OrdemServico?
    suspend fun findAll(): List<OrdemServico>
    suspend fun remove(ordemServico: OrdemServico)
    suspend fun removeById(id: Long)
}