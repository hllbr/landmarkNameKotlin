package com.hllbr.landmarknamekotlin

import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_details.*

class DetailsActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_details)

        val intent = intent
        val landmarkName = intent.getStringExtra("name")
        textView.text = landmarkName
        //imageView.setImageBitmap(selectedGlobalBitmap)
        /*
        val singleton = Singleton.Selected
        val selectedBitmap = singleton.SelectedImage
        imageView.setImageBitmap(selectedBitmap)*/
        val landmarkImageId = intent.getIntExtra("image",0)
        val selectedBitmap = BitmapFactory.decodeResource(application.resources,landmarkImageId)
        imageView.setImageBitmap(selectedBitmap)
    }
}