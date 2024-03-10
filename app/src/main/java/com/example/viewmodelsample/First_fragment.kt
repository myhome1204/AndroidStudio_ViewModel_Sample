package com.example.viewmodelsample

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.viewmodelsample.databinding.FirstFragmentBinding

class First_fragment : Fragment() {
    private lateinit var binding: FirstFragmentBinding
    private lateinit var viewModel : Example_viewmodel
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        binding = FirstFragmentBinding.inflate(layoutInflater)
        viewModel = ViewModelProvider(requireActivity()).get(Example_viewmodel::class.java)
        return binding.root
    }
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.first.text = viewModel.get_value().toString()
        binding.btn.setOnClickListener {
            binding.first.text = viewModel.get_value().toString()
        }
    }

}