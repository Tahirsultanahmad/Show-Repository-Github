package com.example.showrepositorylistanddetail

import android.os.Build
import androidx.annotation.RequiresApi
import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.navArgument

@RequiresApi(Build.VERSION_CODES.O)
@Composable
fun navGraph(navController: NavHostController){
    NavHost(    navController = navController, startDestination = "mainScreen"
    ){
        composable(route = "IssuesScreen"){
            IssuesScreen()
        }
        composable(route = Screen.PullRequestScreen.route){
            DiscussionScreen(onClick = {navController.navigate(Screen.OrganizationScreen.route)})
        }
        composable(route = Screen.DiscussionScreen.route){
           OrganizationScreen()
        }
        composable(route = Screen.RepositoriesScreen.route){
            RepositoriesScreen(onItemClick ={Screen.DetailScreen.route})
        }
        composable(route = Screen.OrganizationScreen.route){
           OrganizationScreen()
        }
        composable(route = "DiscussionScreen"){
            PullRequestScreen(onclick = {"Repositories"})
        }
        composable(route = Screen.MainScreen.route){
            HomeScreen(navController = navController)
        }

        composable(route = "detailScreen/{email}", arguments = listOf(navArgument("email"){
            type = NavType.StringType
        })){
            val email = it.arguments?.getString("email")
            DetailScreen()
        }
    }
}