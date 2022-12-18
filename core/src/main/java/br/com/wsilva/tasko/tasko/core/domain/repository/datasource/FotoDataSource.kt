package br.com.wsilva.tasko.tasko.core.domain.repository.datasource

import br.com.wsilva.tasko.tasko.core.domain.model.os.Foto

interface FotoDataSource : GenericDataSource<Foto> {
    suspend fun findAllByNumeroOrdemServico(numeroOrdemServico: Int): List<Foto>
}