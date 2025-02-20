package com.example.itsme.ui.theme

import androidx.compose.material3.Typography
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp
import com.example.itsme.R

val marioFont = FontFamily(
    Font(R.font.mario)
)

val philoFont = FontFamily(
    Font(R.font.philosopher_regular),
    Font(R.font.philosopher_bold, weight = FontWeight.Bold),
    Font(R.font.philosopher_italic, style = FontStyle.Italic),
    Font(R.font.philosopher_bold_italic, weight = FontWeight.Bold,style = FontStyle.Italic)
)



// Set of Material typography styles to start with
val Typography = Typography(
    bodyLarge = TextStyle(
        fontFamily = philoFont,
        fontWeight = FontWeight.Normal,
        fontSize = 18.sp
    ),
    headlineLarge = TextStyle(
        fontFamily = marioFont,
        fontSize = 40.sp,
        color = LIGHT_GREY
    ),
headlineMedium = TextStyle(
fontFamily = philoFont,
fontSize = 25.sp,
    fontWeight = FontWeight.Bold
)


)