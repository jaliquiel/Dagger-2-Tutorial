package com.example.learningdagger

import dagger.Component

@Component (
    modules = [WheelsModule::class]
)
interface CarComponent {

    fun getCar(): Car

    fun inject(mainActivity: MainActivity)
}
