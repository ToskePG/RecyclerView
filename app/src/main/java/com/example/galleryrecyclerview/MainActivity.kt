package com.example.galleryrecyclerview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.galleryrecyclerview.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    var items = listOf(
        GalleryItem(R.drawable.download),
        GalleryItem(R.drawable.logo),
        GalleryItem(R.drawable.download),
        GalleryItem(R.drawable.logo),
        GalleryItem(R.drawable.download),
    )

    private lateinit var binding: ActivityMainBinding
    private lateinit var adapter: Adapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        initRecyclerView()
    }

    private fun initRecyclerView(){
        adapter = Adapter(items){
            items -> Toast.makeText(this, "This is a pciture",Toast.LENGTH_LONG).show()
        }
        binding.rv.layoutManager = LinearLayoutManager(this, LinearLayoutManager.VERTICAL,false)
        binding.rv.adapter = adapter
    }
}