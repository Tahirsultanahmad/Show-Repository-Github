package com.example.showrepositorylistanddetail

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.grid.GridCells
import androidx.compose.foundation.lazy.grid.LazyVerticalGrid
import androidx.compose.foundation.lazy.grid.items
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.ViewModel
import androidx.navigation.NavController
import com.example.showrepositorylistanddetail.viewModel.RepositoryVM

@Composable
fun DiscussionScreen(onClick : () -> Unit){
    val viewModel = RepositoryVM()
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text (text = "Discussion",modifier = Modifier
            .clickable { onClick() }
            .align(Alignment.TopCenter),
            color = Color.Black,
            fontSize = 20.sp

        )
        LazyVerticalGrid(
            GridCells.Fixed(2),
            modifier = Modifier
                .fillMaxWidth()
                .padding(12.dp)
        ){
            items(viewModel.list){
                CardItem(
                    image = R.drawable.ic_back_svg,
                    name = it
                )
            }
        }
    }
}

