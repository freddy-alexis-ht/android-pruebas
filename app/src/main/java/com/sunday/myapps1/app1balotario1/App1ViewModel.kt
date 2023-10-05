package com.sunday.myapps1.app1balotario1

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class App1ViewModel: ViewModel() {

    private val _state = MutableLiveData<AppState>()
    var state = _state

    fun onCreate() {
        state.value = AppState()
    }

    fun onEvent(event: UiEvent) {
        when(event){
            is UiEvent.ShowDialog -> {
                _state.value?.isDialogVisible = true
            }
            is UiEvent.HideDialog -> {
                _state.value?.isDialogVisible = false
            }
            is UiEvent.OnSendAnswer -> {
                _state.value?.answer = event.answer
            }
        }
    }
}