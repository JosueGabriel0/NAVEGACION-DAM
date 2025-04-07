@file:OptIn(ExperimentalMaterial3Api::class)

package pe.edu.upeu.navigationjpc.ui.presentation.screens

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import pe.edu.upeu.navigationjpc.ui.presentation.component.SearchBar
import pe.edu.upeu.navigationjpc.ui.presentation.component.SearchBarState

@Composable
fun ComponenteScreen() {
    // Declaramos el estado como mutableStateOf, que sí reacciona a cambios
    var searchQuery by remember { mutableStateOf("") }
    val searchState = SearchBarState(query = searchQuery)

    Column(modifier = Modifier.padding(16.dp)) {
        SearchBar(
            state = searchState,
            inputField = {
                TextField(
                    value = searchQuery,
                    onValueChange = {
                        searchQuery = it
                        searchState.query = it
                    },
                    label = { Text("Search") },
                    modifier = Modifier.fillMaxWidth()
                )
            }
        )
        Text("Buscar: ${searchQuery}")
    }
}

@Preview(showBackground = true)
@Composable
fun PreviewComponenteScreen() {
    ComponenteScreen()
}