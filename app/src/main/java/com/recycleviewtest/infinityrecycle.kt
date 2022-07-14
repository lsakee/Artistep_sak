package com.recycleviewtest

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.artistep.R
import com.bumptech.glide.Glide

class infinityrecycle(private val context : Context) :
RecyclerView.Adapter<infinityrecycle.ViewHolder>() {

    var datas = mutableListOf<ProfileData>()
//

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.test_infinity_recycle,parent,false)
        return ViewHolder(view)
    }


    override fun getItemCount(): Int = datas.size

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        holder.bind(datas[position])
    }

    inner class ViewHolder(view: View) : RecyclerView.ViewHolder(view) {

        private val txtName: TextView = itemView.findViewById(R.id.tv_rv_name)
        private val txtAge: TextView = itemView.findViewById(R.id.tv_rv_age)
        private val imgProfile: ImageView = itemView.findViewById(R.id.img_rv_photo)

        fun bind(item: ProfileData) {
            txtName.text = item.name
            txtAge.text = item.age.toString()
            //글라이드 안드로이드에서 이미지를 빠르고 효율적으로 불러올수 있는 라이브러리
            //gradle 추가하모
            Glide.with(itemView).load(item.img).into(imgProfile)

        }
    }

}
data class ProfileData (
    val name : String,
    val age : Int,
    val img : Int
)