package com.freeslothub.android.main

import android.view.LayoutInflater
import android.view.ViewGroup
import coil.load
import androidx.recyclerview.widget.RecyclerView
import com.freeslothub.android.databinding.ListItemCasinoBinding


class SlotAdapter(private val slotList: List<Slot>) : RecyclerView.Adapter<SlotAdapter.SlotHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int) = SlotHolder(
        ListItemCasinoBinding.inflate(LayoutInflater.from(parent.context), parent, false)
    )

    override fun onBindViewHolder(holder: SlotHolder, position: Int) {
        holder.bind(slotList[position])
    }

    override fun getItemCount() = slotList.size


    inner class SlotHolder(private val binding: ListItemCasinoBinding) : RecyclerView.ViewHolder(
        binding.root
    ) {

        fun bind(slots: Slot) {
            binding.imageView2.load(slots.imageUrl)
        }

    }

}