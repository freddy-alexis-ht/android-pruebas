package com.sunday.myapps1.app2balotario1compose

sealed class App2Event {
    data class ShowDialog(val answer: String): App2Event()
//    object ShowDialog: App2Event()
    object HideDialog: App2Event()
//    data class OnSendAnswer(val answer: String): App2Event()
    data class OnChangeColor(val color: ColorType): App2Event()
}
