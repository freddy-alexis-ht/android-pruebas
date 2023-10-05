package com.sunday.myapps1.app2balotario1compose

import android.widget.ImageView
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.material.AlertDialog
import androidx.compose.material.Button
import androidx.compose.material.Text
import androidx.compose.material.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import com.sunday.myapps1.R

@Composable
fun App2Dialog(
    state: App2State,
    onDismiss: () -> Unit,
    onConfirm: () -> Unit
) {
    if (state.isDialogVisible) {
        AlertDialog(
            onDismissRequest = { onDismiss() },
            confirmButton = {
                TextButton(onClick = { onConfirm() }) {
                    Text(text = "ConfirmButton")
                }
            },
            dismissButton = {
                TextButton(onClick = { onDismiss() }) {
                    Text(text = "DismissButton")
                }
            },
            title = { Text(text = "Título") },
            text = {
                Column(
                    verticalArrangement = Arrangement.Top,
                    horizontalAlignment = Alignment.CenterHorizontally,
                    modifier = Modifier.padding(20.dp)
                ) {
                    Text(text = stringResource(id = R.string.app2_textResult))
                    if(state.answer == "BLACK") {
                        Text(text = "Correcto .. Domingo es de color ${state.answer}")
                        Image(painter = painterResource(id = R.drawable.alien), contentDescription = "Correcto")
                    }
                    else{
                        Text(text = "Incorrecto .. Domingo no es de color ${state.answer}")
                        Image(painter = painterResource(id = R.drawable.luna), contentDescription = "Incorrecto")
                    }
                }
            }
        )
    }
}