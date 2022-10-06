package com.samplecompose

import abbi.io.abbisdk.ABBI
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.compose.material.MaterialTheme

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            MaterialTheme {
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