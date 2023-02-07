package com.digipod.authcomponent.auth

import android.content.Intent
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.navigation.fragment.findNavController
import com.digipod.authcomponent.MainActivity
import com.digipod.authcomponent.R
import com.digipod.authcomponent.databinding.FragmentAuthLaucherBinding
import com.digipod.authcomponent.databinding.FragmentFirstBinding
import com.google.firebase.auth.FirebaseAuth
import com.google.firebase.auth.ktx.auth
import com.google.firebase.ktx.Firebase

class AuthLaucherFragment : Fragment() {

    private var _binding: FragmentAuthLaucherBinding? = null
    private val binding get() = _binding!!
    private lateinit var auth: FirebaseAuth

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        auth = Firebase.auth
    }

    override fun onResume() {
        super.onResume()
        if(auth.currentUser!=null){
            startActivity(Intent(activity, MainActivity::class.java))
            activity?.finish()
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentAuthLaucherBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        binding.apply {
            btnEmail.setOnClickListener {
                findNavController().navigate(R.id.action_authLaucherFragment_to_EPLoginFragment)
            }
            btnPhone.setOnClickListener {
                findNavController().navigate(R.id.action_authLaucherFragment_to_phoneAuthFragment)
            }
            btnGoogleLogin.setOnClickListener {
                findNavController().navigate(R.id.action_authLaucherFragment_to_googleLoginFragment)
            }
        }

    }

    companion object {
    }
}