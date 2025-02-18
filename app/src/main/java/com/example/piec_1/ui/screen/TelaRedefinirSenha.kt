package com.example.piec_1.ui.screen

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.piec_1.R
import com.example.piec_1.ui.components.EntradaDeTexto
import com.example.piec_1.ui.components.InfoBox
import com.example.piec_1.ui.theme.PrimaryColor
import com.example.piec_1.ui.theme.RobotoFont
import com.example.piec_1.ui.theme.SecondaryColor

@Composable
fun TelaRedefinirSenha(navController: NavController) {
    Box(
        modifier = Modifier
            .fillMaxSize()
            .background(
                Brush.verticalGradient(
                    colors = listOf(PrimaryColor, SecondaryColor)
                )
            ),
        contentAlignment = Alignment.Center
    ) {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(750.dp)
                .background(
                    color = Color.White,
                )
                .padding(18.dp),
            contentAlignment = Alignment.TopCenter)


        {
            Icon(
                painter = painterResource(id = R.drawable.img),
                contentDescription = "Icone Coração",
                tint = Color.Unspecified,
                modifier = Modifier
                    .width(47.dp)
                    .height(47.dp)
                    .align(Alignment.TopStart)
            )
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                modifier = Modifier
                    .padding(top = 100.dp)
            ){
                Text(
                    text = "Redinição de senha",
                    fontFamily = RobotoFont,
                    fontWeight = FontWeight.Bold,
                    fontSize = 23.sp
                )
                InfoBox(
                    message = "Um email foi enviado para exemplo@email.com para finalizar o cadastro.",
                    success = true,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    text = stringResource(id = R.string.redefinir_senha),
                    fontFamily = RobotoFont,
                    fontSize = 14.sp,
                    fontWeight = FontWeight.Normal,
                    modifier = Modifier.padding(top = 10.dp)

                )
                Column(verticalArrangement = Arrangement.spacedBy(14.dp)) {
                    EntradaDeTexto("Código")
                    EntradaDeTexto("Nova senha")
                    EntradaDeTexto("Repita a nova senha")
                }
                Spacer(modifier = Modifier.height(40.dp))
                Button(
                    onClick = {navController.navigate("TelaPrincipal")},
                    shape = RoundedCornerShape(20.dp),
                    colors = ButtonDefaults.buttonColors(containerColor = SecondaryColor),
                    modifier = Modifier
                        .width(260.dp)
                        .height(50.dp)
                        .padding(top = 0.dp)
                ) {
                    Text(
                        text = "REDEFINIR",
                        color = Color.White,
                        fontFamily = RobotoFont,
                        fontSize = 18.sp,
                        fontWeight = FontWeight.Bold
                    )
                }
            }
        }
    }

}