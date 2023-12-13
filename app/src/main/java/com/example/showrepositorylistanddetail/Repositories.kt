package com.example.showrepositorylistanddetail

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.example.showrepositorylistanddetail.viewModel.RepositoryVM

@Composable
fun RepositoriesScreen(onItemClick: (String) -> Unit){
    val repositoryVM : RepositoryVM = hiltViewModel()


    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(horizontal = 32.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        LazyColumn(
            modifier = Modifier
                .fillMaxWidth()
                .weight(1f),
            userScrollEnabled = true
        ) {
            items(
                getRepositories()){item ->
                RepositoriesList(img = R.drawable.ic_launcher_background,
                     title = item.title, designation =item.designation , onItemClick = {onItemClick("Tahir@gamil.com")})
            }
        }

        Spacer(modifier = Modifier.height(24.dp))

    }
}