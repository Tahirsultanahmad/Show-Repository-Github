package com.example.showrepositorylistanddetail


sealed class Screen(val route : String){

    object IssuesScreen : Screen(route = "IssuesScreen")
    object PullRequestScreen : Screen(route = "PullRequestScreen")
    object DiscussionScreen : Screen(route = "DiscussionScreen")
    object ProjectsScreen : Screen(route = "ProjectsScreen")
    object RepositoriesScreen : Screen(route = "RepositoriesScreen")
    object OrganizationScreen : Screen(route = "OrganizationScreen")
    object StarredScreen : Screen(route = "StarredScreen")
    object MainScreen : Screen(route = "MainScreen")
    object DetailScreen : Screen(route = "DetailScreen")
}