package com.sunday.myapps1.app3Prueba1Compose

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class Prueba1ViewModel: ViewModel() {

    var state by mutableStateOf(Prueba1State())
    private set

    fun onEvent(event:Prueba1Event){
        when(event){
            Prueba1Event.OnClick -> state = state.copy(n = state.n.inc())
        }
    }
}