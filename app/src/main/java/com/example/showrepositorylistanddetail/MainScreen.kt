package com.example.showrepositorylistanddetail

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.verticalScroll
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.modifier.ModifierLocal
import androidx.compose.ui.modifier.modifierLocalConsumer
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController

@Composable
fun HomeScreen(navController: NavController){

    Column (modifier = Modifier.fillMaxSize()
        .padding(top = 12.dp, bottom = 12.dp, end = 12.dp, start = 12.dp)
        .verticalScroll(rememberScrollState())){
        Spacer(modifier = Modifier.height(32.dp))
        Row (modifier = Modifier.fillMaxSize()){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Your Image Description",
                modifier = Modifier
                    .size(32.dp) // Set the size of the image
                    .clip(CircleShape) // Clip the image to a circle shape
                    .background(MaterialTheme.colorScheme.background),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(24.dp))
            Text(
                modifier = Modifier.clickable {
                    navController.navigate(route = Screen.IssuesScreen.route)
                }.padding(top = 4.dp),
                text = "Issues",
                fontSize = 16.sp,
                color = Color.DarkGray,
            )


        }
        Spacer(modifier = Modifier.height(24.dp))
        Row (modifier = Modifier.fillMaxSize()){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Your Image Description",
                modifier = Modifier
                    .size(32.dp) // Set the size of the image
                    .clip(CircleShape) // Clip the image to a circle shape
                    .background(MaterialTheme.colorScheme.background),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(24.dp))
            Text(
                modifier = Modifier.clickable {
                    navController.navigate(route = Screen.PullRequestScreen.route)
                }.padding(top = 4.dp),
                text = "Pull Request",
                fontSize = 16.sp,
                color = Color.DarkGray,
            )


        }
        Spacer(modifier = Modifier.height(24.dp))
        Row (modifier = Modifier.fillMaxSize()){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Your Image Description",
                modifier = Modifier
                    .size(32.dp) // Set the size of the image
                    .clip(CircleShape) // Clip the image to a circle shape
                    .background(MaterialTheme.colorScheme.background),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(24.dp))
            Text(
                modifier = Modifier.clickable {
                    navController.navigate(route = Screen.DiscussionScreen.route)
                }.padding(top = 4.dp),
                text = "Discussions",
                fontSize = 16.sp,
                color = Color.DarkGray,
            )


        }
        Spacer(modifier = Modifier.height(24.dp))
        Row (modifier = Modifier.fillMaxSize()){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Your Image Description",
                modifier = Modifier
                    .size(32.dp) // Set the size of the image
                    .clip(CircleShape) // Clip the image to a circle shape
                    .background(MaterialTheme.colorScheme.background),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(24.dp))
            Text(
                modifier = Modifier.clickable {
                    navController.navigate(route = Screen.ProjectsScreen.route)
                }.padding(top = 4.dp),
                text = "Projects",
                fontSize = 16.sp,
                color = Color.DarkGray,
            )


        }
        Spacer(modifier = Modifier.height(24.dp))
        Row (modifier = Modifier.fillMaxSize()){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Your Image Description",
                modifier = Modifier
                    .size(32.dp) // Set the size of the image
                    .clip(CircleShape) // Clip the image to a circle shape
                    .background(MaterialTheme.colorScheme.background),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(24.dp))
            Text(
                modifier = Modifier.clickable {
                    navController.navigate(route = Screen.RepositoriesScreen.route)
                }.padding(top = 4.dp),
                text = "Repositories",
                fontSize = 16.sp,
                color = Color.DarkGray,
            )


        }
        Spacer(modifier = Modifier.height(24.dp))
        Row (modifier = Modifier.fillMaxSize()){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Your Image Description",
                modifier = Modifier
                    .size(32.dp) // Set the size of the image
                    .clip(CircleShape) // Clip the image to a circle shape
                    .background(MaterialTheme.colorScheme.background),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(24.dp))
            Text(
                modifier = Modifier.clickable {
                    navController.navigate(route = Screen.OrganizationScreen.route)
                }.padding(top = 4.dp),
                text = "Organization",
                fontSize = 16.sp,
                color = Color.DarkGray,
            )


        }
        Spacer(modifier = Modifier.height(24.dp))
        Row (modifier = Modifier.fillMaxSize()){
            Image(
                painter = painterResource(id = R.drawable.ic_launcher_background),
                contentDescription = "Your Image Description",
                modifier = Modifier
                    .size(32.dp) // Set the size of the image
//                    .clip(CircleShape) // Clip the image to a circle shape
                    .background(MaterialTheme.colorScheme.background),
                contentScale = ContentScale.Crop
            )
            Spacer(modifier = Modifier.width(24.dp))
            Text(
                modifier = Modifier.clickable {
                    navController.navigate(route = Screen.StarredScreen.route)
                }.padding(top = 4.dp),
                text = "Starred",
                fontSize = 16.sp,
                color = Color.DarkGray,
            )


        }

    }
}