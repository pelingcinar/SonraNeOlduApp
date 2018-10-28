package com.pelingulcinar.sonraneolduapp.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentStatePagerAdapter
import com.pelingulcinar.sonraneolduapp.data.NewsDTO
import com.pelingulcinar.sonraneolduapp.fragments.MainFragment

class MainViewPagerAdapter (fragmentManager : FragmentManager, private val news : ArrayList<NewsDTO>)
    : FragmentStatePagerAdapter(fragmentManager) {

    override fun getItem(position: Int): Fragment {
        return MainFragment.newInstance(news[position])
    }

    override fun getCount(): Int {
        return news.size
    }
}