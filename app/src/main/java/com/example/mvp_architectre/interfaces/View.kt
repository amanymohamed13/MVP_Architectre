package com.example.mvp_architectre.interfaces

import com.example.mvp_architectre.data.Item

interface View {
    fun displayItems(items: List<Item>)
}