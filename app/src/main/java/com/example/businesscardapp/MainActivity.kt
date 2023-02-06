package com.example.businesscardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Email
import androidx.compose.material.icons.rounded.Phone
import androidx.compose.material.icons.rounded.Share
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
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
                    color = colorResource(id = R.color.blueish)
                ) {
                    Column(
                        horizontalAlignment = Alignment.CenterHorizontally) {
                        Header()

                    }
                    Footer()
                }
            }
        }
    }
}

@Composable
fun Footer(){

    Column(modifier = Modifier.padding(bottom = 40.dp), verticalArrangement = Arrangement.Bottom, horizontalAlignment = Alignment.Start) {
        Divider(modifier = Modifier.padding(top = 10.dp , bottom = 10.dp), color = MaterialTheme.colors.background)
        details(textToShow = "+11 (123) 333 444 555", iconToShow = Icons.Rounded.Phone)

        Divider(modifier = Modifier.padding(top = 10.dp , bottom = 10.dp), color = MaterialTheme.colors.background)
        details(textToShow = "@AndroidDev", iconToShow = Icons.Rounded.Share)

        Divider(modifier = Modifier.padding(top = 10.dp , bottom = 10.dp), color = MaterialTheme.colors.background)
        details(textToShow = "mansimar@android.com", iconToShow = Icons.Rounded.Email)

    }
    }

@Composable
fun details(textToShow:String, iconToShow: ImageVector)
{
    Row() {
        Icon(iconToShow, contentDescription = "Icon",
            modifier = Modifier.padding(start = 50.dp , end = 25.dp),
            tint = colorResource(id = R.color.greenish))

        Text(text = textToShow,
            color = MaterialTheme.colors.background)
    }
}


@Composable
fun Header() {
    Image(
        modifier = Modifier
            .padding(top = 175.dp)
            .size(120.dp),
        alignment = Alignment.Center,
        painter = painterResource(id = R.drawable.android_logo), contentDescription = "Image"
    )

    Text(
        text = stringResource(id = R.string.full_name),
        fontSize = 35.sp,
        color = MaterialTheme.colors.background
    )



    Text(
        text = stringResource(id = R.string.title),
        color = colorResource(id = R.color.greenish),
        modifier = Modifier.padding(top = 10.dp)
    )

}
@Preview(showBackground = true)
@Composable
fun Main()
{
    BusinessCardAppTheme {
        // A surface container using the 'background' color from the theme
        Surface(
            modifier = Modifier.fillMaxSize(),
            color = colorResource(id = R.color.blueish)
        ) {

            Column(horizontalAlignment = Alignment.CenterHorizontally) {
                Header()
            }

            Footer()
        }
    }
}