package com.example.myapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.myapplication.ui.theme.MyApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            MyApplicationTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    // Puedes decidir aquí cuál componente deseas mostrar,
                    // o cómo combinarlos
                    ViewHolaCurso(modifier = Modifier.padding(innerPadding))
                }
            }
        }
    }
}

@Composable
fun ViewHolaCurso(modifier: Modifier = Modifier) {
    Column(
        modifier = modifier
            .fillMaxWidth()
            .padding(16.dp)
            .background(Color.Cyan) // Nuevo color de fondo
            .padding(16.dp),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = "Exploring Compose!",
            fontSize = 30.sp,
            fontWeight = FontWeight.Bold,
            color = Color.Black // Nuevo color del texto
        )
        Spacer(modifier = Modifier.height(24.dp))
        Text(
            text = "Let's Build Amazing UI",
            fontSize = 22.sp,
            color = Color.DarkGray // Nuevo color del texto
        )
    }
}


@Preview(showBackground = true)
@Composable
fun ViewHolaCursoPreview() {
    MyApplicationTheme {
        ViewHolaCurso()
    }
}
