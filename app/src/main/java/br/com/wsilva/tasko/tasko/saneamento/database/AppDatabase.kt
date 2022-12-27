package br.com.wsilva.tasko.tasko.saneamento.database

import androidx.room.Database
import androidx.room.RoomDatabase
import br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.datasource.local.OrdemServicoDao
import br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.entity.OrdemServicoEntity

@Database(
    entities = [OrdemServicoEntity::class],
    version = 3
)
abstract class AppDatabase : RoomDatabase() {

    abstract fun getOrdemServicoDao(): OrdemServicoDao

    companion object {
        const val DATABASE_NAME = "task_database.db"
    }
}