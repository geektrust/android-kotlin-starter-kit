package com.assemble.productlisting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.assemble.productlisting.ui.ProductListScreen
import com.assemble.productlisting.ui.theme.ProductListingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ProductListingTheme {
                ProductListScreen()
            }
        }
    }
}
