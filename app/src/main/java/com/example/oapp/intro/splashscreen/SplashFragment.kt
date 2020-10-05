package com.example.oapp.intro.splashscreen

import android.os.Bundle
import android.os.Handler
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.core.os.HandlerCompat.postDelayed
import androidx.core.os.postDelayed
import androidx.navigation.fragment.findNavController
import com.example.oapp.R


class SplashFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Handler().postDelayed({findNavController().navigate(R.id.action_splashFragment_to_viewPagerFragment)}, 2000)

        return inflater.inflate(R.layout.fragment_splash, container, false)
    }


    }



