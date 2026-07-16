package de.christophprenissl.mobileskillsapp

import androidx.compose.ui.window.Window
import androidx.compose.ui.window.application

fun main() = application {
    Window(
        onCloseRequest = ::exitApplication,
        title = "MobileSkillsApp",
    ) {
        App()
    }
}