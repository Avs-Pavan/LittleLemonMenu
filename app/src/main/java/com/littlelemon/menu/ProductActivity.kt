package com.littlelemon.menu

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent

class ProductActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val productItem =
            ProductItem(
                intent.getStringExtra(MainActivity.KEY_TITLE)!!,
                intent.getDoubleExtra(MainActivity.KEY_PRICE, 0.0),
                intent.getStringExtra(MainActivity.KEY_CATEGORY)!!,
                intent.getIntExtra(MainActivity.KEY_IMAGE, -1),
            )

        setContent { ProductDetails(productItem) }
    }
}