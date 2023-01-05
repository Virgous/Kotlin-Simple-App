package com.example.simple.di

import com.example.simple.repository.model.Engine
import com.example.simple.repository.model.GasolineEngine
import dagger.Binds
import dagger.Module

@Module
abstract class EngineModule {
    @Binds
    abstract fun bindsGasolineEngine(gasolineEngine: GasolineEngine):Engine
}