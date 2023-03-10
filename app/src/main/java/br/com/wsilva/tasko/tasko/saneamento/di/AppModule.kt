package br.com.wsilva.tasko.tasko.saneamento.di

import android.app.Application
import androidx.room.Room
import br.com.wsilva.tasko.tasko.saneamento.database.AppDatabase
import br.com.wsilva.tasko.tasko.saneamento.service.ApiService
import br.com.wsilva.tasko.tasko.saneamento.service.ApiServiceImpl
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideNoteDatabase(application: Application) : AppDatabase {
        return Room.databaseBuilder(
            application,
            AppDatabase::class.java,
            AppDatabase.DATABASE_NAME
        ).fallbackToDestructiveMigration()
            .build()
    }

    @Provides
    @Singleton
    fun provideApiService(): ApiService {
        return ApiServiceImpl.service
    }
}