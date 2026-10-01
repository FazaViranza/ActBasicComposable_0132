package com.example.p3.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun contohColumn(modifier: Modifier) {
    Column(modifier = modifier.padding(top =20.dp, start = 20.dp, end = 20.dp)) {
        Text(text = "Komponen1")
        Text(text = "Komponen2")
        Text(text = "Komponen3")
        Text(text = "Komponen4")
    }
}