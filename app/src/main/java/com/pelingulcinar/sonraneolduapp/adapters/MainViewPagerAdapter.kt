package com.pelingulcinar.sonraneolduapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter

class MainViewPagerAdapter (fm:FragmentManager, val fragmentlist :List<Fragment>) : FragmentStatePagerAdapter(fm) {

    override fun getItem(position: Int): Fragment {
        return fragmentlist[position]
    }

    override fun getCount(): Int {
        return fragmentlist.size
    }
}