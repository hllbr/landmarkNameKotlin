package com.hllbr.landmarknamekotlin

import android.graphics.Bitmap

class Singleton {
    /*
   Tek bir objesi(instance) olan sınıf demektir.
    */
    companion object Selected{
        var SelectedImage : Bitmap? = null
    }
}