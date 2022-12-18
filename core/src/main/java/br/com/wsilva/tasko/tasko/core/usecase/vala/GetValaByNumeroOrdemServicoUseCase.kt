package br.com.wsilva.tasko.tasko.core.usecase.vala

import br.com.wsilva.tasko.tasko.core.domain.model.os.Vala
import br.com.wsilva.tasko.tasko.core.domain.repository.ValaRepository

class GetValaByNumeroOrdemServicoUseCase(private val repository: ValaRepository) {

    suspend operator fun invoke(numeroOrdemServico: Int): List<Vala> {
        return repository.findAllByNumeroOrdemServico(numeroOrdemServico)
    }
}