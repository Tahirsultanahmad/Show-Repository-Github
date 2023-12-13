package com.example.showrepositorylistanddetail

import android.os.Build
import android.provider.ContactsContract.CommonDataKinds.Email
import androidx.annotation.RequiresApi
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.sp

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun IssuesScreen(){
    val currentDate = null
    val selectedDates = listOf(currentDate)
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text (text = "Issues",
            color = Color.Black,
            fontSize = 20.sp,
            modifier = Modifier.align(Alignment.TopCenter)
        )
        CalendarView(
            selectedDates = selectedDates,
            onDateSelected = {  },
            context = LocalContext.current,
            isScheduled = true
        )


    }
}