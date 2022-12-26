package com.freeslothub.android

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.navArgs
import com.freeslothub.android.databinding.FragmentWebBinding

class WebFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    )= FragmentWebBinding.inflate(inflater, container, false).apply {
        val token = "https://freeslotshub.com/free-slots-no-download/"
        webView.loadUrl(token)
    }.root
}