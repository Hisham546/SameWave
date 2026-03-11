package com.example.samewave.ui.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.samewave.ui.theme.lightGreen
import kotlinx.coroutines.launch

import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.text.style.TextAlign


@Composable
fun WelcomeScreen(navController: NavHostController){
    val coroutineScope = rememberCoroutineScope()
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally // Centers children horizontally
    ) {
        // 1. TOP BOX
   Box(
        modifier = Modifier
            .fillMaxWidth()
            .fillMaxHeight(0.55f)
            .clip(object : Shape {
                override fun createOutline(
                    size: androidx.compose.ui.geometry.Size,
                    layoutDirection: androidx.compose.ui.unit.LayoutDirection,
                    density: androidx.compose.ui.unit.Density
                ): Outline {

                    val path = Path().apply {
                        moveTo(0f, 0f)
                        lineTo(0f, size.height * 0.85f)

                        quadraticTo(
                            size.width / 2,
                            size.height,
                            size.width,
                            size.height * 0.85f
                        )
                        lineTo(size.width, 0f)
                        close()
                    }
                    return Outline.Generic(path)
                }
            })
            .background(lightGreen)
    )

    // 2. CENTER TEXT (Fills the remaining space between top and button)
    Box(
        modifier = Modifier
            .weight(1f) // This takes up all available space
            .fillMaxWidth(),
        contentAlignment = Alignment.Center // Centers the text inside that space
    ) {
        Column (
            modifier = Modifier
                .padding(horizontal = 32.dp)
            ,
            horizontalAlignment = Alignment.CenterHorizontally

        ) {
            Text(
                text = "You're never alone in how you feel.",
                color = Color.Black,
                fontWeight = FontWeight.W300,
                fontSize = 20.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(horizontal = 32.dp)
            )
            // SUBTITLE
            Text(
                text = "Select your mood and start conversations with people feeling the same way.",
                color = Color.Gray,
                fontWeight = FontWeight.W400,
                fontSize = 14.sp,
                textAlign = TextAlign.Center,
                modifier = Modifier.padding(top = 8.dp) // Space between title and subtitle
            )
        }
    }


    Column (modifier = Modifier
        .padding(bottom = 40.dp),
            horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Button(
            onClick = {
                coroutineScope.launch {
                    navController.navigate("auth_options")
                }
            },
            shape = RoundedCornerShape(20.dp),
            modifier = Modifier
                .fillMaxWidth(0.85f)
                .height(50.dp),
            colors = ButtonDefaults.buttonColors(lightGreen)
        ) {
            Text(
                text = "Let's Get Started",
                color = Color.White,
                fontWeight = FontWeight.Medium,
                fontSize = 12.sp
            )
        }
    }
}

}