package com.example.hw_1ibrakhimgroup

import java.io.Serializable

data class SerialModel(
    val img: String,
    val name: String,
    val episode: String,
    val date: String,
): Serializable
