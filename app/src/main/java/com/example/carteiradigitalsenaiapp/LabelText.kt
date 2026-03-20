package com.example.carteiradigitalsenaiapp

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.style.TextAlign

@Composable
fun labelText(
    label: String,
    modifier: Modifier = Modifier
){
    Text(
        text = label,
        textAlign = TextAlign.Right,
        style = MaterialTheme.typography.bodyMedium,
        modifier = modifier
    )
}