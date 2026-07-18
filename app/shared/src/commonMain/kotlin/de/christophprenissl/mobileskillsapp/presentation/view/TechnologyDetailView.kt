package de.christophprenissl.mobileskillsapp.presentation.view

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.ElevatedButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import de.christophprenissl.mobileskillsapp.domain.model.Technology
import de.christophprenissl.mobileskillsapp.presentation.util.paddingHigh

@Composable
@Preview
fun TechnologyDetailView(
    technology: Technology = Technology(name = "Kotlin"),
    onBackTap: () -> Unit = {}
) {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.SpaceBetween,
        modifier = Modifier
            .padding(paddingHigh)
            .fillMaxSize()
    ) {
        Text(technology.name)
        ElevatedButton(onClick = onBackTap) {
            Text("Go back")
        }
    }
}