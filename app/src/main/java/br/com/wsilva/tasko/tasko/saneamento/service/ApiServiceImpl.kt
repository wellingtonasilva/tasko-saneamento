package br.com.wsilva.tasko.tasko.saneamento.service

import br.com.wsilva.tasko.tasko.saneamento.constants.Constants
import retrofit2.Retrofit

object ApiServiceImpl {

    private val retrofit = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .build()

    val service = retrofit.create(ApiService::class.java)
}