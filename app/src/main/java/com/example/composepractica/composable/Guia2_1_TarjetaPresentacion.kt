package com.example.composepractica.composable

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.composepractica.R


@Composable
@Preview
fun TarjetaPresentacion() {
    Column(
        modifier = Modifier
            .fillMaxWidth()
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(12.dp)
    ) {
        Image(
            painter = painterResource(R.drawable.foto1),
            contentDescription = "Foto de Ina",
            modifier = Modifier
                .size(100.dp)
                //recorta en forma perfecto en circulo
                .clip(CircleShape),
            contentScale = ContentScale.Crop
        )

        /*Column organiza verticalmente; Alignment.CenterHorizontally
        centra los elementos y Arrangement.spacedBy() crea una separación constante. El
        modificador clip(CircleShape) permite mostrar el avatar con forma circular.*/

        Text(
            text = "Ina Diaz",
            fontSize = 24.sp
        )

        Text(
            text = "Estudiante de DAM",
            fontSize = 16.sp
        )

        Button(onClick = {}) {
            Text("Ver perfil")
        }
    }
}