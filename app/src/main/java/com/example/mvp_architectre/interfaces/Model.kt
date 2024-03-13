package com.example.mvp_architectre.interfaces

import com.example.mvp_architectre.data.Item

interface Model {
    fun getItems(): List<Item>
}