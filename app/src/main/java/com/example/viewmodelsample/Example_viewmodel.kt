package com.example.viewmodelsample

import androidx.lifecycle.ViewModel

class Example_viewmodel : ViewModel() {
    private var value : Int = 0
    fun add() : Unit{
        value +=1
    }
    fun get_value():Int{
        return value
    }
}