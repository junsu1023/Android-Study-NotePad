package com.example.notepad

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.rememberNavController
import com.example.notepad.ui.theme.NotePadTheme

@Composable
fun NotePadApp() {
    val navController = rememberNavController()

    NotePadTheme {
        Scaffold {
            NotePadAppNavHost(
                navController = navController,
                modifier = Modifier.padding(it)
            )
        }
    }
}