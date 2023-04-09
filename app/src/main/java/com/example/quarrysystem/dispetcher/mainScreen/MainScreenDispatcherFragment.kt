package com.example.quarrysystem.dispetcher.mainScreen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.FragmentManager
import androidx.navigation.NavController
import androidx.navigation.fragment.findNavController
import androidx.navigation.ui.setupWithNavController
import com.example.quarrysystem.R
import com.example.quarrysystem.databinding.FragmentMainScreenDispetcherBinding
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarItemView
import com.google.android.material.navigation.NavigationBarView
import com.google.android.material.navigation.NavigationView

class MainScreenDispatcherFragment : Fragment() {

    private var _binding: FragmentMainScreenDispetcherBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentMainScreenDispetcherBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.tasks.setOnClickListener {
            findNavController().navigate(R.id.action_mainScreenDispetcherFragment_to_tasksDispetcherFragment)
        }

        binding.application.setOnClickListener {
            findNavController().navigate(R.id.action_mainScreenDispetcherFragment_to_applicationDispetcherFragment)
        }

        binding.monitoring.setOnClickListener {
            findNavController().navigate(R.id.action_mainScreenDispetcherFragment_to_monitoringDispetcherFragment)
        }

        binding.reporting.setOnClickListener {
            findNavController().navigate(R.id.action_mainScreenDispetcherFragment_to_reportingDispetcherFragment)
        }


         // val bottomNavigationView = view.findViewById<NavigationBarView>(R.id.navigation_rail)
        /*bottomNavigationView.setOnItemReselectedListener { item ->
            when(item.itemId) {
                R.id.tasks -> {
                    findNavController().navigate(R.id.action_mainScreenDispetcherFragment_to_applicationDispetcherFragment)
                    true
                }
                R.id.application -> {
                    findNavController().navigate(R.id.action_mainScreenDispetcherFragment_to_applicationDispetcherFragment)
                    true
                }
                else -> false
            }
        }*/
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}