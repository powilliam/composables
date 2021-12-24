package com.powilliam.composables.ui.activities

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.powilliam.composables.ui.composables.ChipGroup
import com.powilliam.composables.ui.themes.DefaultMaterialTheme

class ComposablesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultMaterialTheme({ this }) {
                Surface(Modifier.padding(16.dp)) {
                    ChipGroup {
                        listOf("William", "Igão", "Matheus", "Ítalo", "Clebinho").onEach {
                            Button(onClick = { /*TODO*/ }) {
                                Text(text = it)
                            }
                        }
                    }
                }
            }
        }
    }
}