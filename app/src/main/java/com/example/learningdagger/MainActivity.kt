package com.example.learningdagger

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.example.learningdagger.car.Car
import com.example.learningdagger.dagger.CarComponent
import com.example.learningdagger.dagger.DaggerCarComponent
import javax.inject.Inject

class MainActivity : AppCompatActivity() {

    @Inject
    lateinit var car: Car

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val component: CarComponent = DaggerCarComponent.create()
        component.inject(this)

        car.drive()
    }
}
