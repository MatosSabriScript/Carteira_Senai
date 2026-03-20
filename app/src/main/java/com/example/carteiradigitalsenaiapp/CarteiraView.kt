package com.example.carteiradigitalsenaiapp

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun CarteirinhaDigitalView(modifier: Modifier = Modifier) {
    Box() {
        Image(
            painter = painterResource(R.drawable.universe),
            contentDescription = "Fundo da carteirinha",
            contentScale = ContentScale.Crop,
            modifier = Modifier.fillMaxSize()
        )
        Column(
            modifier = modifier,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Image(
                painter = painterResource(R.drawable.senai_logo),
                contentDescription = "Logo do Senai",
                modifier = Modifier
                    .weight(.5f)
                    .fillMaxSize(.7f)
            )
            Image(
                painter = painterResource(R.drawable.foto_de_perfil),
                contentDescription = "Foto de perfil",
                contentScale = ContentScale.Crop,
                modifier = Modifier
                    .weight(1.3f)
                    .size(200.dp)
                    .clip(CircleShape)
                    .aspectRatio(1f)
                    .fillMaxWidth(.6f)
            )
            Row(
                modifier = Modifier
                    .weight(.2f)
                    .fillMaxWidth(.9f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                labelText(
                    "Nome:"
                )
                ValueText(
                    "Christian Maia",
                    modifier = Modifier.weight(1f),
                    fontSize = 25.sp
                )
            }
            Row(
                modifier = Modifier
                    .weight(.2f)
                    .fillMaxWidth(.9f),
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                labelText(
                    "Curso:"
                )
                ValueText(
                    "4DEVMA",
                    modifier = Modifier.weight(1f)
                )
            }
            QrCode(
                "90000000001418424776",
                modifier = Modifier
                    .weight(2f)
                    .fillMaxWidth(.6f)
                    .clip(RoundedCornerShape(5.dp))
            )
        }
    }
}