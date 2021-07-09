package com.hllbr.landmarknamekotlin

import android.content.Intent
import android.graphics.Bitmap
import android.graphics.BitmapFactory
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.AdapterView
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_main.*
//var selectedGlobalBitmap : Bitmap? = null
class MainActivity : AppCompatActivity() {
    var arrayList = ArrayList<String>()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        arrayList.add("Pisa")
        arrayList.add("Effiel")
        arrayList.add("Coleseum")
        arrayList.add("london Bridge")
        arrayList.add("statue of Liberty")
        //Image
       /* val pisa = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.pisa)
        val Effiel = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.eiffel)
        val Colessum = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.colesseum)
        val london_Bridge = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.london)
        val liberty = BitmapFactory.decodeResource(applicationContext.resources,R.drawable.firedom)

        var landmarkImage = ArrayList<Bitmap>()
        landmarkImage.add(pisa)
        landmarkImage.add(Effiel)
        landmarkImage.add(Colessum)
        landmarkImage.add(london_Bridge)
        landmarkImage.add(liberty)*/


        //Image-Efficient =
        val pisaId = R.drawable.pisa
        val effielId = R.drawable.eiffel
        val colesseumId = R.drawable.colesseum
        val londonId = R.drawable.london
        val libertyId = R.drawable.firedom

        var landmarkIds = ArrayList<Int>()
        landmarkIds.add(pisaId)
        landmarkIds.add(effielId)
        landmarkIds.add(colesseumId)
        landmarkIds.add(londonId)
        landmarkIds.add(libertyId)



        //Adapter : Layout && Data

        //val adapter = ArrayAdapter(this,android.R.layout.simple_expandable_list_item_1,arrayList)
        val adapter = ArrayAdapter(this,R.layout.list_row,R.id.textView2,arrayList)

        listView.adapter = adapter

        listView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
        val intent = Intent(applicationContext,DetailsActivity::class.java)

        intent.putExtra("name",arrayList[position])

        //selectedGlobalBitmap = landmarkImage[position]
            /*
        val singleton = Singleton.Selected
       singleton.SelectedImage = landmarkImage[position]

       bu işlem tam olarak Singleton değil tam olarak Static'te değil
        */
        intent.putExtra("image",landmarkIds[position])
       startActivity(intent)
    }

    }
}