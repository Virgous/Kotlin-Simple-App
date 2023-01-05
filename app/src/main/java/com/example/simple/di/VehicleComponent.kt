package com.example.simple.di

import com.example.simple.repository.model.Car
import dagger.Component

@Component(modules = [EngineModule::class])
interface VehicleComponent {
    fun car() : Car
}