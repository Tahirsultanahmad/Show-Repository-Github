package com.example.showrepositorylistanddetail

import android.content.Context
import android.os.Build
import android.widget.Toast
import androidx.annotation.RequiresApi
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
import androidx.compose.material3.Card
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import java.text.SimpleDateFormat
import java.time.DateTimeException
import java.time.Month
import java.time.Year
import java.time.YearMonth
import java.time.ZoneId
import java.time.format.TextStyle
import java.util.Calendar
import java.util.Date
import java.util.Locale

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun CalendarView(
    selectedDates: List<Date?>,
    onDateSelected: (Date) -> Unit,
    context: Context,
    isScheduled: Boolean
) {
    val currentTimeMillis = System.currentTimeMillis()
    val currentDate = remember { mutableStateOf(Date(currentTimeMillis)) }
    val interviewDate = currentDate
    var currentMonth by remember { mutableStateOf(currentDate.value.month) }
    val currentMonthEnum = Month.of(currentMonth + 1)
    var singleBoxWidth= 0.dp
    var currentYearMonth by remember { mutableStateOf(Year.now()) }

    Column(modifier = Modifier
        .fillMaxWidth()
        .padding(8.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Row(
            modifier = Modifier.fillMaxWidth(),
            horizontalArrangement = Arrangement.Start,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Text(
                text = currentMonthEnum.getDisplayName(TextStyle.FULL, Locale.getDefault()) + " " + currentYearMonth.value,
                style = androidx.compose.ui.text.TextStyle(
                    fontWeight = FontWeight.W600,
                    fontSize = 15.sp,
                    lineHeight = 31.8.sp,
                ),
                color = Color.LightGray,
                modifier = Modifier
                    .fillMaxWidth()
                    .weight(1f)
            )
            IconButton(onClick = {
                currentMonth -= 1
                if(currentMonth == -1){
                    currentMonth = 11
                }
                if (getMonthFromInt(currentMonth) == Month.DECEMBER) {
                    currentYearMonth = currentYearMonth.minusYears(1)
                }
            }) {
                Icon(painter = painterResource(id = R.drawable.ic_back_calender), contentDescription = "Previous Month", tint = Color.LightGray)
            }
            Spacer(modifier = Modifier.width(40.dp))
            IconButton(onClick = {
                currentMonth += 1
                if(currentMonth == 12){
                    currentMonth = 0
                }
                if (getMonthFromInt(currentMonth) == Month.JANUARY) {
                    currentYearMonth = currentYearMonth.plusYears(1)
                }

            }) {
                Icon(painter = painterResource(id = R.drawable.ic_next_calender), contentDescription = "Next Month",tint = Color.LightGray)
            }
        }
        Spacer(modifier = Modifier.height(12.dp))
        Divider(
            thickness = 1.dp,
            modifier = Modifier.fillMaxWidth(),
            color = Color.LightGray
        )
        Spacer(modifier = Modifier.height(12.dp))
        BoxWithConstraints(modifier = Modifier.fillMaxWidth()) {
            val width = maxWidth - 16.dp
            singleBoxWidth = (width/7)
            Row(
                modifier = Modifier
                    .fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically,
                horizontalArrangement = Arrangement.SpaceBetween

            ) {
                Text(
                    text = "Mon",
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.widthIn(min = singleBoxWidth,max = singleBoxWidth)
                )
                Text(
                    text = "Tue",
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.widthIn(min = singleBoxWidth,max = singleBoxWidth)
                )
                Text(
                    text = "Wed",
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.widthIn(min = singleBoxWidth,max = singleBoxWidth)
                )
                Text(
                    text = "Thu",
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.widthIn(min = singleBoxWidth,max = singleBoxWidth)
                )
                Text(
                    text = "Fri",
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.widthIn(min = singleBoxWidth,max = singleBoxWidth)
                )
                Text(
                    text = "Sat",
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.widthIn(min = singleBoxWidth,max = singleBoxWidth)
                )
                Text(
                    text = "Sun",
                    color = Color.LightGray,
                    textAlign = TextAlign.Center,
                    modifier = Modifier.widthIn(min = singleBoxWidth,max = singleBoxWidth)
                )
            }
        }

        val calendar = Calendar.getInstance()
        calendar.time = currentDate.value
        val currentYear = calendar.get(Calendar.YEAR)
        val yearMonth = YearMonth.of(currentYear, currentMonth + 1)
        val firstDayOfMonth = yearMonth.atDay(1).dayOfWeek.value
        val lastDayOfMonth = yearMonth.atEndOfMonth().dayOfMonth
        val totalDays =
            (firstDayOfMonth - 1) + lastDayOfMonth + (7 - (firstDayOfMonth + lastDayOfMonth - 1) % 7) % 7

        LazyVerticalGrid(
            GridCells.Fixed(7),
            modifier = Modifier
//                .fillMaxWidth()
                .align(Alignment.CenterHorizontally)
                .padding(top = 24.dp)//start = 24.dp
        ) {
            items(totalDays) { index ->
                val dayOfMonth =
                    if (index >= firstDayOfMonth - 1 && index < firstDayOfMonth + lastDayOfMonth + 1) {
                        index - (firstDayOfMonth - 2)
                    } else if (index < firstDayOfMonth - 1) {
                        -1
                    } else {
                        index - (firstDayOfMonth) + 2
                    }
                val localDate = try {
                    yearMonth.atDay(dayOfMonth)

                } catch (e: DateTimeException) {
                    null
                }
                val date: Date? = localDate?.let {
                    Date.from(it.atStartOfDay(ZoneId.systemDefault()).toInstant())
                }

                if (date != null) {
                    val isSelected = selectedDates.contains(date)
                    val isCurrentMonth =
                        index >= firstDayOfMonth - 1 && index < firstDayOfMonth + lastDayOfMonth - 1
                    val backgroundColor =
                        if (isSelected) Color.Green else if(compareDates(date,interviewDate.value)) Color.Black  else Color.Gray
                    val sdf = SimpleDateFormat("EEEE", Locale.getDefault())
                    val dayName = sdf.format(date)
                    val textColor = if (isSelected || compareDates(date,interviewDate.value)) Color.White else if(dayName?.lowercase(
                            Locale.getDefault()) == "sunday") Color.Red else Color.Black
//

                    Box(
                        modifier = Modifier
                            .clip(CircleShape)
                            .size(singleBoxWidth)
                            .background(Color.Transparent),

                        ) {
                        Card(
                            modifier = Modifier
                                .clip(CircleShape)
                                .size(singleBoxWidth.minus(6.dp))
                                .align(Alignment.Center)
                                .clickable {
                                    if (checkDates(date, currentDate.value)) {
                                        interviewDate.value = date
                                        onDateSelected(date)
                                    } else {
                                        if (isScheduled == false) {
                                            Toast
                                                .makeText(
                                                    context,
                                                    "Please select from current and future date!",
                                                    Toast.LENGTH_SHORT
                                                )
                                                .show()
                                        }
                                    }
                                },

                            shape = CircleShape,
                            ) {
                            Column(
                                modifier = Modifier.fillMaxSize(),
                                horizontalAlignment = Alignment.CenterHorizontally,
                                verticalArrangement = Arrangement.Center
                            ) {
                                Text(
                                    text = dayOfMonth.toString(),
                                    style = androidx.compose.ui.text.TextStyle(
                                        fontSize = 12.sp,
                                        fontWeight = FontWeight.W600,
                                        lineHeight = 14.4.sp
                                    ),
                                    color = textColor,
                                    maxLines = 1,
                                )
                            }
                        }
                    }
                }
            }
        }
    }
}
@RequiresApi(Build.VERSION_CODES.O)
fun getMonthFromInt(monthValue: Int): Month {
    return when (monthValue) {
        0 -> Month.JANUARY
        1 -> Month.FEBRUARY
        2 -> Month.MARCH
        3 -> Month.APRIL
        4 -> Month.MAY
        5 -> Month.JUNE
        6 -> Month.JULY
        7 -> Month.AUGUST
        8 -> Month.SEPTEMBER
        9 -> Month.OCTOBER
        10 -> Month.NOVEMBER
        11 -> Month.DECEMBER
        else -> throw IllegalArgumentException("Invalid month value: $monthValue")
    }
}
@RequiresApi(Build.VERSION_CODES.O)
fun compareDates(date1: Date, date2: Date): Boolean{
    val localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
    val localDate2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
    val result = localDate1.compareTo(localDate2)

    return  result == 0
}
@RequiresApi(Build.VERSION_CODES.O)
fun checkDates(date1: Date, date2: Date): Boolean {
    val localDate1 = date1.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
    val localDate2 = date2.toInstant().atZone(ZoneId.systemDefault()).toLocalDate()
    return localDate1 >= localDate2
}