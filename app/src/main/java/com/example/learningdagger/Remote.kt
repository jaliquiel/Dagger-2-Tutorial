package com.example.learningdagger

import android.util.Log
import javax.inject.Inject

class Remote @Inject constructor(){

    fun setListener(car: Car) =
        Log.d(TAG, "Remote Connected")

    companion object {
        const val TAG = "Remote"
    }
}