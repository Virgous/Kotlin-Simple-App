package com.example.simple.repository.model

interface Engine {
    val engineName: String
    fun startEngine(): String
    fun stopEngine():String
}