package com.example.pokemongl.pokemon_detail

import androidx.lifecycle.ViewModel
import com.example.pokemongl.data.remote.responses.Pokemon
import com.example.pokemongl.repository.PokemonRepository
import com.example.pokemongl.ultil.Resource
import dagger.hilt.android.lifecycle.HiltViewModel
import javax.inject.Inject

@HiltViewModel
class PokemonDetailViewModel @Inject constructor(
    private  val repository: PokemonRepository
): ViewModel() {

    suspend fun getPokemonInfo(pokemonName: String): Resource<Pokemon>{
        return  repository.getPokemonInfo(pokemonName)
    }
}