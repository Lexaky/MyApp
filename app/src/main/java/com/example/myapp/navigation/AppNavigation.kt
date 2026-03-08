package com.example.myapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.example.myapp.screens.DetailsScreen
import com.example.myapp.screens.HomeScreen

sealed class Screen(val route: String) {
    object Home : Screen("home")
    object Details : Screen("details")
}
@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screen.Home.route
    ) {
        composable(Screen.Home.route) {
            HomeScreen(onNavigateToDetails = {
                navController.navigate("details")
            })
        }
        composable(Screen.Details.route) {
            DetailsScreen(onBack = {
                navController.popBackStack()
            })
        }
    }
}