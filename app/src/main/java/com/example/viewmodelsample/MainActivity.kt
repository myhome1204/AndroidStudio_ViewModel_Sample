package com.example.viewmodelsample

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding : ActivityMainBinding
    private lateinit var viewModel: Example_viewmodel
    private lateinit var firstFragment : First_fragment
    private lateinit var secondFragment: Second_fragment
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
        viewModel = ViewModelProvider(this,ViewModelProvider.NewInstanceFactory()).get(Example_viewmodel::class.java)
        firstFragment = First_fragment()
        secondFragment = Second_fragment()
        supportFragmentManager.beginTransaction()
            .add(binding.fragment1.id,firstFragment)
            .commit()
        supportFragmentManager.beginTransaction()
            .add(binding.fragment2.id,secondFragment)
            .commit()
        binding.value.text = viewModel.get_value().toString()
        binding.add.setOnClickListener {
            viewModel.add()
            binding.value.text = viewModel.get_value().toString()
        }
    }
}