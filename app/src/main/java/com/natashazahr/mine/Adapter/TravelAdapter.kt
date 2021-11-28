package com.natashazahr.mine.Adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.natashazahr.mine.Model.Location

class TravelAdapter(private val listLocation : ArrayList<Location>) : RecyclerView.Adapter<TravelAdapter.TravelViewHolder>(){
//    fingsi inner class karna class ga boleh dlm class jadi class foodviewholdernya bakal jadi sub class

    inner class TravelViewHolder(val binding: ItemImageBinding) : RecyclerView.ViewHolder(binding.root)

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TravelAdapter.TravelViewHolder {
        //inflate buat nempel layout
        val binding = ItemImageBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return TravelViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TravelAdapter.TravelViewHolder, position: Int) {
        //gabungin layoutnya sama datanya
        // fungsi position untuk nge get data mana yg diurutin secara berurutan dan sesuai
        //kalo ga pake[position] dipake biar layoutnya gak random posisinya
        with(holder){
            with(listLocation[position]){
                Glide.with(holder.itemView.context).load(pictures).into(binding.ivPanorama)
                binding.tvItemNameRecipe.text = name
                binding.tvItemMenu.text = category
                binding.tvNumberRecipe.text = number

                val mContext = holder.itemView.context
                //kalo di klik ngasih respon buat pindah halaman dgn bawa bbrp data
                holder.itemView.setOnClickListener{
                    val dataSend = Location(
                        name = listLocation[position].name,
                        category = listLocation[position].category,
                        description = listLocation[position].description,
                        pictures = listLocation[position].pictures,

                    )
                    //intent = kang paket
                    val intentToDetail = Intent(mContext, DetailActivity::class.java)
                    intentToDetail.putExtra(DetailActivity.RECIPE_DATA, dataSend)
                    mContext.startActivity(intentToDetail)
                }
            }
        }
    }

    override fun getItemCount(): Int=listLocation .size

}