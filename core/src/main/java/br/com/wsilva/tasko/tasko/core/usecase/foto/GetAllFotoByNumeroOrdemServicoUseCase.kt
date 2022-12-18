package br.com.wsilva.tasko.tasko.core.usecase.foto

import br.com.wsilva.tasko.tasko.core.domain.model.os.Foto
import br.com.wsilva.tasko.tasko.core.domain.repository.FotoRepository

class GetAllFotoByNumeroOrdemServicoUseCase(private val repository: FotoRepository) {

    suspend operator fun invoke(numeroOrdemServico: Int): List<Foto> {
        return repository.findAllByNumeroOrdemServico(numeroOrdemServico)
    }

}