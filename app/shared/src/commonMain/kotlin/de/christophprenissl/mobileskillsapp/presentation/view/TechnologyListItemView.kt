package de.christophprenissl.mobileskillsapp.presentation.view

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ElevatedCard
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import de.christophprenissl.mobileskillsapp.domain.model.Technology
import de.christophprenissl.mobileskillsapp.presentation.util.cardHeight
import de.christophprenissl.mobileskillsapp.presentation.util.cardWidth
import de.christophprenissl.mobileskillsapp.presentation.util.paddingDefault

@Composable
@Preview
fun TechnologyListItemView(
    technology: Technology = Technology("Kotlin"),
    onTap: (() -> Unit)? = null
) {
    ElevatedCard(
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surfaceVariant
        ),
        modifier = Modifier.size(width = cardWidth, height = cardHeight)
            .clickable(enabled = onTap != null, onClick = { onTap?.invoke() })
    ) {
        Text(technology.name, modifier = Modifier.padding(paddingDefault))
    }
}