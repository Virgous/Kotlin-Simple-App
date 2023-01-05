package com.example.simple

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.example.simple.di.DaggerVehicleComponent
import com.example.simple.repository.model.Car

class MainActivity : AppCompatActivity() {
    private lateinit var myCar : Car
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        myCar = DaggerVehicleComponent.create().car()
        myCar.run()
        myCar.parking()
    }
}