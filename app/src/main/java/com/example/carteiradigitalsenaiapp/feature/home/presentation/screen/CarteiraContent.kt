package com.example.carteiradigitalsenaiapp.feature.home.presentation.screen

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.scale
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteiradigitalsenaiapp.R
import com.example.carteiradigitalsenaiapp.core.designsystem.navigation.Routes
import com.example.carteiradigitalsenaiapp.core.designsystem.theme.CarteiraDigitalTheme
import com.example.carteiradigitalsenaiapp.feature.home.presentation.component.PerfilAluno
import com.example.carteiradigitalsenaiapp.feature.home.presentation.component.QrCode

@Composable
fun CarteirinhaContent(
    qrCodeContent: String = "numero de matricula do aluno",
    onHomeClick: () -> Unit = {},
    modifier: Modifier = Modifier
) {
    Box(
        modifier = modifier.fillMaxSize()
    ) {
        Image(
            painter = painterResource(R.drawable.universe),
            contentDescription = null,
            contentScale = ContentScale.Crop,
            modifier = Modifier
                .fillMaxSize()
                .alpha(0.7f)
        )

        Column(
            modifier = Modifier
                .safeDrawingPadding()
                .fillMaxSize(),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.SpaceAround
        ) {
            Image(
                painter = painterResource(R.drawable.senai_logo),
                contentDescription = "Logo do SENAI São Paulo",
                modifier = Modifier.fillMaxWidth(0.6f)
            )

            PerfilAluno(
                modifier = Modifier.fillMaxWidth(0.9f)
            )

            Button(
                onClick = onHomeClick,
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
                Text("Sair")
            }

            QrCode(
                conteudo = qrCodeContent,
                modifier = Modifier.fillMaxWidth(0.6f)
            )
        }
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CarteirinhaContentPreviewClaro() {
    CarteiraDigitalTheme(darkTheme = false) {
        CarteirinhaContent()
    }
}

@Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun CarteirinhaContentPreviewEscuro() {
    CarteiraDigitalTheme(darkTheme = true) {
        CarteirinhaContent()
    }
}