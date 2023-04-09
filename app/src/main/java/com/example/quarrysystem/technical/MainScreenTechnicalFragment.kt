package com.example.quarrysystem.technical

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quarrysystem.R
import com.example.quarrysystem.databinding.FragmentMainScreenDispetcherBinding
import com.example.quarrysystem.databinding.FragmentMainScreenTechnicalBinding

class MainScreenTechnicalFragment : Fragment() {

    private var _binding: FragmentMainScreenTechnicalBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainScreenTechnicalBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.button.setOnClickListener {
            findNavController().navigate(R.id.action_mainScreenTechnicalFragment_to_equipmentFragment)
        }

        binding.button2.setOnClickListener {
            findNavController().navigate(R.id.action_mainScreenTechnicalFragment_to_loadingLocationFragment)
        }

        binding.button3.setOnClickListener {
            findNavController().navigate(R.id.action_mainScreenTechnicalFragment_to_unloadingLocationFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}