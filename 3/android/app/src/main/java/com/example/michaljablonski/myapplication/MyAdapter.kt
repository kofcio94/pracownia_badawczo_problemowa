package com.example.michaljablonski.myapplication

import android.annotation.SuppressLint
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView

class MyAdapter(private val itemsAmount: Int) : RecyclerView.Adapter<MyAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, p1: Int): MyAdapter.ViewHolder =
        ViewHolder(LayoutInflater.from(parent.context).inflate(R.layout.item_layout, parent, false))

    override fun getItemCount(): Int = itemsAmount

    @SuppressLint("SetTextI18n")
    override fun onBindViewHolder(viewHolder: MyAdapter.ViewHolder, position: Int) {
        viewHolder.textView.text = "Test $position"
        if (position % 2 == 0)
            viewHolder.imageView.setImageResource(R.drawable.image1)
        else
            viewHolder.imageView.setImageResource(R.drawable.image2)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val imageView = itemView.findViewById<ImageView>(R.id.image_view)
        val textView = itemView.findViewById<TextView>(R.id.text_view)
    }

}