package com.osamendi.devhouse

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            IDELayout()
        }
    }
}

@Composable
fun IDELayout() {
    Row(Modifier.fillMaxSize()) {

        Box(
            Modifier.weight(0.15f).fillMaxHeight()
                .background(Color(0xFF252526))
        ) {
            Text("Sidebar", color = Color.White)
        }

        Box(
            Modifier.weight(0.55f).fillMaxHeight()
                .background(Color(0xFF1E1E1E))
        ) {
            Text("Editor Area", color = Color.White)
        }

        Box(
            Modifier.weight(0.30f).fillMaxHeight()
                .background(Color.Black)
        ) {
            Text("Live Preview", color = Color.Green)
        }
    }
}
