package com.example.oapp.intro.screen

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.example.oapp.R
import kotlinx.android.synthetic.main.fragment_period_length.*
import kotlinx.android.synthetic.main.fragment_period_length.view.*


class PeriodLength : Fragment() {



    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
     val view =  inflater.inflate(R.layout.fragment_period_length, container, false)

      view.number_picker_period?.minValue = 21
        view.number_picker_period?.maxValue = 35
        view.number_picker_period?.wrapSelectorWheel = true

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.next_txt_period.setOnClickListener {
            viewPager?.currentItem = 1
        }






     return view
    }




}