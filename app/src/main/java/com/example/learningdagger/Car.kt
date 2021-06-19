package com.example.learningdagger

import android.util.Log
import javax.inject.Inject

class Car @Inject constructor(private val engine: Engine, private val wheels: Wheels) {

    fun drive() {
        Log.d(Car.Companion.TAG, "driving...")
    }

    @Inject
    fun enableRemote(remote: Remote) =
        remote.setListener(this)

    companion object {
        private const val TAG = "Car"
    }
}
