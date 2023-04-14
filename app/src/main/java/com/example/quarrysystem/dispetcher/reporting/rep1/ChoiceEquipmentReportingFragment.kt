package com.example.quarrysystem.dispetcher.reporting.rep1

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quarrysystem.R
import com.example.quarrysystem.databinding.FragmentChoiceEquipmentReportingBinding
import com.example.quarrysystem.databinding.FragmentChoiceReportingBinding

class ChoiceEquipmentReportingFragment : Fragment() {

    private var _binding: FragmentChoiceEquipmentReportingBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChoiceEquipmentReportingBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.loading1.setOnClickListener {
            findNavController().navigate(R.id.action_choiceEquipmentReportingFragment_to_reportingEquipment1Fragment)
        }

        binding.drive1.setOnClickListener {
            findNavController().navigate(R.id.action_choiceEquipmentReportingFragment_to_reportingCar1Fragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}