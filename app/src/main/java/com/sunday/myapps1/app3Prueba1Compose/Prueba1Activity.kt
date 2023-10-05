package com.sunday.myapps1.app3Prueba1Compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.lifecycle.viewmodel.compose.viewModel
import com.sunday.myapps1.app3Prueba1Compose.ui.theme.MyApps1Theme

class Prueba1Activity : ComponentActivity() {
//    private val viewModel: Prueba1ViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApps1Theme {
                val viewModel = viewModel<Prueba1ViewModel>()
                var state = viewModel.state
                Prueba1Screen(
                    state = state,
                    screenFunction = viewModel::onEvent
                )
            }
        }
    }
}
