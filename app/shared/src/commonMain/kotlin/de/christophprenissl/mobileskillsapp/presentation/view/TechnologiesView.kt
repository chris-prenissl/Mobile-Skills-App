package de.christophprenissl.mobileskillsapp.presentation.view

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeContentPadding
import androidx.compose.material3.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import androidx.lifecycle.viewmodel.compose.viewModel
import de.christophprenissl.mobileskillsapp.data.repository.TechnologyRepositoryImpl
import de.christophprenissl.mobileskillsapp.domain.model.Technology
import de.christophprenissl.mobileskillsapp.presentation.util.paddingDefault
import de.christophprenissl.mobileskillsapp.presentation.viewModel.TechnologiesViewModel

@Composable
fun TechnologiesView(
    technologyViewModel: TechnologiesViewModel = viewModel {
        TechnologiesViewModel(TechnologyRepositoryImpl())
    },
    onViewTap: ((Technology) -> Unit)? = null
) {
    val uiState by technologyViewModel.uiState.collectAsStateWithLifecycle()

    Column(
        modifier = Modifier
            .background(MaterialTheme.colorScheme.primaryContainer)
            .safeContentPadding()
            .padding(paddingDefault)
            .fillMaxSize(),
        verticalArrangement = Arrangement.spacedBy(paddingDefault)
    ) {
        for (technology in uiState.technologies) {
            TechnologyListItemView(
                technology = technology,
                onTap = { onViewTap?.invoke(technology) }
            )
        }
    }
}