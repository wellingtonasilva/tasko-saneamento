package br.com.wsilva.tasko.tasko.saneamento.di

import br.com.wsilva.tasko.tasko.core.domain.repository.OrdemServicoRepository
import br.com.wsilva.tasko.tasko.core.usecase.ordemservico.padrao.AddOrdemServicoUseCase
import br.com.wsilva.tasko.tasko.core.usecase.ordemservico.padrao.GetAllOrdemServicoUseCase
import br.com.wsilva.tasko.tasko.core.usecase.ordemservico.padrao.GetOrdemServicoUseCase
import br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.usecase.OrdemServicoUseCases
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module(includes = [RepositoryModule::class])
@InstallIn(SingletonComponent::class)
object UseCasesModule {

    @Provides
    @Singleton
    fun provideOrdemServicoUseCases(repository: OrdemServicoRepository): OrdemServicoUseCases {
        return OrdemServicoUseCases(
            addOrdemServicoUseCase = AddOrdemServicoUseCase(repository),
            getOrdemServicoUseCase = GetOrdemServicoUseCase(repository),
            getAllOrdemServicoUseCase = GetAllOrdemServicoUseCase(repository)
        )
    }
}