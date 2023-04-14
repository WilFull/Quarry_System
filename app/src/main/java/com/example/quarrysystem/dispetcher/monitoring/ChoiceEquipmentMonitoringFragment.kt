package com.example.quarrysystem.dispetcher.monitoring

import android.app.AlertDialog
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.example.quarrysystem.R
import com.example.quarrysystem.databinding.FragmentChoiceEquipmentMonitoringBinding
import com.example.quarrysystem.databinding.FragmentLoginOfficeBinding
import com.google.android.material.dialog.MaterialAlertDialogBuilder

class ChoiceEquipmentMonitoringFragment : Fragment() {

    private var _binding: FragmentChoiceEquipmentMonitoringBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentChoiceEquipmentMonitoringBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        binding.loading1.setOnClickListener {
            findNavController().navigate(R.id.action_choiceEquipmentMonitoringFragment_to_monitoringEqupment1Fragment)
        }

        binding.drive1.setOnClickListener {
            findNavController().navigate(R.id.action_choiceEquipmentMonitoringFragment_to_monitoringCar1Fragment)
        }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}