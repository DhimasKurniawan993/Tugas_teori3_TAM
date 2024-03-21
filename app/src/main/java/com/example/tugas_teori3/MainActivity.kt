package com.example.tugas_teori3

import android.graphics.drawable.Drawable
import android.media.Image
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.SystemBarStyle
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Arrangement.SpaceBetween
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.alpha
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.InspectableModifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.tugas_teori3.R.drawable.background_tugas3
import com.example.tugas_teori3.R.drawable.weather_icon_cloudy
import com.example.tugas_teori3.R.drawable.com_android_dialer
import com.example.tugas_teori3.R.drawable.com_android_mms
import com.example.tugas_teori3.R.drawable.com_android_bbk_lockscreen3
import com.example.tugas_teori3.R.drawable.com_android_camera
import com.example.tugas_teori3.R.drawable.id_co_unila_academic
import com.example.tugas_teori3.R.drawable.com_vivo_compass
import com.example.tugas_teori3.R.drawable.com_aimp_player
import com.example.tugas_teori3.R.drawable.com_bbk_calendar
import com.example.tugas_teori3.R.drawable.com_bbk_theme
import com.example.tugas_teori3.R.drawable.id_co_bri_brimo
import com.example.tugas_teori3.R.drawable.com_android_vending
import com.example.tugas_teori3.R.drawable.com_android_bbkclock
import com.example.tugas_teori3.R.drawable.com_android_settings
import com.example.tugas_teori3.R.drawable.com_google_android_googlequicksearchbox
import com.example.tugas_teori3.R.drawable.com_android_chrome
import com.example.tugas_teori3.R.drawable.com_google_android_gm
import com.example.tugas_teori3.R.drawable.com_google_android_apps_maps
import com.example.tugas_teori3.R.drawable.com_google_android_youtube
import com.example.tugas_teori3.R.drawable.com_google_android_apps_docs
import com.example.tugas_teori3.R.drawable.com_google_android_music
import com.example.tugas_teori3.R.drawable.com_google_android_videos
import com.example.tugas_teori3.R.drawable.com_google_android_apps_photos
import com.example.tugas_teori3.ui.theme.Tugas_teori3Theme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        enableEdgeToEdge(
            statusBarStyle = SystemBarStyle.dark(
                android.graphics.Color.TRANSPARENT
            )
        )
        super.onCreate(savedInstanceState)
        setContent {
            Tugas_teori3Theme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    User_interface()
                }
            }
        }
    }
}
@Composable
fun User_interface(){
    Image(
        painter = painterResource(background_tugas3),
        contentDescription = null,
        contentScale = ContentScale.FillWidth)
    Column(modifier = Modifier
        .fillMaxHeight(),
        verticalArrangement = SpaceBetween
    ) {
        Clockwidget()
        Icon_App()
    }


}
@Composable
fun Icon_App(){
    Column(modifier = Modifier
        .padding(20.dp),
        verticalArrangement = Arrangement.Bottom
    ) {
        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp),
            horizontalArrangement = SpaceBetween,
            verticalAlignment = Alignment.Bottom){
            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                )
            }

            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                )
            }


            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White)
                ){
                    Image(modifier = Modifier
                        .size(52.dp),
                        painter = painterResource(com_vivo_compass),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )
                }
                Text(text = "Compass",
                    color = Color.White,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }

            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White),
                    contentAlignment = Alignment.Center
                ){
                    Image(modifier = Modifier
                        .size(40.dp),
                        painter = painterResource(id_co_unila_academic),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )
                }
                Text(text = "Siakad Univ",
                    color = Color.White,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp),
            horizontalArrangement = SpaceBetween,
            verticalAlignment = Alignment.Bottom){
            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White)
                ){
                    Image(modifier = Modifier
                        .size(52.dp),
                        painter = painterResource(com_aimp_player),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )
                }
                Text(text = "AIMP",
                    color = Color.White,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }

            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White)
                ){
                    Image(modifier = Modifier
                        .size(52.dp),
                        painter = painterResource(com_bbk_calendar),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )
                }
                Text(text = "Calendar",
                    color = Color.White,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }

            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White)
                ){
                    Image(modifier = Modifier
                        .size(52.dp),
                        painter = painterResource(com_bbk_theme),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )
                }
                Text(text = "Theme",
                    color = Color.White,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }

            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White),
                    contentAlignment = Alignment.Center
                ){
                    Image(modifier = Modifier
                        .size(40.dp),
                        painter = painterResource(id_co_bri_brimo),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )
                }
                Text(text = "BRImo",
                    color = Color.White,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp),
            horizontalArrangement = SpaceBetween,
            verticalAlignment = Alignment.Bottom){
            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                ){
                    Image(modifier = Modifier
                        .size(52.dp),
                        painter = painterResource(com_android_vending),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )
                }
                Text(text = "Play Store",
                    color = Color.White,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }

            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White)
                ){
                    Image(modifier = Modifier
                        .size(52.dp),
                        painter = painterResource(com_android_bbkclock),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )
                }
                Text(text = "Clock",
                    color = Color.White,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }

            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White)
                ){
                    Image(modifier = Modifier
                        .size(52.dp),
                        painter = painterResource(com_android_settings),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )
                }
                Text(text = "Settings",
                    color = Color.White,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }

            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Google()
                Text(text = "Google",
                    color = Color.White,
                    fontSize = 12.sp,
                    textAlign = TextAlign.Center
                )
            }
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp),
            horizontalArrangement = Arrangement.Center){
            Text(text = "● 1/16",
                color = Color.White,
                fontSize = 15.sp,
                textAlign = TextAlign.Center
            )
        }

        Row(modifier = Modifier
            .fillMaxWidth()
            .padding(top = 15.dp),
            horizontalArrangement = SpaceBetween,
            verticalAlignment = Alignment.Bottom){
            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White)
                ){
                    Image(modifier = Modifier
                        .size(52.dp),
                        painter = painterResource(com_android_dialer),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White)
                ){
                    Image(modifier = Modifier
                        .size(52.dp),
                        painter = painterResource(com_android_mms),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )
                }
            }

            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White)
                ){
                    Image(modifier = Modifier
                        .size(52.dp),
                        painter = painterResource(com_android_bbk_lockscreen3),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
            Column(modifier = Modifier
                .width(68.dp)
                ,horizontalAlignment = Alignment.CenterHorizontally) {
                Box(modifier = Modifier
                    .size(52.dp)
                    .clip(shape = RoundedCornerShape(15.dp))
                    .background(Color.White)
                ){
                    Image(modifier = Modifier
                        .size(52.dp),
                        painter = painterResource(com_android_camera),
                        contentDescription = null,
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
        }
        Spacer(modifier = Modifier.height(30.dp))
    }
}

@Composable
fun Clockwidget() {
    Row(horizontalArrangement = SpaceBetween,
        verticalAlignment = Alignment.Bottom,
        modifier = Modifier
            .fillMaxWidth()
    ) {
        Column(
            Modifier
                .padding(20.dp)) {
            Text(modifier = Modifier.padding(horizontal = 5.dp),
                text = "10:59",
                color = Color.White,
                fontSize = 40.sp)
            Text(modifier = Modifier.padding(horizontal = 5.dp),
                text = "Thu, Mar 7",
                color = Color.White,
                fontSize = 16.sp)
        }

        Column(
            Modifier
                .padding(20.dp)) {
            Row(horizontalArrangement = Arrangement.End) {
                Text(modifier = Modifier.padding(horizontal = 5.dp),
                    text = "Kampung Baru 30°C",
                    color = Color.White,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Left)
                Image(
                    painter = painterResource(weather_icon_cloudy),
                    contentDescription = null,
                    Modifier.size(20.dp))
            }
            Row(horizontalArrangement = Arrangement.End) {
                Text(modifier = Modifier.padding(horizontal = 5.dp),
                    text = "Bandar Lamp...30°C",
                    color = Color.White,
                    fontSize = 15.sp,
                    textAlign = TextAlign.Left
                )
                Image(
                    painter = painterResource(weather_icon_cloudy),
                    contentDescription = null,
                    Modifier.size(20.dp))
            }
        }
    }
}

@Composable
fun Google(){
    Box(modifier = Modifier
        .size(52.dp)
        .clip(shape = RoundedCornerShape(15.dp))
        .background(Color.White.copy(0.5f)),
        contentAlignment = Alignment.Center
    ){
        Column(modifier = Modifier
            .height(48.dp)
            .width(48.dp),
            verticalArrangement = Arrangement.SpaceEvenly) {
            Row(modifier = Modifier
                .width(48.dp),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                Image(modifier = Modifier
                    .size(12.dp),
                    painter = painterResource(com_google_android_googlequicksearchbox),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )

                Image(modifier = Modifier
                    .size(12.dp),
                    painter = painterResource(com_android_chrome),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )

                Image(modifier = Modifier
                    .size(12.dp),
                    painter = painterResource(com_google_android_gm),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
            }
            Row(modifier = Modifier
                .width(48.dp),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                Image(modifier = Modifier
                    .size(12.dp),
                    painter = painterResource(com_google_android_apps_maps),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )

                Image(modifier = Modifier
                    .size(12.dp),
                    painter = painterResource(com_google_android_youtube),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )

                Image(modifier = Modifier
                    .size(12.dp),
                    painter = painterResource(com_google_android_apps_docs),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
            }
            Row(modifier = Modifier
                .width(48.dp),
                horizontalArrangement = Arrangement.SpaceEvenly) {
                Image(modifier = Modifier
                    .size(12.dp),
                    painter = painterResource(com_google_android_music),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )

                Image(modifier = Modifier
                    .size(12.dp),
                    painter = painterResource(com_google_android_videos),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )

                Image(modifier = Modifier
                    .size(12.dp),
                    painter = painterResource(com_google_android_apps_photos),
                    contentDescription = null,
                    contentScale = ContentScale.FillBounds
                )
            }
        }
    }

}

        @Preview(
    showBackground = true,
    showSystemUi = true
)
@Composable
fun GreetingPreview() {
    Tugas_teori3Theme {
        User_interface()
    }
}
