package com.example.mvp_architectre

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.RecyclerView
import com.example.mvp_architectre.adapters.ItemAdapter
import com.example.mvp_architectre.data.Item
import com.example.mvp_architectre.data.ItemModel
import com.example.mvp_architectre.interfaces.Presenter
import com.example.mvp_architectre.interfaces.View

class MainActivity : AppCompatActivity(), View {
    private lateinit var presenter: Presenter
    private lateinit var recyclerView: RecyclerView
    private lateinit var adapter: ItemAdapter


 // Amany Mohamed Sayed Ramadan  G1


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        recyclerView = findViewById(R.id.recyclerView)
        adapter = ItemAdapter()
        recyclerView.adapter = adapter

        presenter = ItemPresenter(ItemModel(), this)
        presenter.onViewCreated()
    }

    override fun displayItems(items: List<Item>) {
        adapter.setItems(items)
    }
}

