package com.assemble.productlisting.data

import android.content.Context
import com.google.gson.Gson
import com.google.gson.reflect.TypeToken
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext

class ProductService(private val context: Context) {

    suspend fun fetchProducts(): List<Product> {
        return withContext(Dispatchers.IO) {
            val json = context.assets
                .open("products.json")
                .bufferedReader()
                .use { it.readText() }

            val type = object : TypeToken<List<Product>>() {}.type
            Gson().fromJson(json, type)
        }
    }
}
