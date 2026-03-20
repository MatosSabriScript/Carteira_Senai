package com.example.carteiradigitalsenaiapp.app
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.runtime.Composable
import androidx.navigation.compose.rememberNavController
import com.example.carteiradigitalsenaiapp.core.designsystem.navigation.AppNavHost
import com.example.carteiradigitalsenaiapp.core.designsystem.theme.CarteiraDigitalTheme

@Composable
fun App() {
    CarteiraDigitalTheme() {
        val navController = rememberNavController()
        AppNavHost(
            navController = navController,
        )
    }
}