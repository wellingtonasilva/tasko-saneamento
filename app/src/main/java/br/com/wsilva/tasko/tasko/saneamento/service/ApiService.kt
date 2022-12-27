package br.com.wsilva.tasko.tasko.saneamento.service

import br.com.wsilva.tasko.tasko.core.domain.model.os.OrdemServico
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiService {

    @GET("/dev/api/tables")
    suspend fun findAll(@Query("tablename") tablename: String = "tasko_ordem_servico"): List<OrdemServico>
}