package com.example.carteiradigitalsenaiapp.feature.home.presentation.screen

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.safeDrawingPadding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.carteiradigitalsenaiapp.core.designsystem.theme.CarteiraDigitalTheme
import com.example.carteiradigitalsenaiapp.feature.home.presentation.component.UnidadeCurricularCard

data class UnidadeCurricular(
    val nomeUc: String,
    val professor: String,
    val n1: String,
    val n2: String,
    val media: String,
    val faltas: String
)

@Composable
fun UnidadesContent(
    modifier: Modifier = Modifier,
    unidades: List<UnidadeCurricular> = emptyList()
) {
    Column(
        modifier = modifier
            .fillMaxSize()
            .safeDrawingPadding()
            .padding(16.dp)
    ) {
        Text(
            text = "Unidades Curriculares",
            style = MaterialTheme.typography.headlineSmall,
            fontWeight = FontWeight.SemiBold,
            fontSize = 24.sp,
            modifier = Modifier.padding(bottom = 16.dp)
        )

        LazyColumn(
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            items(unidades) { unidade ->
                UnidadeCurricularCard(
                    nomeUc = unidade.nomeUc,
                    professor = unidade.professor,
                    n1 = unidade.n1,
                    n2 = unidade.n2,
                    media = unidade.media,
                    faltas = unidade.faltas
                )
            }
        }
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
private fun PreviewUnidadesContent() {
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
        )
    )

    CarteiraDigitalTheme(darkTheme = false) {
        UnidadesContent(unidades = mockUnidades)
    }
}

