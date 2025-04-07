@file:OptIn(ExperimentalMaterial3Api::class)

package pe.edu.upeu.navigationjpc.ui.presentation.component

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.Dp

data class SearchBarState(var query: String = "")

@Composable
fun SearchBar(
    state: SearchBarState,
    inputField: @Composable () -> Unit,
    modifier: Modifier = Modifier,
    shape: Shape = SearchBarDefaults.inputFieldShape,
    colors: SearchBarColors = SearchBarDefaults.colors(),
    tonalElevation: Dp = SearchBarDefaults.TonalElevation,
    shadowElevation: Dp = SearchBarDefaults.ShadowElevation
) {
    Surface(
        modifier = modifier,
        shape = shape,
        color = colors.containerColor,
        tonalElevation = tonalElevation,
        shadowElevation = shadowElevation
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            inputField() // ahora ya no se pasa el state directamente
        }
    }
}
