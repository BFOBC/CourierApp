package com.kashif.common

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.painter.Painter
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import kotlinx.coroutines.CoroutineDispatcher
import org.koin.core.module.Module

expect fun platformModule(): Module

 expect val ioDispatcher: CoroutineDispatcher

@Composable
expect fun font(name: String, res: String, weight: FontWeight, style: FontStyle): Font

@Composable
expect fun VideoPlayer(modifier: Modifier, videoId: String)

@Composable
expect fun WebView(
 modifier: Modifier,
 link: String,
 )

@Composable
internal expect fun getCealChroniclerLogo(): Painter