package com.samplecompose

import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp

@Composable
fun MainContent() {
    val count = remember {
        mutableStateOf(0)
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = "Simple Compose app with WalkMe", color = MaterialTheme.colors.primary)
        Spacer(modifier = Modifier.height(16.dp))
        Text(text = "Clicked count = ${count.value}", color = MaterialTheme.colors.primary)
        Spacer(modifier = Modifier.height(16.dp))
        Row {
            IconButton(onClick = { count.value = count.value - 1 }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_remove_24),
                    contentDescription = "Decrease count",
                    tint = MaterialTheme.colors.primary
                )
            }
            Spacer(modifier = Modifier.width(16.dp))
            IconButton(onClick = { count.value = count.value + 1 }) {
                Icon(
                    painter = painterResource(id = R.drawable.ic_baseline_add_24),
                    contentDescription = "Increase count",
                    tint = MaterialTheme.colors.primary
                )
            }
        }
    }
}

@Composable
@Preview
private fun MainContentPreview() {
    MainContent()
}