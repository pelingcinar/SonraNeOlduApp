package com.pelingulcinar.sonraneolduapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import com.pelingulcinar.sonraneolduapp.R
import com.pelingulcinar.sonraneolduapp.adapters.MainViewPagerAdapter
import com.pelingulcinar.sonraneolduapp.fragments.MainFragment
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    lateinit var fragmentList :ArrayList<Fragment>
    lateinit var fragmentAdapter : MainViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fragmentList = ArrayList<Fragment>()
        fragmentList.add(MainFragment.newInstance())
        fragmentList.add(MainFragment.newInstance())
        fragmentList.add(MainFragment.newInstance())
        fragmentList.add(MainFragment.newInstance())
        fragmentList.add(MainFragment.newInstance())

        viewPager = findViewById(R.id.viewpager_main)
        fragmentAdapter = MainViewPagerAdapter(supportFragmentManager,fragmentList)
        viewpager_main.adapter = fragmentAdapter

        tabs_main.setupWithViewPager(viewpager_main)
    }
}
