package com.example.showrepositorylistanddetail

import android.content.Context
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.BoxWithConstraints
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.widthIn
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.BasicText
import androidx.compose.foundation.text.BasicTextField
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.material3.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.showrepositorylistanddetail.viewModel.RepositoryVM
import java.text.SimpleDateFormat
import java.time.DateTimeException
import java.time.Month
import java.time.Year
import java.time.YearMonth
import java.time.ZoneId
import java.util.Calendar
import java.util.Date
import java.util.Locale

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun OrganizationScreen(){

    val text = remember{ mutableStateOf("") }
    Box(
        modifier = Modifier
            .fillMaxSize()
            .padding(top = 200.dp),
        contentAlignment = Alignment.Center
    ) {
        Column(modifier = Modifier
            .fillMaxWidth()
            .align(Alignment.TopCenter)) {
            Text(text = text.value)

        }
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(32.dp)
            .align(Alignment.BottomCenter)
        )
            {
                Row (Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween,
                    verticalAlignment = Alignment.Top)
                {
                    ActionButton(
                        text = "1",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(12.dp)
                            .clickable { },
                        onClick = {text.value = (text.value + it).replace(" ","")}
                    )
                    ActionButton(
                        text = "2",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(12.dp),
                        onClick = {text.value = (text.value + it).replace(" ","")}
                    )
                    ActionButton(
                        text = "3",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(12.dp),
                        onClick = {text.value = (text.value + it).replace(" ","")}
                    )
                }
                Spacer(modifier = Modifier.height(24.dp))
                Row (Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween)
                {
                    ActionButton(
                        text = "4",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(12.dp),
                        onClick = {text.value = (text.value + it).replace(" ","")}
                    )
                    ActionButton(
                        text = "5",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(12.dp),
                        onClick = {text.value = (text.value + it).replace(" ","")}
                    )
                    ActionButton(
                        text = "6",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(12.dp),
                        onClick = {text.value = (text.value + it).replace(" ","")}
                    )
                }
                Spacer(modifier = Modifier.height(24.dp))
                Row (Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween)
                {
                    ActionButton(
                        text = "6",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(12.dp),
                        onClick = {text.value = (text.value + it).replace(" ","")}
                    )
                    ActionButton(
                        text = "8",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(12.dp),
                        onClick = {text.value = (text.value + it).replace(" ","")}
                    )
                    ActionButton(
                        text = "9",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(12.dp),
                        onClick = {text.value = (text.value + it).replace(" ","")}
                    )
                }
                Spacer(modifier = Modifier.height(24.dp))
                Row (Modifier.fillMaxWidth(),
                    horizontalArrangement = Arrangement.SpaceBetween)
                {
                    Card (modifier = Modifier
                        .width(90.dp)
                        .height(60.dp)
                        .clickable {
                            if (text.value.length > 0) {
                                text.value = text.value.dropLast(1)
                            }
                        },
                        shape = RoundedCornerShape(10.dp),
                        colors = CardDefaults.cardColors(Color.LightGray)

                    )
                    {
                        Column(modifier = Modifier
                            .height(60.dp)
                            .width(90.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally)
                        {

                            Image(
                                painter = painterResource(id = R.drawable.ic_clear_svg),
                                contentDescription = ""
                            )
                        }

                    }
                    ActionButton(
                        text = "0",
                        modifier = Modifier
                            .size(24.dp)
                            .padding(12.dp),
                        onClick = {text.value = (text.value + it).replace(" ","")}
                    )
                    Card (modifier = Modifier
                        .width(90.dp)
                        .height(60.dp)
                        ,
                        shape = RoundedCornerShape(10.dp),
                        colors = CardDefaults.cardColors(Color.LightGray)
                    )
                    {
                        Column(modifier = Modifier
                            .height(60.dp)
                            .width(90.dp),
                            verticalArrangement = Arrangement.Center,
                            horizontalAlignment = Alignment.CenterHorizontally)
                        {

                            Image(
                                painter = painterResource(id = R.drawable.ic_back_svg),
                                contentDescription = ""
                            )
                        }

                    }
                }
            }


//        Text (text = "Organization",
//            color = Color.Black,
//            fontSize = 20.sp
//
//        )


    }
}
