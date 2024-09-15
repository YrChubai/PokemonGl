package com.example.pokemongl.ultil

import androidx.compose.ui.graphics.Color
import com.example.pokemongl.data.remote.responses.Stat
import com.example.pokemongl.data.remote.responses.Type
import com.example.pokemongl.ui.theme.AtkColor
import com.example.pokemongl.ui.theme.DefColor
import com.example.pokemongl.ui.theme.HPColor
import com.example.pokemongl.ui.theme.SpAtkColor
import com.example.pokemongl.ui.theme.SpDefColor
import com.example.pokemongl.ui.theme.SpdColor
import com.example.pokemongl.ui.theme.TypeBug
import com.example.pokemongl.ui.theme.TypeDark
import com.example.pokemongl.ui.theme.TypeDragon
import com.example.pokemongl.ui.theme.TypeElectric
import com.example.pokemongl.ui.theme.TypeFairy
import com.example.pokemongl.ui.theme.TypeFighting
import com.example.pokemongl.ui.theme.TypeFire
import com.example.pokemongl.ui.theme.TypeFlying
import com.example.pokemongl.ui.theme.TypeGhost
import com.example.pokemongl.ui.theme.TypeGrass
import com.example.pokemongl.ui.theme.TypeGround
import com.example.pokemongl.ui.theme.TypeIce
import com.example.pokemongl.ui.theme.TypeNormal
import com.example.pokemongl.ui.theme.TypePoison
import com.example.pokemongl.ui.theme.TypePsychic
import com.example.pokemongl.ui.theme.TypeRock
import com.example.pokemongl.ui.theme.TypeSteel
import com.example.pokemongl.ui.theme.TypeWater
import java.util.Locale

fun parseTypeToColor(type: Type): Color {
    return when(type.type.name.toLowerCase(Locale.ROOT)) {
        "normal" -> TypeNormal
        "fire" -> TypeFire
        "water" -> TypeWater
        "electric" -> TypeElectric
        "grass" -> TypeGrass
        "ice" -> TypeIce
        "fighting" -> TypeFighting
        "poison" -> TypePoison
        "ground" -> TypeGround
        "flying" -> TypeFlying
        "psychic" -> TypePsychic
        "bug" -> TypeBug
        "rock" -> TypeRock
        "ghost" -> TypeGhost
        "dragon" -> TypeDragon
        "dark" -> TypeDark
        "steel" -> TypeSteel
        "fairy" -> TypeFairy
        else -> Color.Black
    }
}

fun parseStatToColor(stat: Stat): Color {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> HPColor
        "attack" -> AtkColor
        "defense" -> DefColor
        "special-attack" -> SpAtkColor
        "special-defense" -> SpDefColor
        "speed" -> SpdColor
        else -> Color.White
    }
}

fun parseStatToAbbr(stat: Stat): String {
    return when(stat.stat.name.toLowerCase()) {
        "hp" -> "HP"
        "attack" -> "Atk"
        "defense" -> "Def"
        "special-attack" -> "SpAtk"
        "special-defense" -> "SpDef"
        "speed" -> "Spd"
        else -> ""
    }
}