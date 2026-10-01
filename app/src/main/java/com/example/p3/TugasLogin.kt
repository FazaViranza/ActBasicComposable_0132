package com.example.p3

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource

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
        )
    }
}