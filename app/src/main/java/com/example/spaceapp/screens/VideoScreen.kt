package com.example.spaceapp.screens

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.example.spaceapp.data.Planet
import com.example.spaceapp.data.getPlanets
import com.example.spaceapp.viewmodel.SpaceAppViewModel

@Composable
fun VideoScreen(navController: NavController, planetID: String?){

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
            VideosLayout(newPlanetList = newPlanetList)
        }
    }
}

@Composable
fun VideosLayout(newPlanetList: List<Planet>) {
    val model = SpaceAppViewModel()
    val context = LocalContext.current
    Column {
        Text(
            text = "Videos from Nasa", fontSize = 20.sp, fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center
        )
        LazyColumn(content = {
            items(newPlanetList[0].videos) { video ->
                Card(
                    modifier = Modifier
                        .padding(12.dp)
                        .size(400.dp)
                ) {
                    model.VideoPlayer(context = context, videoUri = video)
                }
            }
        })
    }
}