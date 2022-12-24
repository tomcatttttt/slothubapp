package com.freeslothub.android.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.LinearLayoutManager
import com.freeslothub.android.databinding.FragmentMainBinding

class MainFragment : Fragment() {

    private var binding: FragmentMainBinding? = null
    private val viewModel: MainViewModel by viewModels()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    )= FragmentMainBinding.inflate(inflater, container, false).apply {
        val slotAdapter = SlotAdapter(viewModel.slotList)


        binding.apply {
            rcView.apply {
                layoutManager = LinearLayoutManager(context)
                adapter = slotAdapter

            }
        }
    }.root

    override fun onDestroyView() {
        super.onDestroyView()
        binding = null
    }


    companion object {
        fun newInstance() = MainFragment()
    }
}