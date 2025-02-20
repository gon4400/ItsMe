package com.example.itsme

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Divider
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.material3.TopAppBar
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.platform.LocalConfiguration
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.itsme.ui.theme.ItsMeTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ItsMeTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                  ScaffoldComposable()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun AppBar() {
    TopAppBar(
        title = {
            Text(
                text = "Mario",
                style = MaterialTheme.typography.headlineSmall,
            )
        },
        navigationIcon = {
            Image(
                painter = painterResource(id = R.drawable.appstore),
                contentDescription = null,
                modifier = Modifier
                    .padding(8.dp)
                    .clip(MaterialTheme.shapes.medium)
            )
        }
    )
}

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun ScaffoldComposable() {
    Scaffold(
        topBar = { AppBar()},
        content = { Body(name = "Mario")}
    )
}


@Composable
fun Body(name: String) {
    val localConfiguration = LocalConfiguration.current
    val height  = localConfiguration.screenHeightDp
    val width = localConfiguration.screenWidthDp

 Column(modifier = Modifier.fillMaxSize(),
     verticalArrangement = Arrangement.SpaceEvenly,
     horizontalAlignment = Alignment.CenterHorizontally){

     Text(text = "It's me ! : $name", style = MaterialTheme.typography.headlineMedium)
     Surface(tonalElevation = 12.dp,
         modifier = Modifier.width((width * 0.66).dp),
         shape = MaterialTheme.shapes.small ) {

         Column(horizontalAlignment = Alignment.CenterHorizontally) {
             Image(painter = painterResource(id = R.drawable.profile),
                 contentDescription = "Image Mario", modifier = Modifier
                     .height((height/5).dp)
                     .width((height/5).dp)
                     .padding(25.dp)
                     .clip(MaterialTheme.shapes.large)
             )
             Text(text = name, style = MaterialTheme.typography.headlineLarge)
             Divider()
             Text(text = "Je suis un plombier vivant à new york city")
         }
     }
     Spacer(modifier = Modifier)
 }
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ItsMeTheme {
        ScaffoldComposable()
    }
}