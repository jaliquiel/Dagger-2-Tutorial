package com.example.learningdagger.dagger

import com.example.learningdagger.car.DieselEngine
import com.example.learningdagger.car.Engine
import dagger.Binds
import dagger.Module

@Module
abstract class DieselEngineModule {
    @Binds
    abstract fun provideEngine(engine: DieselEngine): Engine
}
