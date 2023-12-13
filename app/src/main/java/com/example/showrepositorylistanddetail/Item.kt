package com.example.showrepositorylistanddetail

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp

@Composable
fun CardItem (
    @DrawableRes image: Int,
    name: String
){
    Card (modifier = Modifier.padding(24.dp)
        .width(200.dp)
        .height(160.dp)
        .clickable {},
        shape = RoundedCornerShape(10.dp),
        colors = CardDefaults.cardColors(Color.LightGray)

    ) {
        Column(modifier = Modifier
            .height(160.dp)
            .width(200.dp),
            verticalArrangement = Arrangement.Center,
            horizontalAlignment = Alignment.CenterHorizontally)
        {

            Image(
                painter = painterResource(id = image),
                contentDescription = "",
            )
            Spacer(modifier = Modifier.height(12.dp))
            Text(
                text = name,
                modifier = Modifier.fillMaxWidth().padding(12.dp)
                    .align(Alignment.CenterHorizontally),
                color = Color.White,
                textAlign = TextAlign.Center
                )
        }
    }
}