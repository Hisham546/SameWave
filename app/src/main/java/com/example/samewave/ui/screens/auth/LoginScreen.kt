package com.example.samewave.ui.screens.auth

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
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
import androidx.compose.material3.Icon
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import com.example.samewave.ui.components.inputfield.CustomTextField

@Composable
fun LoginScreen(navController: NavHostController){

    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

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
      Column  (modifier = Modifier
          .fillMaxWidth(),
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
  }
}