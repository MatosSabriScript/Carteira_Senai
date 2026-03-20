package com.example.carteiradigitalsenaiapp.feature.home.presentation.screen

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun CarteiraView(
    modifier: Modifier = Modifier
) {
    CarteirinhaContent(
        qrCodeContent =  "90000000001418424776",
        modifier = modifier
    )
}