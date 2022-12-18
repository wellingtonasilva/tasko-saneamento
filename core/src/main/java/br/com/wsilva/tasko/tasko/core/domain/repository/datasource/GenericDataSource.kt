package br.com.wsilva.tasko.tasko.core.domain.repository.datasource

interface GenericDataSource<T> {
    suspend fun save(entity: T)
    suspend fun findById(id: Long): T?
    suspend fun findAll(): List<T>
    suspend fun remove(entity: T)
    suspend fun removeById(id: Long)
}