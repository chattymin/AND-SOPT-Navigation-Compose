package com.sopt.navigation

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.lifecycle.viewmodel.compose.viewModel
import kotlinx.serialization.Serializable

@Serializable
data class D(
    val id: String,
    val password: String,
)

@Composable
fun DScreen(
    paddingValues: PaddingValues,
    viewModel: DViewModel = viewModel(),
) {
    val profile = remember { viewModel.profile }
    Column(
        modifier = Modifier
            .padding(paddingValues)
            .fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
    ) {
        Spacer(modifier = Modifier.weight(1f))
        Text(text = "Hello, my ID is ${profile.id}!\nmy password is ${profile.password}")
        Spacer(modifier = Modifier.weight(1f))
    }
}
