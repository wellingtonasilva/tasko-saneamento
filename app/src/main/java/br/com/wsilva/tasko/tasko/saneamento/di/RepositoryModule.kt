package br.com.wsilva.tasko.tasko.saneamento.di

import br.com.wsilva.tasko.tasko.core.domain.repository.OrdemServicoRepository
import br.com.wsilva.tasko.tasko.core.domain.repository.datasource.OrdemServicoDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    fun provideOrdemServicoRepository(dataSource: OrdemServicoDataSource): OrdemServicoRepository {
        return OrdemServicoRepository(dataSource)
    }
}