@file:OptIn(ExperimentalResourceApi::class)

package com.kashif.common.presentation.screens.signin

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentWidth
import androidx.compose.material.MaterialTheme
import androidx.compose.material.OutlinedButton
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.unit.dp
import com.kashif.common.getCealChroniclerLogo
import org.jetbrains.compose.resources.ExperimentalResourceApi


@Composable
fun AppOnboarding(){
    MaterialTheme {
        TwoButtonsCentered()
    }
}
@Composable
fun TwoButtonsCentered() {
    Column(
        modifier = Modifier
            .fillMaxSize()
          ,
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = androidx.compose.foundation.layout.Arrangement.Center
    ) {
        Spacer(modifier = Modifier.weight(1f))

        OutlinedButton(
            onClick = { /* Handle button click */ },
            modifier = Modifier.fillMaxWidth().height(60.dp)
                .padding(horizontal = 16.dp, vertical = 8.dp) // Add 16dp padding to the buttons
        ) {
            Text("Sign In as a broker")
        }

        OutlinedButton(
            onClick = { /* Handle button click */ },
            modifier = Modifier.fillMaxWidth().height(60.dp)
                .padding(horizontal = 16.dp, vertical = 8.dp) // Add 16dp padding to the buttons
        ) {
            Text("Sign In as a Courier")
        }
        Spacer(modifier = Modifier.weight(1f))

        Image(
            painter = getCealChroniclerLogo(), // Replace with your image resource
            contentDescription = null,
            contentScale = ContentScale.FillWidth,
            modifier = Modifier
                .fillMaxWidth()
                .height(200.dp) // Adjust the height as needed
                .padding(top = 16.dp)
        )

    }


}