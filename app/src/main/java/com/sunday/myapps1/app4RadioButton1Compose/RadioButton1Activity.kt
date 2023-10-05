package com.sunday.myapps1.app4RadioButton1Compose

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.sunday.myapps1.app4RadioButton1Compose.ui.theme.MyApps1Theme

class RadioButton1Activity : ComponentActivity() {
    private val viewModel: RadioButton1ViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            MyApps1Theme {
                var state = viewModel.state
                RadioButton1Screen( state, viewModel::onEvent )
            }
        }
    }
}
