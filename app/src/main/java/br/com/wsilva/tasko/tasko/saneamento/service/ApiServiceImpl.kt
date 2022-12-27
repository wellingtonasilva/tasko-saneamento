package br.com.wsilva.tasko.tasko.saneamento.service

import br.com.wsilva.tasko.tasko.saneamento.constants.Constants
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

object ApiServiceImpl {

    private val retrofit = Retrofit.Builder()
        .baseUrl(Constants.BASE_URL)
        .addConverterFactory(MoshiConverterFactory.create())
        .build()

    val service = retrofit.create(ApiService::class.java)
}