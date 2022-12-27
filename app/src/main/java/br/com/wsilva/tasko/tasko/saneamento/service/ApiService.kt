package br.com.wsilva.tasko.tasko.saneamento.service

import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico
import retrofit2.http.GET

interface ApiService {

    @GET("/")
    suspend fun findAll(): List<OrdemServico>
}