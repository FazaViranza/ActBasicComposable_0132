package com.example.p3

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.p3.ui.theme.P3Theme
import com.example.p3.ui.theme.TataletakBoxColumnRow


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            P3Theme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Panggil composable layout utama dengan padding dari Scaffold
                    TataletakBoxColumnRow(
                        modifier = Modifier.padding(innerPadding)
                    )
                }
            }
        }
    }
}