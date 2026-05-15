package com.example.carteiradigitalsenaiapp.feature.unidadecurricular2.domain.model

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.carteiradigitalsenaiapp.core.designsystem.theme.CarteiraDigitalTheme

@Composable
fun UnidadeCurricularCard(
    modifier: Modifier = Modifier,
    nomeUc: String = "Nome da UC",
    professor: String = "Nome do professor",
    n1: String = "N1: 8.0",
    n2: String = "N2: 7.5",
    media: String = "Média: 7.75",
    faltas: String = "Faltas: 2"
) {
    Card(
        modifier = modifier.fillMaxWidth(),
        shape = RoundedCornerShape(size = 16.dp),
        colors = CardDefaults.cardColors(
            containerColor = MaterialTheme.colorScheme.surface.copy(alpha = 0.85f)
        )
    ) {
        Column(
            modifier = Modifier.padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = nomeUc,
                style = MaterialTheme.typography.titleMedium,
                fontWeight = FontWeight.SemiBold
            )
            Text(
                text = professor,
                style = MaterialTheme.typography.bodyMedium
            )
            Row(
                horizontalArrangement = Arrangement.spacedBy(12.dp)
            ) {
                Text(text = n1, style = MaterialTheme.typography.bodySmall)
                Text(text = n2, style = MaterialTheme.typography.bodySmall)
                Text(text = media, style = MaterialTheme.typography.bodySmall)
            }
            Text(text = faltas, style = MaterialTheme.typography.bodySmall)
        }
    }
}

@Preview(showBackground = true)
@Composable
private fun PreviewUnidadeCurricularCard() {
    CarteiraDigitalTheme(darkTheme = false) {
        UnidadeCurricularCard()
    }
}
