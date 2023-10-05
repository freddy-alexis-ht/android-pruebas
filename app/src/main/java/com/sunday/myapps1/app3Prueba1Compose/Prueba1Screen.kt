package com.sunday.myapps1.app3Prueba1Compose

import android.util.Log
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.runtime.*

@Composable
fun Prueba1Screen(
    state: Prueba1State,
    screenFunction: (Prueba1Event) -> Unit
) {
    Button(onClick = { screenFunction(Prueba1Event.OnClick) })
    {
        Text(text = state.n.toString())
    }
}