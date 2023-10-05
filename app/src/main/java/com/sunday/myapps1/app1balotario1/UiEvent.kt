package com.sunday.myapps1.app1balotario1

sealed class UiEvent {
    object ShowDialog: UiEvent()
    object HideDialog: UiEvent()
    data class OnSendAnswer(val answer: String): UiEvent()
}
