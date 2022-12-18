package br.com.wsilva.tasko.tasko.core.usecase.ordemservico.padrao

import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico
import br.com.wsilva.tasko.tasko.core.domain.repository.OrdemServicoRepository

class RemoveOrdemServicoUseCase(private val repository: OrdemServicoRepository) {
    suspend operator fun invoke(ordemServico: OrdemServico) {
        repository.remove(ordemServico)
    }
}