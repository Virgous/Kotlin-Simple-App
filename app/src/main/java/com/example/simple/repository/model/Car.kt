package com.example.simple.repository.model

import android.util.Log
import javax.inject.Inject

data class Car @Inject constructor(private val engine:Engine){
    fun run(){
        Log.d("CarDI", "run: ${engine.startEngine()}")
    }

    fun parking(){
        Log.d("CarDI", "run: ${engine.stopEngine()}")
    }
}