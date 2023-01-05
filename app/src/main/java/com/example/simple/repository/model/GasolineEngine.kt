package com.example.simple.repository.model

import javax.inject.Inject

class GasolineEngine @Inject constructor() : Engine{
    override val engineName = "Gasoline Engine"
    override fun startEngine() = "$engineName started"
    override fun stopEngine() = "$engineName stopped"
}