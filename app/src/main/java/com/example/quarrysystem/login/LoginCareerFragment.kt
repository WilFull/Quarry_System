package com.example.quarrysystem.login

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quarrysystem.R
import com.example.quarrysystem.databinding.FragmentLoginCareerBinding

class LoginCareerFragment : Fragment() {

    private var _binding: FragmentLoginCareerBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentLoginCareerBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.buttonBackToAuthorization.setOnClickListener {
            findNavController().navigate(R.id.action_loginCareerFragment_to_authorizationFragment)
        }

        binding.buttonToMainScreenCareer.setOnClickListener {
            val machinistOrDriver = binding.textInputLayout.editText?.text.toString()

            if (machinistOrDriver == "Машишинст") {
                findNavController().navigate(R.id.action_loginCareerFragment_to_mainScreenCareerFragment)
            }
            else {
                findNavController().navigate(R.id.action_loginCareerFragment_to_mainScreenDriverFragment)
            }
        }

    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}