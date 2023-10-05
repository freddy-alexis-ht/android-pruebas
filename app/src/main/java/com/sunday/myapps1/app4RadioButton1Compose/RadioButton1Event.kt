package com.sunday.myapps1.app4RadioButton1Compose

sealed class RadioButton1Event {
    data class OnSelect(val rbType: RbType): RadioButton1Event()
}