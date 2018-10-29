package cn.tabll.foodsharing.tools

import android.content.Context
import android.support.v7.widget.RecyclerView
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.ListView
import android.widget.TextView
import cn.tabll.foodsharing.R

class ListAdapter(context: Context): RecyclerView.Adapter<ListAdapter.ViewHolder>(){
    var mContext : Context
    var mData: ArrayList<String> = ArrayList()

    init {
        mContext = context
    }

    fun setData(data : ArrayList<String>) {
        mData = data
        notifyDataSetChanged()
    }

    override fun getItemCount(): Int = mData.size

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(mContext).inflate(R.layout.lay_kind_of_food, null)
        return ViewHolder(view)
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.titleTv.text = mData[position]
        //Glide.with(mContext).load(mData.get(position).images.large).into(holder!!.thumbImg)
    }

    class ViewHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        var titleTv : TextView
        init {
            titleTv = itemView.findViewById(R.id.text_title) as TextView
        }
    }
}