package com.littlelemon.menu

class SortHelper {

    fun sortProducts(type: SortType, productsList: List<ProductItem>): List<ProductItem> {
        return when (type) {
            SortType.Alphabetically -> productsList.sortAlphabetically()
            SortType.PriceAsc -> productsList.sortByPriceASC()
            SortType.PriceDesc -> productsList.sortByPriceDESC()
        }
    }

    private fun List<ProductItem>.sortAlphabetically(): List<ProductItem> {
        return sortedBy { it.title }
    }

    private fun List<ProductItem>.sortByPriceASC(): List<ProductItem> {
        return sortedBy { it.price }
    }
    private fun List<ProductItem>.sortByPriceDESC(): List<ProductItem> {
        return sortedBy { it.price }.reversed()
    }

}