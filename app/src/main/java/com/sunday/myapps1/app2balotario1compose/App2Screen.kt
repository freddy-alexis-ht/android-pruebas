package com.sunday.myapps1.app2balotario1compose

import android.util.Log
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.RadioButton
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.sunday.myapps1.R

@Composable
fun App2Screen(
    state: App2State,
    onEvent: (App2Event) -> Unit
) {
    Column(
        modifier = Modifier.padding(20.dp),
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = stringResource(id = R.string.app2_textTitle).uppercase(),
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(12.dp)
        )
        Text(
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp),
            text = stringResource(id = R.string.app2_textQuestion),
            fontSize = 18.sp,
            fontWeight = FontWeight.Bold,
        )

        ColorRadioGroup(state, onEvent)

        Button(
            onClick = {
                onEvent(App2Event.ShowDialog(state.colorType.name))
            }
        ) {
            Text(text = stringResource(id = R.string.app2_btnSend))
        }
        App2Dialog(
            state = state,
            { onEvent(App2Event.HideDialog) },
            { Log.i("MyTag", "Click") }
        )
    }
}

@Composable
private fun ColorRadioGroup(
    state: App2State,
    onEvent: (App2Event) -> Unit
) {
    ColorType.values().forEach {
        Row(
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically,
            modifier = Modifier
                .fillMaxWidth()
                .padding(start = 12.dp)
                .clickable { onEvent(App2Event.OnChangeColor(it)) }
        ) {
            RadioButton(
                selected = state.colorType == it,
                onClick = {
                    onEvent(App2Event.OnChangeColor(it))
                    Log.i("MyTag", state.toString())
                }
            )
            Text(
                text = it.name,
                fontSize = 16.sp
            )
        }
    }
}
