package com.example.samewave.ui.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.samewave.ui.screens.auth.LoginScreen
import com.example.samewave.ui.screens.auth.WelcomeScreen

@Composable
fun NavGraph (navController:NavHostController){
    NavHost(
        navController = navController,
        startDestination = Screen.Welcome.route

    )

    {
        composable(route = Screen.Welcome.route) {
            WelcomeScreen(navController)
        }
        composable(route = Screen.Login.route){
            LoginScreen(navController)
        }
//        composable(route = Screen.Register.route) {
//                RegisterScreen(navController)
//
//        }

    }

}