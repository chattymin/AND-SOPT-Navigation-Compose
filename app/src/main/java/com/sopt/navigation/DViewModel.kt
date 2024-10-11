package com.sopt.navigation

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.navigation.toRoute

class DViewModel(
    savedStateHandle: SavedStateHandle,
) : ViewModel() {
    val profile = savedStateHandle.toRoute<D>()
}
