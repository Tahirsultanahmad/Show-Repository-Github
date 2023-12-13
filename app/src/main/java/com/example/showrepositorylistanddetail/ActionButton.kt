package com.example.showrepositorylistanddetail

import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun ActionButton(
    text: String,
    onClick: (String) -> Unit,
    modifier: Modifier = Modifier,
    isEnabled: Boolean = true,
    buttonBgColor: Color = Color.LightGray,
    textColor: Color = Color.Black
) {

    Button(
        onClick = {onClick(text)}, shape = RoundedCornerShape(10.dp),
             modifier = Modifier.height(60.dp).width(90.dp),
        colors = ButtonDefaults.buttonColors(buttonBgColor)
    )

            {
                Text (text = text,
                    color = Color.Black,
                    fontSize = 20.sp

                )
    }
}