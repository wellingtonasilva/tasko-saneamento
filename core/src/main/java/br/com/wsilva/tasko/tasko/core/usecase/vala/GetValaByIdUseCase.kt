package br.com.wsilva.tasko.tasko.core.usecase.vala

import br.com.wsilva.tasko.tasko.core.domain.model.os.Vala
import br.com.wsilva.tasko.tasko.core.domain.repository.ValaRepository

class GetValaByIdUseCase(private val repository: ValaRepository) {

    suspend operator fun invoke(id: Long): Vala? {
        return repository.findById(id)
    }
}