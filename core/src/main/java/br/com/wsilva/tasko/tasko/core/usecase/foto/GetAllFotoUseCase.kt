package br.com.wsilva.tasko.tasko.core.usecase.foto

import br.com.wsilva.tasko.tasko.core.domain.model.os.Foto
import br.com.wsilva.tasko.tasko.core.domain.repository.FotoRepository

class GetAllFotoUseCase(private val repository: FotoRepository) {

    suspend operator fun invoke(): List<Foto> {
        return repository.findAll()
    }
}