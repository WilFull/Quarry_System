package com.example.quarrysystem.dispetcher.reporting

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quarrysystem.R
import com.example.quarrysystem.databinding.FragmentChoiceEquipmentMonitoringBinding
import com.example.quarrysystem.databinding.FragmentChoiceReportingBinding

class ChoiceReportingFragment : Fragment() {

    private var _binding: FragmentChoiceReportingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChoiceReportingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.reporting1.setOnClickListener {
            findNavController().navigate(R.id.action_choiceReportingFragment_to_choiceEquipmentReportingFragment)
        }

        binding.reporting2.setOnClickListener {
            findNavController().navigate(R.id.action_choiceReportingFragment_to_reportingTableFragment)
        }

        binding.reporting3.setOnClickListener {
            findNavController().navigate(R.id.action_choiceReportingFragment_to_reportTableSumFragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}