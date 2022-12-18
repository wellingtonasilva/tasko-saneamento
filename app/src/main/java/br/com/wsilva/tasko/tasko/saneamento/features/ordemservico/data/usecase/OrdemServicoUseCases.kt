package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.usecase

import br.com.wsilva.tasko.tasko.core.usecase.ordemservico.padrao.AddOrdemServicoUseCase
import br.com.wsilva.tasko.tasko.core.usecase.ordemservico.padrao.GetAllOrdemServicoUseCase
import br.com.wsilva.tasko.tasko.core.usecase.ordemservico.padrao.GetOrdemServicoUseCase

data class OrdemServicoUseCases(
    val addOrdemServicoUseCase: AddOrdemServicoUseCase,
    val getAllOrdemServicoUseCase: GetAllOrdemServicoUseCase,
    val getOrdemServicoUseCase: GetOrdemServicoUseCase
)