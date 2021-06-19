package com.example.learningdagger

import android.util.Log

// we don't own this class, therefore we can't annotate the constructor
class Tires {

    fun inflate() {
        Log.d(TAG, "Tires inflated")
    }

    companion object {
        private const val TAG = "Tires"
    }
}
