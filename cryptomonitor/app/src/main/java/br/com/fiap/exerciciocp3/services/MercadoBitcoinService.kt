package br.com.fiap.exerciciocp3.services

import br.com.fiap.exerciciocp3.model.TickerResponse
import retrofit2.Response
import retrofit2.http.GET

interface MercadoBitcoinService {

    @GET("api/BTC/ticker/")
    suspend fun getTicker(): Response<TickerResponse>

}