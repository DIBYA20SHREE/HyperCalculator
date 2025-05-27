package com.example.hypercalculator

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.hypercalculator.ui.theme.DeepViolet
import com.example.hypercalculator.ui.theme.HyperCalculatorTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            HyperCalculatorTheme {
                Column (modifier = Modifier
                    .fillMaxSize()
                    .padding(16.dp),
                    verticalArrangement = Arrangement.Bottom
                ){


                    Column(modifier = Modifier.fillMaxWidth()) {
                        Text(
                            "123+123",
                            fontSize = 30.sp,
                            color= DeepViolet,
                            textAlign= TextAlign.End,
                            modifier = Modifier.fillMaxWidth()
                        )
                        Text(
                            "246",
                            fontSize = 60.sp,
                            fontWeight = FontWeight.Bold,
                            color = DeepViolet,
                            textAlign= TextAlign.End,
                            modifier = Modifier.fillMaxWidth()

                        )
                    }

                    Spacer(modifier = Modifier.height(20.dp))

                    Numbers(onClick = {
                        //Actions
                    })
                }
            }
        }
    }
}

@Composable
fun Numbers(onClick : () ->Unit){

    Column(modifier = Modifier.fillMaxWidth()) {
        Row (
            horizontalArrangement = Arrangement.spacedBy(14.dp),
        ){
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = DeepViolet,
                    contentColor = Color.White

                )

            ) {
                Text(
                    "C",
                    fontSize = 26.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = DeepViolet,
                    contentColor = Color.White

                )

            ) {
                Text(
                    "(",
                    fontSize = 26.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = DeepViolet,
                    contentColor = Color.White

                )

            ) {
                Text(
                    ")",
                    fontSize = 26.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = DeepViolet,
                    contentColor = Color.White

                )

            ) {
                Text(
                    "/",
                    fontSize = 26.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))


        Row (
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            modifier = Modifier.fillMaxWidth()
        ){
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = DeepViolet

                ),
                border = BorderStroke(2.dp,DeepViolet)


            ) {
                Text(
                    "7",
                    fontSize = 26.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = DeepViolet

                ),
                border = BorderStroke(2.dp,DeepViolet)


            ) {
                Text(
                    "8",
                    fontSize = 26.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = DeepViolet

                ),
                border = BorderStroke(2.dp,DeepViolet)


            ) {
                Text(
                    "9",
                    fontSize = 26.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = DeepViolet,
                    contentColor = Color.White

                )

            ) {
                Text(
                    "*",
                    fontSize = 26.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))



        Row (
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            modifier = Modifier.fillMaxWidth()
        ){
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = DeepViolet

                ),
                border = BorderStroke(2.dp,DeepViolet)


            ) {
                Text(
                    "4",
                    fontSize = 26.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = DeepViolet

                ),
                border = BorderStroke(2.dp,DeepViolet)


            ) {
                Text(
                    "5",
                    fontSize = 26.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = DeepViolet

                ),
                border = BorderStroke(2.dp,DeepViolet)


            ) {
                Text(
                    "6",
                    fontSize = 26.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = DeepViolet,
                    contentColor = Color.White

                )

            ) {
                Text(
                    "-",
                    fontSize = 26.sp
                )
            }
        }


        Spacer(modifier = Modifier.height(16.dp))



        Row (
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            modifier = Modifier.fillMaxWidth()
        ){
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = DeepViolet

                ),
                border = BorderStroke(2.dp,DeepViolet)


            ) {
                Text(
                    "1",
                    fontSize = 26.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = DeepViolet

                ),
                border = BorderStroke(2.dp,DeepViolet)


            ) {
                Text(
                    "2",
                    fontSize = 26.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = DeepViolet

                ),
                border = BorderStroke(2.dp,DeepViolet)


            ) {
                Text(
                    "3",
                    fontSize = 26.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = DeepViolet,
                    contentColor = Color.White
                ),


            ) {
                Text(
                    "+",
                    fontSize = 26.sp
                )
            }
        }

        Spacer(modifier = Modifier.height(16.dp))


        Row (
            horizontalArrangement = Arrangement.spacedBy(14.dp),
            modifier = Modifier.fillMaxWidth()
        ){
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = DeepViolet,
                    contentColor = Color.White

                )

            ) {
                Text(
                    "AC",
                    fontSize = 24.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = Color.White,
                    contentColor = DeepViolet,
                ),
                border = BorderStroke(2.dp,DeepViolet)

            ) {
                Text(
                    "0",
                    fontSize = 26.sp,
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = DeepViolet,
                    contentColor = Color.White

                )

            ) {
                Text(
                    ".",
                    fontSize = 26.sp
                )
            }
            Button(
                onClick,
                modifier = Modifier
                    .size(80.dp),
                colors = ButtonDefaults.buttonColors(
                    containerColor = DeepViolet,
                    contentColor = Color.White

                )

            ) {
                Text(
                    "=",
                    fontSize = 26.sp
                )
            }
        }

    }

}

@Preview(showSystemUi = true)
@Composable
fun CalculatorPreview(){
    HyperCalculatorTheme {
        Column (modifier = Modifier
            .fillMaxSize()
            .padding(16.dp),
            verticalArrangement = Arrangement.Bottom
        ){

            Column {
                Text(
                    "123+123",
                    fontSize = 30.sp,
                    color= DeepViolet,
                    textAlign= TextAlign.End,
                    modifier = Modifier.fillMaxWidth()
                )
                Text(
                    "246",
                    fontSize = 60.sp,
                    fontWeight = FontWeight.Bold,
                    color = DeepViolet,
                    textAlign= TextAlign.End,
                    modifier = Modifier.fillMaxWidth()

                )
            }

            Spacer(modifier = Modifier.height(20.dp))

            Numbers(onClick = {
                //Actions
            })
        }
    }
}