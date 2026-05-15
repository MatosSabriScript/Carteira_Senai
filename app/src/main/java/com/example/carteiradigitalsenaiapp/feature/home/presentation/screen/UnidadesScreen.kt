package com.example.carteiradigitalsenaiapp.feature.home.presentation.screen

import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun UnidadesScreen(
    modifier: Modifier = Modifier
) {
    val mockUnidades = listOf(
        UnidadeCurricular(
            nomeUc = "Programação em Java",
            professor = "Prof. João Silva",
            n1 = "N1: 8.5",
            n2 = "N2: 9.0",
            media = "Média: 8.75",
            faltas = "Faltas: 1"
        ),
        UnidadeCurricular(
            nomeUc = "Banco de Dados",
            professor = "Prof. Maria Santos",
            n1 = "N1: 7.5",
            n2 = "N2: 8.0",
            media = "Média: 7.75",
            faltas = "Faltas: 2"
        ),
        UnidadeCurricular(
            nomeUc = "Desenvolvimento Web",
            professor = "Prof. Carlos Oliveira",
            n1 = "N1: 9.0",
            n2 = "N2: 8.5",
            media = "Média: 8.75",
            faltas = "Faltas: 0"
        ),
        UnidadeCurricular(
            nomeUc = "Arquitetura de Sistemas",
            professor = "Prof. Ana Costa",
            n1 = "N1: 8.0",
            n2 = "N2: 8.5",
            media = "Média: 8.25",
            faltas = "Faltas: 3"
        )
    )

    UnidadesContent(
        modifier = modifier.fillMaxSize(),
        unidades = mockUnidades
    )
}
