package com.example.carteiradigitalsenaiapp.feature.home.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.navigation.NavController
import com.example.carteiradigitalsenaiapp.core.designsystem.navigation.Routes
import com.example.carteiradigitalsenaiapp.feature.auth.presentation.screen.LoginContent

@Composable
fun HomeContent(
    modifier: Modifier = Modifier,
    navController: NavController
) {
    CarteirinhaContent(
        onHomeClick = {
            navController.navigate(
                Routes.Login.route
            )
        },
        modifier = modifier
    )
}