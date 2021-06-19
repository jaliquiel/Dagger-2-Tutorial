package com.example.learningdagger.car

import android.util.Log
import javax.inject.Inject

class DieselEngine @Inject constructor() : Engine {

    override fun start() {
        Log.d(TAG, "Diesel engine started")
    }

    companion object {
        private const val TAG = "Car"
    }
}