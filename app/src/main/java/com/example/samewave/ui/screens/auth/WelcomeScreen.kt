package com.example.samewave.ui.screens.auth

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.samewave.ui.theme.Pink40
import kotlinx.coroutines.launch

@Composable
fun WelcomeScreen(navController: NavHostController){
    val coroutineScope = rememberCoroutineScope()

    Column (modifier = Modifier
        .fillMaxSize()
    ) {
        Button(
            onClick = {
                coroutineScope.launch {
                    try {

                    } finally {
                        //navController.navigate("home_screen")
                    }
                }
            },
            shape = RoundedCornerShape(8.dp),
            modifier = Modifier
                .height(50.dp)
                .width(280.dp),
            colors = ButtonDefaults.buttonColors(Pink40)
        ) {
            Text(
                text = "Add Expense",
                color = Color.White,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp
            )
        }
    }
}