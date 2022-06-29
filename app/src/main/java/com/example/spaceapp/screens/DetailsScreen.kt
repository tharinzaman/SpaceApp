package com.example.spaceapp.screens

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.rememberAsyncImagePainter
import com.example.spaceapp.R
import com.example.spaceapp.data.Planet
import com.example.spaceapp.data.getPlanets
import com.example.spaceapp.navigation.ScreensEnum
import com.example.spaceapp.viewmodel.SpaceAppViewModel

@Composable
fun DetailsScreen(
    navController: NavController,
    model: SpaceAppViewModel,
    planetID: String?
) {
    val newPlanetList = getPlanets().filter { planet ->
        planet.name == planetID
    }
    Scaffold(topBar = {
        TopAppBar(
            backgroundColor = Color(0xFF1A81FF)
        ) {
            Row(horizontalArrangement = Arrangement.Start, modifier = Modifier.padding(10.dp)) {
                Icon(imageVector = Icons.Default.ArrowBack, tint = Color.White, contentDescription = "Arrow Back",
                    modifier = Modifier.clickable {
                        if (model.tts?.isSpeaking == true) {
                            model.tts!!.stop()
                        }
                        navController.popBackStack()
                    })
                Spacer(modifier = Modifier.width(10.dp))
                Text(
                    text = newPlanetList[0].name,
                    color = Color.White,
                    fontWeight = FontWeight.Bold,
                    fontSize = 25.sp
                )
            }

        }
    }) {
        Surface(
            modifier = Modifier
                .fillMaxHeight()
                .fillMaxWidth()
                .padding(10.dp)
        ) {
            Column(horizontalAlignment = Alignment.End) {
                DescriptionView(newPlanetList = newPlanetList)
                ButtonView(
                    model = model,
                    navController = navController,
                    newPlanetList = newPlanetList,
                    planetID = planetID
                )
                ImagesView(newPlanetList = newPlanetList)
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun toSee() {
    Column(
        verticalArrangement = Arrangement.Top,
        horizontalAlignment = Alignment.End
    ) {
        Card(modifier = Modifier.padding(10.dp), elevation = 10.dp) {
            Text(
                text = getPlanets()[0].description,
                modifier = Modifier.padding(10.dp),
                fontWeight = FontWeight.Medium,
                fontSize = 10.sp
            )
        }
        Surface(
            modifier = Modifier
                .padding(top = 2.dp, end = 10.dp)
                .size(20.dp)
                .background(Color.Transparent)
        ) {
            Image(
                painter = painterResource(id = R.drawable.text_to_speech_icon_135108),
                contentDescription = "Text to speech"
            )
        }
        Spacer(modifier = Modifier.height(4.dp))
        Button(
            onClick = {
                TODO()
            }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF1A81FF)),
            modifier = Modifier.padding(end = 10.dp)
        ) {
            Text(text = "Videos", color = Color.White, fontWeight = FontWeight.Bold)
        }
    }
}

@Composable
private fun DescriptionView(newPlanetList: List<Planet>) {
    Column(horizontalAlignment = Alignment.Start) {
        Card(modifier = Modifier.padding(10.dp), elevation = 10.dp) {
            Text(
                text = newPlanetList[0].description,
                modifier = Modifier.padding(10.dp),
                fontWeight = FontWeight.SemiBold,
                fontSize = 15.sp
            )
        }
    }
}

@Composable
fun ButtonView(
    model: SpaceAppViewModel,
    navController: NavController,
    newPlanetList: List<Planet>,
    planetID: String?
) {
    Column(horizontalAlignment = Alignment.End) {
        val context = LocalContext.current
        Surface(
            modifier = Modifier
                .padding(12.dp)
                .size(20.dp)
                .background(Color.Transparent)
        ) {
            Image(
                painter = painterResource(id = R.drawable.text_to_speech_icon_135108),
                contentDescription = "Text to speech", modifier = Modifier
                    .clickable {
                        model.textToSpeech(context, newPlanetList[0].description)
                    }
            )
        }
        Button(
            onClick = {
                if (model.tts?.isSpeaking == true) {
                    model.tts!!.stop()
                }
                navController.navigate(ScreensEnum.VideoScreen.name + "/${planetID}")
            }, colors = ButtonDefaults.buttonColors(backgroundColor = Color(0xFF1A81FF)),
            modifier = Modifier.padding(end = 10.dp)
        ) {
            Text(text = "Videos", color = Color.White, fontWeight = FontWeight.Bold)
        }
    }

}


@OptIn(ExperimentalFoundationApi::class)
@Composable
private fun ImagesView(newPlanetList: List<Planet>) {
    Column() {
        Text(
            text = "Images from Nasa", fontSize = 20.sp, fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        Spacer(modifier = Modifier.height(10.dp))
        LazyVerticalGrid(modifier = Modifier.fillMaxSize(), cells = GridCells.Fixed(3), content = {
            items(newPlanetList[0].images) { image ->
                Card(
                    modifier = Modifier
                        .padding(12.dp)
                        .size(200.dp),
                    shape = RoundedCornerShape(1.dp)
                ) {
                    Image(
                        painter = rememberAsyncImagePainter(model = image),
                        contentDescription = "Planet Images",
                        contentScale = ContentScale.FillBounds
                    )
                }
            }
        })
    }
}





