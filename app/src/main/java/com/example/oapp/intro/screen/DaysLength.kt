package com.example.oapp.intro.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager2.widget.ViewPager2
import com.example.oapp.R
import kotlinx.android.synthetic.main.fragment_days_length.view.*
import kotlinx.android.synthetic.main.fragment_period_length.*
import kotlinx.android.synthetic.main.fragment_period_length.view.*


class DaysLength : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_days_length, container, false)


        view.number_days_period.minValue = 1
        view.number_days_period.maxValue = 7

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.next_days_txt.setOnClickListener {
            viewPager?.currentItem = 2
        }



        return view
    }


    }
