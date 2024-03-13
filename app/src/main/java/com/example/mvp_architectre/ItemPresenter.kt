package com.example.mvp_architectre

import com.example.mvp_architectre.interfaces.Model
import com.example.mvp_architectre.interfaces.Presenter
import com.example.mvp_architectre.interfaces.View

class ItemPresenter(private val model: Model, private val view: View) : Presenter {
    override fun onViewCreated() {
        val items = model.getItems()
        view.displayItems(items)
    }
}