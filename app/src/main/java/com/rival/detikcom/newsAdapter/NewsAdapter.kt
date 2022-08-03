package com.rival.detikcom.newsAdapter

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.rival.detikcom.R
import kotlinx.android.synthetic.main.lay_berita.view.*

class NewsAdapter(val context: Context, val list: List<news>) :
    RecyclerView.Adapter<NewsAdapter.MyViewHolder>() {
    class MyViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var currentNews: news? = null
        val currentPosition: Int = 0

        fun setData(currentnews:news, post:Int) {
            itemView.tvw_title.text = currentnews!!.title
//            itemView.tvw_Desc.text = currentnews!!.desc
            itemView.img_news.setImageResource(currentnews!!.photo)

            this.currentNews
            this.currentPosition
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MyViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.lay_berita, parent, false)
        return MyViewHolder(view)
    }

    override fun onBindViewHolder(holder: MyViewHolder, position: Int) {
        var datanews = list[position]
        holder.setData(datanews, position)

        holder.itemView.setOnClickListener() { onItemClickCallback.onItemClick(list[position]) }
    }
    // region 1. Event Click
    private lateinit var onItemClickCallback: OnItemClickCallback

    fun setOnClickCallback(onItemClickCallback: OnItemClickCallback) {
        this.onItemClickCallback = onItemClickCallback
    }
    interface OnItemClickCallback {
        fun onItemClick(data: news)
    }


    override fun getItemCount(): Int {
        return list.size
    }
}