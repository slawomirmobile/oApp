package com.example.oapp.intro

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.example.oapp.R
import com.example.oapp.intro.screen.DaysLength
import com.example.oapp.intro.screen.LastPeriodFragment
import com.example.oapp.intro.screen.PeriodLength
import kotlinx.android.synthetic.main.fragment_view_pager.view.*


class ViewPagerFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_view_pager, container, false)

//        Create list of fragments who view in viewpager
            val fragmentlist = arrayListOf<Fragment>(
                PeriodLength(),
                DaysLength(),
                LastPeriodFragment()

            )


        val adapter = ViewPagerAdapter (
            fragmentlist, requireActivity().supportFragmentManager, lifecycle
        )

        view.viewPager.adapter = adapter

        return view


    }



}