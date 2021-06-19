package com.example.learningdagger.car

import android.util.Log
import javax.inject.Inject

class PetrolEngine @Inject constructor() : Engine {

    override fun start() {
        Log.d(TAG, "Petrol engine started")
    }

    companion object {
        private const val TAG = "Car"
    }
}