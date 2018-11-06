package com.pelingulcinar.sonraneolduapp.adapters

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.bumptech.glide.request.RequestOptions
import com.pelingulcinar.sonraneolduapp.R
import com.pelingulcinar.sonraneolduapp.data.DataDTO


class MainRecyclerAdapter(val news : List<DataDTO>) : RecyclerView.Adapter<MainRecyclerAdapter.ViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {

        val v = LayoutInflater.from(parent?.context).inflate(R.layout.items_recyclerview, parent, false)

        return ViewHolder(v)

    }
    override fun getItemCount(): Int {

        return news.size

    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {

        holder.newsTitle.text = news[position].title
        holder.description.text = news[position].content
        Glide.with(holder.itemView)

                .load(news[position].images)
                .apply(RequestOptions().centerCrop())
                .into(holder.image)

    }


    class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        val newsTitle = view.findViewById<TextView>(R.id.txt_news_title)
        val image = view.findViewById<ImageView>(R.id.image)
        val description = view.findViewById<TextView>(R.id.txt_news_description)



    }
}