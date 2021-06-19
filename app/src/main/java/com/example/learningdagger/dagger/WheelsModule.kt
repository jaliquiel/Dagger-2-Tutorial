package com.example.learningdagger.dagger

import com.example.learningdagger.car.Rims
import com.example.learningdagger.car.Tires
import com.example.learningdagger.car.Wheels
import dagger.Module
import dagger.Provides

@Module
class WheelsModule {

    @Provides
    fun provideRims(): Rims = Rims()

    @Provides
    fun provideTires(): Tires {
        val tires = Tires()
        tires.inflate()
        return tires
    }

    // this method's tires will be inflated
    // can also do additional setup here, all that matters is return type
    @Provides
    fun provideWheels(rims: Rims, tires: Tires) =
        Wheels(rims, tires)


}