package com.sunday.myapps1.app4RadioButton1Compose

data class RadioButton1State(
    var rbType: RbType = RbType.BLACK
)
enum class RbType {
    BLACK, WHITE, BROWN
}
