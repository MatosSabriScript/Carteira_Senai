package com.example.carteiradigitalsenaiapp.core.designsystem.navigation


import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.example.carteiradigitalsenaiapp.feature.auth.presentation.screen.LoginScreen
import com.example.carteiradigitalsenaiapp.feature.home.presentation.screen.CarteiraView

@Composable
fun AppNavHost(
    navController: NavHostController
) {
    NavHost(
        navController = navController,
        startDestination = Routes.Login.route
    ) {
        composable(Routes.Login.route) {
            LoginScreen(
                modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                navController = navController
            )
        }
        composable(Routes.Carteirinha.route) {
            CarteiraView(
                modifier = Modifier
                    .fillMaxSize()
            )
        }
    }
}