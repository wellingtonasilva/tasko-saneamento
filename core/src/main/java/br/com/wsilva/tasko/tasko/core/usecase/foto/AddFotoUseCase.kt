package br.com.wsilva.tasko.tasko.core.usecase.foto

import br.com.wsilva.tasko.tasko.core.domain.model.os.Foto
import br.com.wsilva.tasko.tasko.core.domain.repository.FotoRepository

class AddFotoUseCase(private val repository: FotoRepository) {

    suspend operator fun invoke(foto: Foto) {
        repository.save(foto)
    }
}