package com.assemble.productlisting.data

data class Product(
    val id: String,
    val name: String,
    val price: Double,
    val discountPercentage: Double   // every product is forced to have a discount
)
