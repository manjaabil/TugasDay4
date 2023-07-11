package com.example.tablayoutviewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm, BEHAVIOR_RESUME_ONLY_CURRENT_FRAGMENT) {

    private val listOfFragment = arrayListOf(FirstFragment(), SecondFragment())

    override fun getCount(): Int {
        return listOfFragment.size
    }

    override fun getItem(position: Int): Fragment {
        return when(position) {
            0 -> listOfFragment[position]
            else -> listOfFragment[position]
        }
    }

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position) {
            0 -> "User A"
            else -> "User B"
        }
    }
}