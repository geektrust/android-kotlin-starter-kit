package com.assemble.productlisting.ui

import android.app.Application
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.viewModelScope
import com.assemble.productlisting.data.Product
import com.assemble.productlisting.data.ProductService
import kotlinx.coroutines.launch

class ProductViewModel(application: Application) : AndroidViewModel(application) {

    private val service = ProductService(application)

    var products: List<Product> by mutableStateOf(emptyList())
        private set

    init {
        load()
    }

    fun load() {
        viewModelScope.launch {
            products = service.fetchProducts()
        }
    }
}
