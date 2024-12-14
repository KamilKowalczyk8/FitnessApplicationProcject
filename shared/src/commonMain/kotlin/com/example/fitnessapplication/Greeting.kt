package com.example.fitnessapplication

class Greeting {
    private val platform: Platform = getPlatform()

    fun greet(): String {
        return "Helloo, ${platform.name}!"

    }
}