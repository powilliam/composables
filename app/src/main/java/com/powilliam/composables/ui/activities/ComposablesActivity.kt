package com.powilliam.composables.ui.activities

import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.ui.res.stringResource
import com.powilliam.composables.R
import com.powilliam.composables.ui.themes.DefaultMaterialTheme

class ComposablesActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            DefaultMaterialTheme({ this }) {
                Surface {
                    Text(text = stringResource(R.string.app_name))
                }
            }
        }
    }
}