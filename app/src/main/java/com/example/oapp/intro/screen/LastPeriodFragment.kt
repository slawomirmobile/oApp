package com.example.oapp.intro.screen

import android.app.DatePickerDialog
import android.content.Context
import android.os.Bundle
import android.provider.ContactsContract
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.CalendarView
import android.widget.DatePicker
import android.widget.Toast
import androidx.navigation.fragment.findNavController
import androidx.viewpager2.widget.ViewPager2
import com.example.oapp.R
import kotlinx.android.synthetic.main.fragment_last_period.*
import kotlinx.android.synthetic.main.fragment_last_period.view.*
import kotlinx.android.synthetic.main.fragment_period_length.view.*
import java.util.*

class LastPeriodFragment : Fragment(), DatePickerDialog.OnDateSetListener {


    var day = 0
    var month = 0
    var year = 0

    var savedDay = 0
    var savedMonth = 0
    var savedYear = 0


    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_last_period, container, false)

        val viewPager = activity?.findViewById<ViewPager2>(R.id.viewPager)

        view.txt_finish.setOnClickListener {
            findNavController().navigate(R.id.action_viewPagerFragment_to_homeFragment)
        }


        view.btn_selected_data.setOnClickListener {
            val cal = Calendar.getInstance()
            day = cal.get(Calendar.DAY_OF_MONTH)
            month = cal.get(Calendar.MONTH)
            year = cal.get(Calendar.YEAR)

            DatePickerDialog(requireContext(), this, year, month, day).show()

        }



        return view

    }

    override fun onDateSet(p0: DatePicker?, year: Int, month: Int, day: Int) {
        savedDay = day
        savedMonth = month
        savedYear = year

        selectedData.text = "Twój ostatni okres to: $savedDay - $savedMonth - $savedYear"

    }


}









