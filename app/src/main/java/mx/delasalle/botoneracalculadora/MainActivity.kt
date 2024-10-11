package mx.delasalle.botoneracalculadora

import android.R
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonColors
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Alignment.Companion.Center
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import mx.delasalle.botoneracalculadora.ui.theme.BotoneraCalculadoraTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BotoneraCalculadoraTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Botonera()
                }
            }
        }
    }
}


@Preview(showBackground = true)
@Composable
fun Botonera() {
    Column(modifier = Modifier.fillMaxSize(),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally

        ){

        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)){
            CalculatorButton(tag = "1")
            CalculatorButton(tag = "2")
            CalculatorButton(tag = "3")
            CalculatorButton(tag = "+")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            CalculatorButton(tag = "4")
            CalculatorButton(tag = "5")
            CalculatorButton(tag = "6")
            CalculatorButton(tag = "-")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            CalculatorButton(tag = "7")
            CalculatorButton(tag = "8")
            CalculatorButton(tag = "9")
            CalculatorButton(tag = "*")
        }
        Spacer(modifier = Modifier.height(10.dp))
        Row(horizontalArrangement = Arrangement.spacedBy(10.dp)) {
            CalculatorButton(tag = "0")
            CalculatorButton(tag = "C")
            CalculatorButton(tag = "=")
            CalculatorButton(tag = "/")
        }
        Spacer(modifier = Modifier.height(10.dp))

    }
}

@Composable
fun CalculatorButton(tag: String){
    Button(
        onClick = {},
        modifier = Modifier
            .size(60.dp)
            .clip(CircleShape),
        colors = ButtonDefaults.buttonColors(
            containerColor = Color(106,90,205)
        )

    ) {
        Text(text = tag)
    }
}