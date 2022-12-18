package br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.datasource.local

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import br.com.wsilva.tasko.tasko.saneamento.features.ordemservico.data.entity.OrdemServicoEntity

@Dao
interface OrdemServicoDao {

    @Insert(onConflict = REPLACE)
    suspend fun save(entity: OrdemServicoEntity)

    @Query("SELECT * FROM ordem_servico")
    suspend fun findAll(): List<OrdemServicoEntity>

    @Query("SELECT * FROM ordem_servico WHERE id = :id")
    suspend fun findById(id: Long): OrdemServicoEntity?

    @Delete
    suspend fun remove(entity: OrdemServicoEntity)

    @Query("DELETE FROM ordem_servico WHERE id = :id")
    suspend fun removeById(id: Long)
}