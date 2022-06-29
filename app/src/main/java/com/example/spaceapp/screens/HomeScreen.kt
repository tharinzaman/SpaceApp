package com.example.spaceapp.screens

import androidx.compose.animation.AnimatedVisibility
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.*
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.CornerSize
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.KeyboardArrowDown
import androidx.compose.material.icons.filled.KeyboardArrowUp
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import coil.compose.AsyncImage
import coil.request.ImageRequest
import com.example.spaceapp.data.Planet
import com.example.spaceapp.data.getPlanets
import com.example.spaceapp.navigation.ScreensEnum
import com.example.spaceapp.viewmodel.SpaceAppViewModel
import okhttp3.Route
import org.w3c.dom.Text

@Composable
fun HomeScreen(
    navController: NavController,
    model: SpaceAppViewModel,
    planetList: List<Planet> = getPlanets()
) {
    // To stop the tts if the user presses the back button at the bottom of the screen.
    if (model.tts != null && model.tts!!.isSpeaking) {
        model.tts!!.stop()
    }
    Scaffold(topBar = {
        TopAppBar(backgroundColor = Color(0xFF1A81FF)) {
            Text(
                text = "Planets",
                color = Color.White,
                fontWeight = FontWeight.Bold,
                fontSize = 25.sp,
                modifier = Modifier.padding(start = 10.dp)
            )
        }
    }) {
        Column(
            modifier = Modifier
                .padding(12.dp), horizontalAlignment = Alignment.CenterHorizontally
        ) {
            LazyColumn() {
                items(items = planetList) {
                    PlanetRow(planet = it) { planet ->
                        navController.navigate(route = ScreensEnum.DetailsScreen.name + "/$planet")
                    }
                }
            }
        }
    }
}

@Composable
fun PlanetRow(
    planet: Planet = getPlanets()[0],
    onItemClick: (String) -> Unit = {}
) {

    var expanded by remember {
        mutableStateOf(false)
    }

    Card(
        modifier = Modifier
            .padding(4.dp)
            .fillMaxWidth()
            // .height(130.dp)
            .clickable {
                onItemClick(planet.name)
            },
        shape = RoundedCornerShape(corner = CornerSize(16.dp))
    ) {
        // Horizontal row for the image and the info
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.Start
        ) {
            Surface(
                modifier = Modifier
                    .padding(12.dp)
                    .size(100.dp),
                shape = CircleShape,
                elevation = 4.dp
            ) {
                AsyncImage(
                    model = ImageRequest
                        .Builder(LocalContext.current)
                        .data(planet.mainImage)
                        .crossfade(true)
                        .build(),
                    contentScale = ContentScale.Crop,
                    modifier = Modifier.clip(CircleShape),
                    contentDescription = "Planet image"
                )
            }
            // Vertical column for the name and arrow button
            Column(modifier = Modifier.padding(10.dp)) {
                Text(
                    text = planet.name,
                    fontSize = 20.sp,
                    fontWeight = FontWeight.ExtraBold
                )
                // The detailed text that can be hidden and unhidden
                AnimatedVisibility(visible = expanded) {
                    Column {
                        Text(text = "Number from the Sun: ${planet.noFromSun}")
                        Text(text = "Distance from the Sun: ${planet.distFromSun}")
                        Text(text = "Time to get to this planet from Earth: ${planet.timeToGetThere}")
                        Text(text = "Orbital period: ${planet.orbitalPeriod}")
                        Text(text = "Day length: ${planet.dayLength}")
                        Text(text = "Average temperature: ${planet.averageTemp}")
                        Text(text = "Year discovered: ${planet.yearDiscovered}")
                        Text(text = "Discovered by: ${planet.discoveredBy}")
                        Text(text = "State: ${planet.state}")
                    }
                }
                Icon(
                    imageVector = if (!expanded) Icons.Filled.KeyboardArrowDown
                    else Icons.Filled.KeyboardArrowUp,
                    contentDescription = "Arrow",
                    modifier = Modifier
                        .size(25.dp)
                        .clickable {
                            expanded = !expanded
                        },
                    tint = Color.DarkGray
                )

            }

        }
    }
}







