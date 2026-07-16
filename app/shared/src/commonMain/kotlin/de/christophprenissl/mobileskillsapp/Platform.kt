package de.christophprenissl.mobileskillsapp

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform