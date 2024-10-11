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
data class B(
    val name: String,
)

@Composable
fun BScreen(
    paddingValues: PaddingValues,
    name: String,
    navigateToC: (id: String, password: String) -> Unit,
) {
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "Hello, I'm $name!\nThis is B Screen.")
        Spacer(modifier = Modifier.weight(1f))
        Button(
            onClick = {
                navigateToC(
                    "dongmin ID",
                    "password"
                )
            },
        ) {
            Text(text = "Click me!")
        }
        Spacer(modifier = Modifier.weight(1f))
    }
}
