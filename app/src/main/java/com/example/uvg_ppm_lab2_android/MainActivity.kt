package com.example.uvg_ppm_lab2_android

import android.os.Bundle
import android.widget.Toast
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.uvg_ppm_lab2_android.ui.theme.Uvgppmlab2androidTheme
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.Spacer
import androidx.compose.material3.Text
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.ui.Alignment
import androidx.compose.ui.unit.dp
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.semantics.Role.Companion.Button
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.sp
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.size
import androidx.compose.ui.res.painterResource


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Uvgppmlab2androidTheme {
                Contenido()
                // ¿Espacio? que muestra la funcion contenido
            }
        }
    }
}

//Funcion principal para mostrar mi contenido
@Composable
fun Contenido(){
    Column(modifier = Modifier
        .fillMaxSize()
        .padding(50.dp),
        horizontalAlignment = Alignment.CenterHorizontally)
    /* Creo una columna y  agrego ahi mis funciones con los textos, permitiendome
    así utilizar un modifier para la columna*/
    {
        ImagenDestiny()
        Spacer(
            modifier = Modifier.height(20.dp))
        Nombreproyecto()
        Spacer(
            modifier = Modifier.height(10.dp))
        Txtbienvenida()
        Spacer(
            modifier = Modifier.height(20.dp))
        Boton()
    } }


@Preview(showBackground = true)
@Composable
fun PreviewContenido(){
    Contenido()
}

//Funcion que muestra "Destiny" en el centro de la pantalla
@Composable
fun Nombreproyecto(){
    Text(text = "Destiny",
        modifier = Modifier
                .padding(12.dp),
        style = TextStyle(
            fontFamily = FontFamily.Cursive,
            textAlign = TextAlign.Center,
            fontSize = 40.sp))

}

//Funcion que muestra el texto de bienvenida
@Composable
fun Txtbienvenida(){
    Text(text = "Bienvenido a Destiny, pronto contaremos con muchas funciones para superar los obstáculos juntos <3")
}

//Funcion del funcionamiento y texto del boton
@Composable
fun Boton(){
    val contexto = LocalContext.current
    // No entiendo que hace la variable contexto, investigar y comentar
    Button(
        onClick = {
            Toast.makeText(contexto,
                "Recuerda nuestro slogan: “Sana tú, crece él. Destiny.",
                Toast.LENGTH_SHORT).show() }
    ){
        Text(text = "Presiona para saber más de nosotros")
    }
}

//Funcion para mostrar la imagen de fondo
@Composable
fun ImagenDestiny(){
    Image(
        //painter es el comando que "pinta" la imagen en la pantalla
        painter = painterResource(id = R.drawable.destiny),
        contentDescription = "Icono de nuestra próxima aplicación, llamada Destiny",
        modifier = Modifier
            .size(50.dp)
    )
}