package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.material3.Divider
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.blur
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Color.Companion.Green
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.businesscardapp.ui.theme.BusinessCardAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BusinessCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = Color(0xFFe8fbe8)
                ) {
                    BusinessCardApp()
                }
            }
        }
    }
}

@Composable
fun BusinessCardApp() {
    Column(
        verticalArrangement = Arrangement.Bottom,
        horizontalAlignment = Alignment.CenterHorizontally

    ){
        val image = painterResource(R.drawable.android_logo)
        Image(
            painter = image,
            contentDescription = "Android logo",
            Modifier.fillMaxWidth(0.3f).background(color = Color.Black),
        )

        Text(
            text = stringResource(R.string.name),
            fontSize = 35.sp,
            color = Color.Black
        )

        Spacer(modifier = Modifier.padding(bottom = 10.dp))

        Text(
            text = stringResource(R.string.designation),
            fontSize = 20.sp,
            color = Color(0xFF007600),
            fontWeight = FontWeight.Bold
        )

        Spacer(modifier = Modifier.padding(bottom = 250.dp))

        Column(
            modifier = Modifier.fillMaxWidth().padding(bottom = 10.dp),
            verticalArrangement = Arrangement.Bottom,
            horizontalAlignment = Alignment.CenterHorizontally
        ){
            ContactRow(
                text = stringResource(R.string.phone),
                icon = Icons.Rounded.Phone
            )

            ContactRow(
                text = stringResource(R.string.account),
                icon = Icons.Rounded.Share
            )

            ContactRow(
                text = stringResource(R.string.email),
                icon = Icons.Rounded.Email
            )
        }
    }
}

@Composable
fun ContactRow(text: String, icon: ImageVector) {
    Row(
        horizontalArrangement = Arrangement.Absolute.Center,
        modifier = Modifier.padding(10.dp)
    ) {
        Icon(
            imageVector = icon,
            contentDescription = null,
            tint = Color(0xFF007600),
            modifier = Modifier.weight(1f)
        )

        Text(
            text = text,
            color = Color.Black,
            modifier = Modifier.weight(3f)
        )
    }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    BusinessCardAppTheme {
        BusinessCardApp()
    }
}