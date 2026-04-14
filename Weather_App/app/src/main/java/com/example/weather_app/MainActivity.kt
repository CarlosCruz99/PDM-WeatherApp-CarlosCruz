package com.example.weather_app

import android.R.attr.fontWeight
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Cloud
import androidx.compose.material.icons.filled.CloudDownload
import androidx.compose.material.icons.filled.CloudQueue
import androidx.compose.material.icons.filled.CloudSync
import androidx.compose.material.icons.filled.Cyclone
import androidx.compose.material.icons.filled.ShieldMoon
import androidx.compose.material.icons.filled.WbSunny
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.geometry.Size
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.weather_app.ui.theme.Weather_AppTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            Weather_AppTheme {
                // Pantalla simple (gradiente azul):
                //pantalla1()

                // Pantalla detallada (gradiente morada):
                pantalla2()

            }
        }
    }
}

@Preview
@Composable
fun pantalla1() {
    val backGroundGradient=Brush.verticalGradient(
        colors=listOf(
            Color(0xFF72EAFF),
            Color(0xFF72C2FF),
            Color(0xFF003888)
        )
    )

    Box(
        modifier= Modifier.fillMaxWidth().background(backGroundGradient),
        contentAlignment = Alignment.Center
    ) {
        Column(
            modifier=Modifier.fillMaxSize().padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
            verticalArrangement = Arrangement.Center
        ){
            Text(
                "El Salvador",
                color=Color.White,
                fontSize=26.sp,
                fontWeight=FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(12.dp))

            Text(
                "25°C",
                color=Color.White,
                fontSize=46.sp,
                fontWeight=FontWeight.Bold
            )

            Spacer(modifier = Modifier.height(12.dp))

            Icon(
                imageVector = Icons.Default.Cyclone,
                contentDescription = "Icono",
                modifier=Modifier.size(150.dp),
                tint=Color.Cyan
            )

            Spacer(modifier = Modifier.height(12.dp))

            Card(
                colors= CardDefaults.cardColors(
                    containerColor = Color.White.copy(alpha=0.2f)
                ),
                shape=RoundedCornerShape(16.dp)
            ){
                Row(
                    modifier = Modifier.fillMaxWidth()
                        .padding(6.dp),
                    horizontalArrangement = Arrangement.SpaceEvenly,
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(
                            "HUM",
                            color=Color.White.copy(0.7f),
                            fontSize=16.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Text(
                            "65%",
                            color=Color.White,
                            fontSize=16.sp,
                            fontWeight=FontWeight.Bold
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ){
                        Text(
                            "VIENTO",
                            color=Color.White.copy(0.7f),
                            fontSize=16.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Text(
                            "12 km/h",
                            color=Color.White,
                            fontSize=16.sp,
                            fontWeight=FontWeight.Bold
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            "LLUVIA",
                            color=Color.White.copy(0.7f),
                            fontSize=16.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Text(
                            "10%",
                            color=Color.White,
                            fontSize=16.sp,
                            fontWeight=FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Button(
                onClick = {},
                colors= ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor=Color.Blue
                )
            ){
                Text("ACTUALIZAR")
            }
        }
    }
}

@Preview
@Composable
fun pantalla2(){
    val backGroundGradient = Brush.verticalGradient(
        colors=listOf(
            Color(0xFFA0B5EB),
            Color(0xFFEA52F8),
            Color(0xFF0066FF)
        )
    )

    Box(
        modifier= Modifier.fillMaxWidth().background(backGroundGradient),
    ){
        Column(
            modifier = Modifier.fillMaxSize().padding(20.dp),
            verticalArrangement = Arrangement.Center
        ){
            Column(
                    horizontalAlignment = Alignment.CenterHorizontally
                ){
                    Text(
                        "El Salvador",
                        color=Color.White,
                        fontSize=24.sp,
                        fontWeight=FontWeight.Bold
                    )
                    Text(
                        "25°C",
                        color=Color.White,
                        fontSize=46.sp,
                        fontWeight=FontWeight.Bold
                    )
                    Text(
                        "Soleado",
                        color=Color.White,
                        fontSize=26.sp,
                    )
            }
            Spacer(modifier = Modifier.height(24.dp))

            Column(){
                Text("PRONÓSTICO POR HORAS",
                    color=Color.White.copy(0.7f),
                    fontSize=16.sp,
                    fontWeight=FontWeight.Bold)
                Row(
                    modifier = Modifier.fillMaxWidth().padding(6.dp),
                    horizontalArrangement = Arrangement.SpaceBetween
                ){
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("Ahora",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.WbSunny,
                            contentDescription = "Icono",
                            tint = Color.Yellow
                        )
                        Text("25°",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("14:00",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.WbSunny,
                            contentDescription = "Icono",
                            tint = Color.Yellow
                        )
                        Text("26°",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("16:00",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.Cloud,
                            contentDescription = "Icono",
                            tint = Color.White
                        )
                        Text("24°",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("18:00",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.Cloud,
                            contentDescription = "Icono",
                            tint = Color.White
                        )
                        Text("22°",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                    }
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text("20:00",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.ShieldMoon,
                            contentDescription = "Icono",
                            tint = Color.Yellow
                        )
                        Text("20°",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                    }
                }
            }

            Spacer(modifier = Modifier.height(24.dp))

            Card(
                colors= CardDefaults.cardColors(
                    containerColor = Color.White.copy(alpha=0.2f)
                ),
                shape=RoundedCornerShape(16.dp),
            ){
               Column(
                   modifier = Modifier.fillMaxWidth()
                       .padding(12.dp),
                   verticalArrangement = Arrangement.SpaceEvenly,
               ){
                   Text("DETALLES",
                       color=Color.White.copy(0.7f),
                       fontSize=16.sp,
                       fontWeight=FontWeight.Bold)
                   Row(
                       modifier = Modifier.fillMaxWidth().padding(6.dp),
                       horizontalArrangement = Arrangement.SpaceBetween
                   ){
                       Column(
                           horizontalAlignment = Alignment.CenterHorizontally
                       ) {
                           Text("Humedad",
                               color=Color.White.copy(0.7f),
                               fontSize=16.sp,
                               fontWeight=FontWeight.Bold)
                           Text("65%",
                               color=Color.White,
                               fontSize=16.sp,
                               fontWeight=FontWeight.Bold)
                       }
                       Column(
                           horizontalAlignment = Alignment.CenterHorizontally
                       ) {
                           Text("Viento",
                               color=Color.White.copy(0.7f),
                               fontSize=16.sp,
                               fontWeight=FontWeight.Bold)
                           Text("12 km/h",
                               color=Color.White,
                               fontSize=16.sp,
                               fontWeight=FontWeight.Bold)
                       }
                   }
                   Row(
                       modifier = Modifier.fillMaxWidth().padding(6.dp),
                       horizontalArrangement = Arrangement.SpaceBetween
                   ){
                       Column(
                           horizontalAlignment = Alignment.CenterHorizontally
                       ) {
                           Text("Presión",
                               color=Color.White.copy(0.7f),
                               fontSize=16.sp,
                               fontWeight=FontWeight.Bold)
                           Text("1012hPa",
                               color=Color.White,
                               fontSize=16.sp,
                               fontWeight=FontWeight.Bold)
                       }
                       Column(
                           horizontalAlignment = Alignment.CenterHorizontally
                       ) {
                           Text("UV",
                               color=Color.White.copy(0.7f),
                               fontSize=16.sp,
                               fontWeight=FontWeight.Bold)
                           Text("5",
                               color=Color.White,
                               fontSize=16.sp,
                               fontWeight=FontWeight.Bold)
                       }
                   }
               }
            }

            Spacer(modifier = Modifier.height(12.dp))

            Text("PRONÓSTICO SEMANAL",
                color=Color.White.copy(0.7f),
                fontSize=16.sp,
                fontWeight=FontWeight.Bold)

            Card(
                colors= CardDefaults.cardColors(
                    containerColor = Color.White.copy(alpha=0.2f)
                ),
                shape=RoundedCornerShape(16.dp),
            ){
                Column(
                    modifier = Modifier.fillMaxWidth()
                        .padding(12.dp),
                    verticalArrangement = Arrangement.SpaceEvenly,
                ){
                    Row(modifier = Modifier.fillMaxWidth()
                        .padding(6.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly
                    ){
                        Text("Lun",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.WbSunny,
                            contentDescription = "Icono",
                            tint = Color.Yellow
                        )
                        Text("28°",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Text(" / 22°",
                            color=Color.White.copy(0.7f),
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth()
                        .padding(6.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly){
                        Text("Mar",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.Cloud,
                            contentDescription = "Icono",
                            tint = Color.White
                        )
                        Text("27°",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Text(" / 21°",
                            color=Color.White.copy(0.7f),
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth()
                        .padding(6.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly){
                        Text("Mié",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.CloudDownload,
                            contentDescription = "Icono",
                            tint = Color.Blue
                        )
                        Text("26°",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Text(" / 20°",
                            color=Color.White.copy(0.7f),
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth()
                        .padding(6.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly){
                        Text("Jue",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.CloudQueue,
                            contentDescription = "Icono",
                            tint = Color.Yellow
                        )
                        Text("25°",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Text(" / 19°",
                            color=Color.White.copy(0.7f),
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                    }
                    Row(modifier = Modifier.fillMaxWidth()
                        .padding(6.dp),
                        horizontalArrangement = Arrangement.SpaceEvenly){
                        Text("Vie",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Icon(
                            imageVector = Icons.Default.CloudSync,
                            contentDescription = "Icono",
                            tint = Color.Yellow
                        )
                        Text("24°",
                            color=Color.White,
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                        Text(" / 18°",
                            color=Color.White.copy(0.7f),
                            fontSize=14.sp,
                            fontWeight=FontWeight.Bold
                        )
                    }
                }
            }

        }
    }
}