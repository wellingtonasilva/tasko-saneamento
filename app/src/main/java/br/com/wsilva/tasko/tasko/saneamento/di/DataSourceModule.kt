package br.com.wsilva.tasko.tasko.saneamento.di

import br.com.wsilva.tasko.tasko.core.domain.repository.datasource.OrdemServicoDataSource
import br.com.wsilva.tasko.tasko.saneamento.database.AppDatabase
import br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.datasource.local.OrdemServicoDataSourceLocal
import br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.datasource.remote.OrdemServicoDataSourceRemote
import br.com.wsilva.tasko.tasko.saneamento.service.ApiService
import dagger.Module
import dagger.Provides
import dagger.Subcomponent
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Qualifier

@Module
@InstallIn(SingletonComponent::class)
object DataSourceModule {

    @Provides
    @LocalDataSource
    fun provideOrdemServicoDataSource(appDatabase: AppDatabase): OrdemServicoDataSource {
        return OrdemServicoDataSourceLocal(appDatabase.getOrdemServicoDao())
    }

    @Provides
    @RemoteDataSource
    fun provideOrdemServicoRemoteDataSource(apiService: ApiService): OrdemServicoDataSource {
        return OrdemServicoDataSourceRemote(apiService)
    }
}

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class LocalDataSource

@Qualifier
@Retention(AnnotationRetention.BINARY)
annotation class RemoteDataSource