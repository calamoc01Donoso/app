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
fun PantallaBienvenida() {
    Column(
        modifier = Modifier
            .fillMaxSize()
            .background(Color(0xFFEFF6FF))
            .padding(24.dp),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.spacedBy(20.dp)
    ) {
        Box(
            modifier = Modifier.fillMaxWidth(),
            contentAlignment = Alignment.Center
        ) {
            Image(
                painter = painterResource(R.drawable.foto1),
                contentDescription = "Estudiante aprendiendo",
                modifier = Modifier
                    .fillMaxWidth()
                    .height(220.dp),
                contentScale = ContentScale.Fit
            )

            Text(
                text = "¡Nuevo!",
                modifier = Modifier
                    .align(Alignment.TopEnd)
                    .background(
                        Color(0xFF2563EB),
                        RoundedCornerShape(8.dp)
                    )
                    .padding(8.dp),
                color = Color.White
            )
        }

        Text(
            text = "¡Hola, estudiante!",
            fontSize = 28.sp,
            color = Color(0xFF1D4ED8)
        )

        Text(
            text = "Aprende algo nuevo cada día.",
            fontSize = 16.sp,
            textAlign = TextAlign.Center
        )

        Button(
            onClick = {},
            modifier = Modifier.fillMaxWidth()
        ) {
            Text("Comenzar")
        }

        TextButton(onClick = {}) {
            Text("Ver mis cursos")
        }

        Column(
            modifier = Modifier
                .fillMaxWidth()
                .clip(RoundedCornerShape(12.dp))
                .background(Color.White)
                .padding(16.dp),
            verticalArrangement = Arrangement.spacedBy(8.dp)
        ) {
            Text(
                text = "Mi progreso",
                fontSize = 20.sp
            )

            Text(
                text = "Continúa aprendiendo y completa tus cursos.",
                color = Color.DarkGray
            )
        }
    }
}