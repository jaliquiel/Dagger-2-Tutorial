package com.example.learningdagger.dagger

import com.example.learningdagger.car.Engine
import com.example.learningdagger.car.PetrolEngine
import dagger.Binds
import dagger.Module

@Module
abstract class PetrolEngineModule {
    @Binds
    abstract fun provideEngine(engine: PetrolEngine): Engine
}

//@Module
//class PetrolEngineModule {
//    // this petrol engine engine is being constructor injected, therefore we can pass it as an argument
//    @Provides
//    fun provideEngine(engine: PetrolEngine): Engine =
//        engine
//}
