package com.example.spaceapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.ui.Modifier
import com.example.spaceapp.navigation.SpaceAppNavigation
import com.example.spaceapp.screens.VideoScreen
import com.example.spaceapp.ui.theme.SpaceAppTheme
import com.example.spaceapp.viewmodel.SpaceAppViewModel


class MainActivity : ComponentActivity() {

    private val model: SpaceAppViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            SpaceAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colors.background
                ) {
                    SpaceAppNavigation(model)
                }
            }
        }
    }

    override fun onDestroy() {
        if (model.tts != null) {
            model.tts?.stop()
            model.tts?.shutdown()
        }
        super.onDestroy()
    }

}

