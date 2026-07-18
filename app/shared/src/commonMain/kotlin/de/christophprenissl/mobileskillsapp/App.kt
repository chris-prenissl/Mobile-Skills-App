package de.christophprenissl.mobileskillsapp

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import de.christophprenissl.mobileskillsapp.presentation.navigation.AppNavigation

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
@Preview
fun App() {
    MaterialTheme {
        AppNavigation()
    }
}