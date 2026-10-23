package com.example.composepractica.composable

import android.widget.Button
import androidx.compose.foundation.layout.Column
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.tooling.preview.Preview


@Composable
@Preview
fun BotonSaludar() {
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text("Pulsa el botón")

        Button(
            onClick = {
                println("¡Hola!")
            }
        ) {
            Text("Saludar")
        }
    }
}