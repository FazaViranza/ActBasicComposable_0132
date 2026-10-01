package com.example.p3

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun HalamanLogin(modifier: Modifier = Modifier) {
    val background = painterResource(
        id = R.drawable.building
    )
    val logo = painterResource(
        id = R.drawable.logoumy
    )
    val profile = painterResource(
        id = R.drawable.building
    )

    Box(
        modifier = modifier.fillMaxSize()
    ) {
        // Background
        Image(
            painter = background,
            contentDescription = null,
            modifier = Modifier.fillMaxSize(),
            contentScale = ContentScale.Crop
        )
        // Isi halaman
        Column(
            modifier = Modifier.fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Spacer(
                modifier = Modifier.height(35.dp)
            )
            // Judul Login
            Text(
                text = "Login",
                fontSize = 24.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
            // Subtitle
            Text(
                text = "Ini adalah halaman login,",
                fontSize = 12.sp,
                color = Color.White
            )
            Spacer(
                modifier = Modifier.height(35.dp)
            )
            // Logo UMY
            Image(
                painter = logo,
                contentDescription = "Logo UMY",
                modifier = Modifier.size(120.dp),
                contentScale = ContentScale.Fit
            )
            Spacer(
                modifier = Modifier.height(45.dp)
            )
            // Label Nama
            Text(
                text = "Nama",
                fontSize = 12.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Red
            )
            // Nama
            Text(
                text = "Nofila Faza Viranza",
                fontSize = 14.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Blue
            )
            // NIM
            Text(
                text = "20240140132",
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                color = Color.Black
            )
        }
    }
}