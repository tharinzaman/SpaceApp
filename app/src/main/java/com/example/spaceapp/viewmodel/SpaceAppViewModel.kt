package com.example.spaceapp.viewmodel

import android.content.Context
import android.speech.tts.TextToSpeech
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.viewinterop.AndroidView
import androidx.lifecycle.ViewModel
import com.google.android.exoplayer2.MediaItem
import com.google.android.exoplayer2.SimpleExoPlayer
import com.google.android.exoplayer2.source.ProgressiveMediaSource
import com.google.android.exoplayer2.ui.PlayerView
import com.google.android.exoplayer2.upstream.DataSource
import com.google.android.exoplayer2.upstream.DefaultDataSourceFactory
import com.google.android.exoplayer2.util.Util

class SpaceAppViewModel : ViewModel() {

    var tts: TextToSpeech? = null
    fun textToSpeech(context: Context, text: String) {
        tts = TextToSpeech(context) {
            tts!!.speak(text, TextToSpeech.QUEUE_FLUSH, null, "")
        }
    }

    @Composable
    fun VideoPlayer(context: Context, videoUri: String) {

        val video = MediaItem.fromUri(videoUri)

        val exoPlayer = remember(context) {
            SimpleExoPlayer.Builder(context).build().apply {
                val dataSourceFactory: DataSource.Factory = DefaultDataSourceFactory(
                    context,
                    Util.getUserAgent(context, context.packageName)
                )
                val source = ProgressiveMediaSource.Factory(dataSourceFactory)
                    .createMediaSource(video)
                this.prepare(source)
            }
        }

        AndroidView(factory = { context ->
            PlayerView(context).apply {
                player = exoPlayer
            }
        })
    }
}
