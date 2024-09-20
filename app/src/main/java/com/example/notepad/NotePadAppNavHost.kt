package com.example.notepad

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.notepad.ui.view.NotePadMainScreen
import com.example.notepad.ui.view.NotePadWriteScreen

@Composable
fun NotePadAppNavHost(
    modifier: Modifier = Modifier,
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = NotePadScreen.Main.name,
        modifier = modifier
    ) {
        val clickAddButton = {
            navController.navigate(NotePadScreen.Write.name) {
                popUpTo(NotePadScreen.Main.name)
            }
        }

        val clickNotePadItem = {
            /* TODO */
        }

        val clickBackButton = {
            navController.popBackStack()
        }

        composable(NotePadScreen.Main.name) {
            NotePadMainScreen(
                clickAddButton = clickAddButton,
                clickNotePadItem = clickNotePadItem
            )
        }

        composable(NotePadScreen.Write.name) {
            NotePadWriteScreen(
                clickBackButton = { clickBackButton }
            )
        }
    }
}