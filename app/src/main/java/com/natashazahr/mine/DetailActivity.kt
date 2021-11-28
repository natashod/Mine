package com.natashazahr.mine

import android.os.Bundle
import android.view.inputmethod.InputBinding
import androidx.appcompat.app.AppCompatActivity
import com.bumptech.glide.Glide
import com.natashazahr.mine.Model.Location

class DetailActivity : AppCompatActivity() {


    private lateinit var detailBinding: ActivityDetailBinding
    override fun onCreate(savedInstanceState: Bundle?){
        detailBinding = ActivityDetailBinding.inflate(layoutInflater)
        setContentView(detailBinding.root)
        showData()
    }



    private fun showData() {
        val getData = intent.getParcelableExtra<Location>(LOCATION_DATA) as Location
        Glide.with(this).load(getData.pictures).into(detailBinding.ivPanorama)
        detailBinding.ivPanorama.text = getData.pictures
        detailBinding.tvDescription.text = getData.description
        detailBinding.tvNameDetail.text = getData.name

    }
    companion object {
        const val LOCATION_DATA = "location_data"
    }






}
