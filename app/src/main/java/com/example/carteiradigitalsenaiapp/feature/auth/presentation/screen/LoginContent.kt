package com.example.carteiradigitalsenaiapp.feature.auth.presentation.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteiradigitalsenaiapp.core.designsystem.theme.CarteiraDigitalTheme
@Composable
fun LoginContent(
    modifier: Modifier = Modifier,
    login: String = "",
    senha: String = "",
    onLoginChange: (String) -> Unit = {},
    onSenhaChange: (String) -> Unit ={},
    onLoginClick: () -> Unit = {}
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .safeDrawingPadding(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(
            space = 16.dp,
            alignment = Alignment.CenterVertically
        )
    ) {
        TextField(
            value = login,
            onValueChange = onLoginChange,
            label = {
                Text("Login")
            }
        )

        TextField(
            value = senha,
            onValueChange = onSenhaChange,
            label = {
                Text("Senha")
            }
        )

        Button(
            onClick = onLoginClick,
            modifier = Modifier.fillMaxWidth(0.6f),
            shape = RoundedCornerShape(size = 9.dp),
            colors = ButtonDefaults.buttonColors(
                containerColor = MaterialTheme.colorScheme.primary
            ),
            border = BorderStroke(
                2.dp,
                MaterialTheme.colorScheme.background
            )
        ) {
            Text("Entrar")
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginContentClaro() {
    CarteiraDigitalTheme(darkTheme = false) {
        LoginContent( )
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun PreviewLoginContentEscuro() {
    CarteiraDigitalTheme(darkTheme = true) {
        LoginContent( )
    }
}