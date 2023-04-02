package com.example.galleryrecyclerview

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.example.galleryrecyclerview.databinding.GalleryItemBinding

class Adapter(
    private var items: List<GalleryItem>,
    private var onClick: (GalleryItem) -> Unit
) : RecyclerView.Adapter<Adapter.GalleryViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): GalleryViewHolder {
        val binding = GalleryItemBinding.inflate(LayoutInflater.from(parent.context))
        return GalleryViewHolder(binding)
    }

    override fun onBindViewHolder(holder: GalleryViewHolder, position: Int) {
        holder.bind(items[position])
    }

    override fun getItemCount(): Int {
        return items.size
    }

    inner class GalleryViewHolder(private val binding: GalleryItemBinding) : RecyclerView.ViewHolder(binding.root){

        fun bind(item: GalleryItem){
            binding.ivSlika.setImageResource(item.imageId)
            binding.ivSlika.setOnClickListener(){
                onClick(item)
            }
        }
    }
}
