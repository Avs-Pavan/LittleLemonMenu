package com.littlelemon.menu

import org.junit.Assert.assertEquals
import org.junit.Test


class FilterHelperTest {


    @Test
    fun `filterProducts_filterTypeDessert_croissantReturned`() {

        // Arrange
        val sampleProductsList = mutableListOf(
            ProductItem(title = "Black tea", price = 3.00, category = "Drinks", R.drawable.black_tea),
            ProductItem(title = "Croissant", price = 7.00, category = "Dessert", R.drawable.croissant),
            ProductItem(title = "Bouillabaisse", price = 20.00, category = "Food", R.drawable.bouillabaisse)
        )

        // Act
        val filtered = FilterHelper().filterProducts(FilterType.Dessert, sampleProductsList)

        // Assert
        assertEquals(1, filtered.size)
        assertEquals("Croissant", filtered.first().title)
        assertEquals(7.00, filtered.first().price,7.00)
        assertEquals("Croissant", filtered.first().title)
    }
}