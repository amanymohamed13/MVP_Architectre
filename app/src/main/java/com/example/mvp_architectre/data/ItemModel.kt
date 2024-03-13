package com.example.mvp_architectre.data

import com.example.mvp_architectre.R
import com.example.mvp_architectre.interfaces.Model

class ItemModel : Model {
    override fun getItems(): List<Item> {
        return listOf(
            Item("Item 1",  R.drawable.lv4),
            Item("Item 2",  R.drawable.lv4),
            Item("Item 3",  R.drawable.lv4)
        )
    }
}