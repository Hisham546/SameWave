package com.example.samewave.ui

import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.samewave.ui.navigation.NavGraph

@Composable
fun SameWaveApp(){
    val navController = rememberNavController()
    NavGraph(navController)
}