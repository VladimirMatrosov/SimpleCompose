package com.samplecompose

import abbi.io.abbisdk.ABBI
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.foundation.isSystemInDarkTheme
import androidx.compose.material.MaterialTheme
import androidx.compose.material.darkColors
import androidx.compose.material.lightColors

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme(colors = if (isSystemInDarkTheme()) DarkColors else LightColors) {
                MainContent()
            }
        }

        ABBI.start(
            "1fdac3ec-e1c4-4d15-8c4e-bc4841cfd7d8",
            "STJpNnlzdWFtNVNRRFdZU1VNK3Q3VUNtdCtqTHJUTkhKU3YxZ0haTUpNMklMQ3ZUdC9NYzEwRmVYZU1XdURsYzc0",
            application
        )
    }
}