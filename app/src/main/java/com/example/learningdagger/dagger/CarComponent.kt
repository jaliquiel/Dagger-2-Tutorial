package com.example.learningdagger.dagger

import com.example.learningdagger.MainActivity
import com.example.learningdagger.car.Car
import dagger.Component

@Component (
    modules = [WheelsModule::class, DieselEngineModule::class]
)
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}
