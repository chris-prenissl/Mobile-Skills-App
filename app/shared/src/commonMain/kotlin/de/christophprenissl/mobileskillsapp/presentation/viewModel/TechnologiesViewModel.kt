package de.christophprenissl.mobileskillsapp.presentation.viewModel

import androidx.lifecycle.ViewModel
import de.christophprenissl.mobileskillsapp.domain.repository.TechnologyRepository
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow

class TechnologiesViewModel(
    private val technologyRepository: TechnologyRepository
) : ViewModel() {
    val uiState: StateFlow<TechnologiesUIState>
        field = MutableStateFlow(TechnologiesUIState(technologies = technologyRepository.getAllTechnologies()))
}