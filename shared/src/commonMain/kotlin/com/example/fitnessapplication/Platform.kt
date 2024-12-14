package com.example.fitnessapplication

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform