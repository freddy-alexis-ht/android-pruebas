package com.sunday.myapps1.app2balotario1compose

import com.sunday.myapps1.R

data class App2State(
    var answer: String = "",
    var isDialogVisible: Boolean = false,
    var colorType: ColorType = ColorType.WHITE,
)

enum class ColorType/*(color: Int)*/ {
//    WHITE(R.string.app2_rbWhite),
//    BLACK(R.string.app2_rbBlack),
//    BROWN(R.string.app2_rbBrown),
    WHITE, BLACK, BROWN
}
