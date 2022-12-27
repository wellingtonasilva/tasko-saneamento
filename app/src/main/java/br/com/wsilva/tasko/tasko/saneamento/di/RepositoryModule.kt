package br.com.wsilva.tasko.tasko.saneamento.di

import br.com.wsilva.tasko.tasko.core.domain.repository.OrdemServicoRepository
import br.com.wsilva.tasko.tasko.core.domain.repository.datasource.OrdemServicoDataSource
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module(includes = [DataSourceModule::class])
@InstallIn(SingletonComponent::class)
object RepositoryModule {

    @Provides
    @Singleton
    fun provideOrdemServicoRepository(@LocalDataSource localDataSource: OrdemServicoDataSource,
                                      @RemoteDataSource remoteDataSource: OrdemServicoDataSource): OrdemServicoRepository {
        return OrdemServicoRepository(localDataSource, remoteDataSource)
    }
}