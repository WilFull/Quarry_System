package com.example.quarrysystem

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quarrysystem.databinding.FragmentLoginCareerBinding
import com.example.quarrysystem.databinding.FragmentLoginOfficeBinding

class LoginOfficeFragment : Fragment() {

    private var _binding: FragmentLoginOfficeBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginOfficeBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonBackToAuthorization.setOnClickListener {
            findNavController().navigate(R.id.action_loginOfficeFragment_to_authorizationFragment)
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}