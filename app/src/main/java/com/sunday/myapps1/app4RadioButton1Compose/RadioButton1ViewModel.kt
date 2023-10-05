package com.sunday.myapps1.app4RadioButton1Compose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class RadioButton1ViewModel: ViewModel() {
    var state by mutableStateOf(RadioButton1State())
        private set

    fun onEvent(event: RadioButton1Event) {
        when(event) {
            is RadioButton1Event.OnSelect -> {
                state = state.copy(
                    rbType = event.rbType
                )
            }
        }
    }
}