package com.sopt.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import kotlinx.serialization.Serializable

@Serializable
data object A

@Composable
fun AScreen(
    paddingValues: PaddingValues,
    navigateToB: (name: String) -> Unit,
) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "Hello, I'm Dongmin!\nThis is A Screen.")
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = {
                navigateToB(
                    "dongmin",
                )
            },
        ) {
            Text(text = "Click me!")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}
