package com.sunday.myapps1.app2balotario1compose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class App2ViewModel: ViewModel() {

    var state by mutableStateOf(App2State())
        private set
    var color by mutableStateOf(ColorType.WHITE)
        private set

    fun onEvent(event: App2Event) {
        when(event){
            is App2Event.ShowDialog -> {
                state = state.copy(isDialogVisible = true, answer = event.answer)
//                state.answer = event.answer
            }
            is App2Event.HideDialog -> {
                state = state.copy(isDialogVisible = false)
            }
            is App2Event.OnChangeColor -> {
                state = state.copy(colorType = event.color)
            }
        }
    }


}