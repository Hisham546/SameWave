package com.example.samewave.ui.screens.auth

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.IconButton
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavHostController
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.automirrored.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.Home
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.runtime.setValue
import androidx.compose.ui.text.style.TextAlign
import com.example.samewave.ui.components.inputfield.CustomTextField
import com.example.samewave.ui.theme.lightGreen
import kotlinx.coroutines.launch

@Composable
fun LoginScreen(navController: NavHostController){

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val coroutineScope = rememberCoroutineScope()
  Column (
      modifier = Modifier
          .fillMaxSize(),
      horizontalAlignment = Alignment.CenterHorizontally


  ){
Box(
    modifier = Modifier
        .fillMaxWidth()
        .height(80.dp),
    contentAlignment = Alignment.CenterStart
){
    IconButton(onClick = { navController.popBackStack() },
        modifier = Modifier
            .padding(16.dp)
            .size(56.dp) // <--- Increases the touch target area
        ) {
        Icon(
            imageVector = Icons.AutoMirrored.Filled.ArrowBack,
            contentDescription = "Back",
            modifier = Modifier.size(26.dp), // <--- Increases the actual arrow icon
            tint = Color.Black
        )
    }
}
      Box(
          modifier = Modifier
              .weight(0.6f) // This takes up all available space

              .fillMaxWidth(),
       //   contentAlignment = Alignment.Center // Centers the text inside that space
      ) {
          Column (
              modifier = Modifier
                  .padding(horizontal = 32.dp)
              ,
              horizontalAlignment = Alignment.CenterHorizontally

          ) {
              Text(
                  text = "Welcome Back",
                  color = Color.Black,
                  fontWeight = FontWeight.W300,
                  fontSize = 20.sp,
                  textAlign = TextAlign.Center,
                  modifier = Modifier.padding(horizontal = 32.dp)
              )
              // SUBTITLE
              Text(
                  text = "Pick up your conversations and find your vibe again.",
                  color = Color.Gray,
                  fontWeight = FontWeight.W400,
                  fontSize = 14.sp,
                  textAlign = TextAlign.Center,
                  modifier = Modifier.padding(top = 8.dp) // Space between title and subtitle
              )
          }
      }

      Column  (modifier = Modifier
          .fillMaxWidth()
          .weight(1.8f),
          horizontalAlignment = Alignment.CenterHorizontally
      ){
          CustomTextField(
              value = email,
              onValueChange = { email = it },
              label = "Email Address",
              placeholder = "Enter your email"
          )

          Spacer(modifier = Modifier.height(16.dp))

          // 3. Use Reusable Password Field
          CustomTextField(
              value = password,
              onValueChange = { password = it },
              label = "Password",
              isPassword = true
          )

          Spacer(modifier = Modifier.height(32.dp))

      }

      Column (modifier = Modifier
          .fillMaxWidth()
          .padding(bottom = 40.dp),
      horizontalAlignment = Alignment.CenterHorizontally
      ) {
          Button(
              onClick = {
                  coroutineScope.launch {
                      navController.navigate("login")
//                    try {
//
//                    } finally {
//                        //navController.navigate("home_screen")
//                    }
                  }
              },
              shape = RoundedCornerShape(20.dp),
              modifier = Modifier
                  .fillMaxWidth(0.85f)
                  .height(50.dp),
              colors = ButtonDefaults.buttonColors(lightGreen)
          ) {
              Text(
                  text = "Sign Up",
                  color = Color.White,
                  fontWeight = FontWeight.Medium,
                  fontSize = 12.sp
              )
          }
      }
  }
}