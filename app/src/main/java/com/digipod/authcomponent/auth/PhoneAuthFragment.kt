package com.digipod.authcomponent.auth

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.digipod.authcomponent.R
import com.digipod.authcomponent.databinding.FragmentAuthLaucherBinding
import com.digipod.authcomponent.databinding.FragmentPhoneAuthBinding


class PhoneAuthFragment : Fragment() {

    private var _binding: FragmentPhoneAuthBinding? = null
    private val binding get() = _binding!!
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentPhoneAuthBinding.inflate(inflater, container, false)
        return binding.root
    }

    companion object {

    }
}