package com.example.viewmodelsample

import android.content.res.Configuration
import android.os.Bundle
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelsample.databinding.SecondFragmentBinding

class Second_fragment : Fragment() {
    private lateinit var binding: SecondFragmentBinding
    private lateinit var viewModel : Example_viewmodel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = SecondFragmentBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(requireActivity()).get(Example_viewmodel::class.java)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.second.text = viewModel.get_value().toString()
        binding.btn.setOnClickListener {
            binding.second.text = viewModel.get_value().toString()
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        Log.d("testt","asdas")
        binding.second.text = ""
    }
}