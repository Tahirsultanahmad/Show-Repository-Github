package com.example.showrepositorylistanddetail

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.offset
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.showrepositorylistanddetail.R

@Composable
fun RepositoriesList(onItemClick : () -> Unit,img :Int,title : String,designation :String) {
    Card(
        modifier = Modifier
            .fillMaxWidth()
            .clickable {
                onItemClick()
            }
            .padding(12.dp),
        shape = RoundedCornerShape(12.dp),

        ) {
        Column(
            modifier = Modifier
                .fillMaxWidth()
                .padding(8.dp)
        ) {
            Row(
                modifier = Modifier.fillMaxWidth(),
                verticalAlignment = Alignment.CenterVertically
            ) {
                Image(
                    painter = painterResource(id = img),
                    contentDescription = R.drawable.customer_jobs.toString(),
                    modifier = Modifier
                        .size(
                            width = 24.dp,
                            height = 24.dp
                        )
                        .clip(CircleShape)
                )

                extracted(title,designation)
            }
        }
    }

}

@Composable
public fun extracted(title: String,designation: String) {
    Column(
        horizontalAlignment = Alignment.Start
    ) {
        Spacer(modifier = Modifier.width(16.dp))

        Text(
            modifier = Modifier.padding(start = 24.dp),
            text = designation,
            color = Color.Black,
            lineHeight = 9.sp,
            fontSize = 12.sp,
            textAlign = TextAlign.Start
        )
        Text(
            modifier = Modifier.padding(start = 24.dp),
            text = title,
            color = Color.Black,
            lineHeight = 9.sp,
            fontSize = 12.sp,
            textAlign = TextAlign.Start
        )

    }
}


data class RepositoryList(val img : Int, val title: String, val designation :String)
    fun getRepositories(): MutableList<RepositoryList> {
        val list = mutableListOf<RepositoryList>()
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Ali",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Hassan",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Ammar",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Husnain",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Ali",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Hassan",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Ammar",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Husnain",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Ali",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Hassan",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Ammar",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Husnain",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Ali",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Hassan",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Ammar",
            title = "Developer",
        ))
        list.add(RepositoryList(
            img = R.drawable.ic_launcher_background,
            designation = "Husnain",
            title = "Developer",
        ))
        return list
    }


//@Preview
//@Composable
//fun PreviewItem() {
//    Column (){
//        getRepositories().map{ item ->
//            RepositoriesList( img = item.img, title = item.title, designation =item.designation )
//        }
//    }
////    RepositoriesList(
////        img = com.example.showrepositorylistanddetail.R.drawable.customer_jobs,
////        title = "Ali",
////        designation = "Developer"
////    )
//}
