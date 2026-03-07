package com.example.samewave.ui.screens.auth

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import com.example.samewave.ui.theme.Pink40
import com.example.samewave.ui.theme.Pink80
import com.example.samewave.ui.theme.lightGreen
import kotlinx.coroutines.launch

import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.graphics.Outline
import androidx.compose.ui.graphics.Path
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.unit.LayoutDirection
import androidx.compose.ui.unit.Density
@Composable
fun WelcomeScreen(navController: NavHostController){
    val coroutineScope = rememberCoroutineScope()

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

//    Box(modifier = Modifier
//        .fillMaxHeight(0.5f)
//        .fillMaxWidth()
//        .clip(
//            RoundedCornerShape(
//                bottomEnd = 70.dp,
//                bottomStart = 70.dp,
//            ))
//        .background(lightGreen)
//    ){
//
//    }
//    Column (modifier = Modifier
//        //.fillMaxSize()
//    ) {
//        Button(
//            onClick = {
//                coroutineScope.launch {
//                    try {
//
//                    } finally {
//                        //navController.navigate("home_screen")
//                    }
//                }
//            },
//            shape = RoundedCornerShape(8.dp),
//            modifier = Modifier
//                .height(50.dp)
//                .width(280.dp),
//            colors = ButtonDefaults.buttonColors(Pink40)
//        ) {
//            Text(
//                text = "Add Expense",
//                color = Color.White,
//                fontWeight = FontWeight.Medium,
//                fontSize = 12.sp
//            )
//        }
//    }
}