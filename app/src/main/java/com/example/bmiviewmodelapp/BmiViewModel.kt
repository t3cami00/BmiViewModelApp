package com.example.bmiviewmodelapp

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.lifecycle.ViewModel

class BmiViewModel : ViewModel() {

    var weightInput by mutableStateOf("")


    var heightInput by mutableStateOf("")


    val bmi: Float
        get() {
            val weight = weightInput.toFloatOrNull() ?: 0f
            val height = heightInput.toFloatOrNull() ?: 0f
            return if (height > 0) weight / (height * height) else 0f
        }
}