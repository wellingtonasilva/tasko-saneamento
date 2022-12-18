package br.com.wsilva.tasko.tasko.saneamento.di

import br.com.wsilva.tasko.tasko.core.domain.repository.datasource.OrdemServicoDataSource
import br.com.wsilva.tasko.tasko.saneamento.database.AppDatabase
import br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.datasource.local.OrdemServicoDataSourceLocal
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Provides
    fun provideOrdemServicoDataSource(appDatabase: AppDatabase): OrdemServicoDataSource {
        return OrdemServicoDataSourceLocal(appDatabase.getOrdemServicoDao())
    }
}