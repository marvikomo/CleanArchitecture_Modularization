package com.muryno.presention.model

import java.io.Serializable


data class ArtistModel(
    val id: String,
    val name: String,
    val gender: String,
    val city: String,
    val state: String,
    val description: String,
    val score: Int
) : Serializable