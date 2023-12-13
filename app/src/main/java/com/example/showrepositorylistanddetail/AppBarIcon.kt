//package com.example.showrepositorylistanddetail
//
//import androidx.compose.foundation.layout.Box
//import androidx.compose.foundation.layout.fillMaxWidth
//import androidx.compose.material3.Icon
//import androidx.compose.material3.IconButton
//import androidx.compose.material3.MaterialTheme
//import androidx.compose.material3.Text
//import androidx.compose.material3.TopAppBar
//import androidx.compose.runtime.Composable
//import androidx.compose.ui.Alignment
//import androidx.compose.ui.Modifier
//import androidx.compose.ui.graphics.Color
//import androidx.compose.ui.res.painterResource
//import androidx.compose.ui.unit.dp
//
//@Composable
//fun AppBarWithBackIconAndHeading(
//    backIconClick: () -> Unit,
//    title: String,
//    backgroundColor: Color = Color.Magenta
//) {
//    return TopAppBar(
//        backgroundColor = MaterialTheme.colorScheme.background.blue,
//        elevation = 0.dp,
//        modifier = Modifier.fillMaxWidth(),
//    ) {
//        //Navigation Icon
//        Box(
//            modifier = Modifier.fillMaxWidth()
//        ) {
//            IconButton(
//                onClick = { backIconClick() },
//                enabled = true,
//                modifier = Modifier.align(Alignment.CenterStart)
//            ) {
//                Icon(
//                    painter = painterResource(id = R.drawable.icon_previous),
//                    contentDescription = R.drawable.icon_previous.toString(),
//                    tint = Color.Black
//                )
//            }
//            Text(
//                text = title,
//                color = Color.DarkGray,
//                modifier = Modifier.align(Alignment.Center),
////                style = MaterialTheme.typography.body1.copy(
////                    lineHeight = 31.8.sp,
////                    fontSize = 20.sp,
////                    fontWeight = FontWeight.W600
////                )
//            )
//        }
//    }
//}
//
