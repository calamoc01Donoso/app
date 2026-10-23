package com.example.composepractica.composable


import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepractica.R

@Composable
@Preview
fun PerfilAlumnoNuevo() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(10.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.foto1),
            contentDescription = "Foto del alumno",
            modifier = Modifier
                .size(100.dp)   // tamaño cambiado
                .clip(CircleShape)
        )

        Text(
            "Lucía",
            fontSize = 26.sp,
            color = Color(0xFF4A90E2) // color cambiado
        )

        Text(
            "Desarrolladora junior",
            color = Color.Gray // color cambiado
        )

        Button(
            onClick = {},
            modifier = Modifier.size(width = 180.dp, height = 55.dp) // tamaño del botón cambiado
        ) {
            Text("Ver perfil")
        }
    }
}
