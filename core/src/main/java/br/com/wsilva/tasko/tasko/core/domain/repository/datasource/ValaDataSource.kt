package br.com.wsilva.tasko.tasko.core.domain.repository.datasource

import br.com.wsilva.tasko.tasko.core.domain.model.os.Vala

interface ValaDataSource : GenericDataSource<Vala> {

    suspend fun findAllByNumeroOrdemServico(numeroOrdemServico: Int): List<Vala>
}