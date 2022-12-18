package br.com.wsilva.tasko.tasko.core.usecase.ordemservico.corte

import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServicoCorte
import br.com.wsilva.tasko.tasko.core.domain.repository.OrdemServicoCorteRepository

class GetAllCorteByNumeroOrdemServicoUseCase(private val repository: OrdemServicoCorteRepository) {

    suspend operator fun invoke(numeroOrdemServico: Int): List<OrdemServicoCorte> {
        return repository.findAllByNumeroOrdemServico(numeroOrdemServico)
    }
}