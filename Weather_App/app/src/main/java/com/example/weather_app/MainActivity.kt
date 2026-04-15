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
import androidx.compose.ui.graphics.vector.ImageVector
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
                    elementosClima("HUM", "65%")
                    elementosClima("VIENTO", "12 km/h")
                    elementosClima("LLUVIA", "10%")
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

@Composable
fun elementosClima(title: String, amount: String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            title,
            color=Color.White.copy(0.7f),
            fontSize=16.sp,
            fontWeight=FontWeight.Bold
        )
        Text(
            amount,
            color=Color.White,
            fontSize=16.sp,
            fontWeight=FontWeight.Bold
        )
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
                        fontSize=20.sp,
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
                    pronosticoPorHora("Ahora", Icons.Default.WbSunny, Color.Yellow, "25°")
                    pronosticoPorHora("14:00", Icons.Default.WbSunny, Color.Yellow, "26°")
                    pronosticoPorHora("16:00", Icons.Default.Cloud, Color.White,"24°")
                    pronosticoPorHora("18:00", Icons.Default.Cloud, Color.White, "22°")
                    pronosticoPorHora("20:00", Icons.Default.ShieldMoon, Color.Yellow, "20°")
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
                       detallesClima("Humedad", "65%")
                       detallesClima("Viento", "12 km/h")
                   }
                   Row(
                       modifier = Modifier.fillMaxWidth().padding(6.dp),
                       horizontalArrangement = Arrangement.SpaceBetween
                   ){
                       detallesClima("Presión", "1012 hPa")
                       detallesClima("UV", "5")
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
                    pronosticoSemanal("Lun", Icons.Default.WbSunny, Color.Yellow, "28°", " / 22°")
                    pronosticoSemanal("Mar", Icons.Default.Cloud, Color.White, "27°", " / 21°")
                    pronosticoSemanal("Mié", Icons.Default.CloudDownload, Color.Blue, "26°", " / 20°")
                    pronosticoSemanal("Jue", Icons.Default.CloudQueue, Color.Yellow, "25°", " / 19°")
                    pronosticoSemanal("Vie", Icons.Default.CloudSync, Color.Yellow, "24°", " / 18°")
                }
            }
        }
    }
}

@Composable
fun pronosticoPorHora(title: String, icon: ImageVector, iconColor: Color, amount: String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(title,
            color=Color.White,
            fontSize=14.sp,
            fontWeight=FontWeight.Bold
        )
        Icon(
            imageVector = icon,
            contentDescription = "Icono",
            tint = iconColor
        )
        Text(amount,
            color=Color.White,
            fontSize=14.sp,
            fontWeight=FontWeight.Bold
        )
    }
}

@Composable
fun detallesClima(title: String, amount: String){
    Column(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(title,
            color=Color.White.copy(0.7f),
            fontSize=16.sp,
            fontWeight=FontWeight.Bold)
        Text(amount,
            color=Color.White,
            fontSize=16.sp,
            fontWeight=FontWeight.Bold)
    }
}

@Composable
fun pronosticoSemanal(title: String, icon: ImageVector, iconColor: Color, maxAmount: String, minAmount: String){
    Row(modifier = Modifier.fillMaxWidth()
        .padding(6.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ){
        Text(title,
            color=Color.White,
            fontSize=14.sp,
            fontWeight=FontWeight.Bold
        )
        Icon(
            imageVector = icon,
            contentDescription = "Icono",
            tint = iconColor
        )
        Row(){
            Text(maxAmount,
                color=Color.White,
                fontSize=14.sp,
                fontWeight=FontWeight.Bold
            )
            Text(minAmount,
                color=Color.White.copy(0.7f),
                fontSize=14.sp,
                fontWeight=FontWeight.Bold
            )
        }
    }
}