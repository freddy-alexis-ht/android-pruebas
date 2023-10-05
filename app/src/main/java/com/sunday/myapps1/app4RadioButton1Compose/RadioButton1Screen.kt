package com.sunday.myapps1.app4RadioButton1Compose

import android.widget.RadioButton
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember

@Composable
fun RadioButton1Screen(
    state: RadioButton1State,
    onEvent: (RadioButton1Event) -> Unit
) {
    Column() {
        RbType.values().forEach {
            Row() {
                RadioButton(
                    selected = state.rbType == it,
                    onClick = { onEvent(RadioButton1Event.OnSelect(it)) }
                )
                Text(text = it.toString())
            }
        }
    }
}