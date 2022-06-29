package com.example.spaceapp.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument
import com.example.spaceapp.screens.DetailsScreen
import com.example.spaceapp.screens.HomeScreen
import com.example.spaceapp.screens.VideoScreen
import com.example.spaceapp.viewmodel.SpaceAppViewModel

@Composable
fun SpaceAppNavigation(model: SpaceAppViewModel) {
    val navController = rememberNavController()
    NavHost(
        navController = navController,
        startDestination = ScreensEnum.HomeScreen.name
    ) {
        composable(ScreensEnum.HomeScreen.name) {
            HomeScreen(navController = navController, model = model)
        }
        composable(
            ScreensEnum.DetailsScreen.name + "/{planet}",
            arguments = listOf(navArgument(name = "planet") { type = NavType.StringType })
        ) { backStackEntry ->
            DetailsScreen(
                navController = navController, model = model,
                backStackEntry.arguments?.getString("planet")
            )
        }
        composable(
            ScreensEnum.VideoScreen.name + "/{planetID}",
            arguments = listOf(navArgument(name = "planetID") { type = NavType.StringType })
        ) { backStackEntry ->
            VideoScreen(
                navController = navController,
                backStackEntry.arguments?.getString("planetID")
            )
        }
    }

}