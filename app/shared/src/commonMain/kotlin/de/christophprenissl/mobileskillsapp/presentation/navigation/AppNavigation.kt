package de.christophprenissl.mobileskillsapp.presentation.navigation

import androidx.compose.material3.adaptive.ExperimentalMaterial3AdaptiveApi
import androidx.compose.material3.adaptive.layout.AnimatedPane
import androidx.compose.material3.adaptive.layout.ListDetailPaneScaffold
import androidx.compose.material3.adaptive.layout.ThreePaneScaffoldRole
import androidx.compose.material3.adaptive.navigation.rememberListDetailPaneScaffoldNavigator
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import de.christophprenissl.mobileskillsapp.domain.model.Technology
import de.christophprenissl.mobileskillsapp.presentation.util.primaryPaneWidth
import de.christophprenissl.mobileskillsapp.presentation.view.TechnologiesView
import de.christophprenissl.mobileskillsapp.presentation.view.TechnologyDetailView
import kotlinx.coroutines.launch

@OptIn(ExperimentalMaterial3AdaptiveApi::class)
@Composable
fun AppNavigation() {
    val coroutineScope = rememberCoroutineScope()
    val scaffoldNavigator = rememberListDetailPaneScaffoldNavigator<Technology>()
    val selectedItem = scaffoldNavigator.currentDestination?.contentKey

    ListDetailPaneScaffold(
        directive = scaffoldNavigator.scaffoldDirective,
        scaffoldState = scaffoldNavigator.scaffoldState,
        listPane = {
            AnimatedPane(modifier = Modifier.preferredWidth(primaryPaneWidth)) {
                TechnologiesView(onViewTap = { technology ->
                    coroutineScope.launch {
                        scaffoldNavigator.navigateTo(
                            pane = ThreePaneScaffoldRole.Primary,
                            contentKey = technology
                        )
                    }
                })
            }
        },
        detailPane = {
            AnimatedPane {
                if (selectedItem != null)
                    TechnologyDetailView(
                        technology = selectedItem,
                        onBackTap = {
                            coroutineScope.launch {
                                scaffoldNavigator.navigateBack()
                            }
                        }
                    )
            }
        },
    )
}