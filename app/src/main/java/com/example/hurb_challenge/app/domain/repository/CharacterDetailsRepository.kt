package com.example.hurb_challenge.app.domain.repository

import com.example.hurb_challenge.app.data.Result
import com.example.hurb_challenge.app.domain.model.Starship
import com.example.hurb_challenge.app.domain.model.Vehicle
import kotlinx.coroutines.flow.Flow

interface CharacterDetailsRepository {

    suspend fun getVehicles(urls: List<String>): Flow<Result<List<Vehicle>>>

    suspend fun getStarships(urls: List<String>): Flow<Result<List<Starship>>>
}