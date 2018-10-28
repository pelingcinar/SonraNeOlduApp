package com.pelingulcinar.sonraneolduapp.activities

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager.widget.ViewPager
import com.pelingulcinar.sonraneolduapp.R
import com.pelingulcinar.sonraneolduapp.adapters.MainViewPagerAdapter
import com.pelingulcinar.sonraneolduapp.data.NewsDTO
import kotlinx.android.synthetic.main.activity_main.*


class MainActivity : AppCompatActivity() {

    private lateinit var viewPager: ViewPager
    val fragmentAdapter = MainViewPagerAdapter(supportFragmentManager, loadFragment())
    private lateinit var news : NewsDTO


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        viewPager = findViewById(R.id.viewpager_main)

        fragmentAdapter.notifyDataSetChanged()
        viewpager_main.adapter = fragmentAdapter



    }

    companion object {
        private fun loadFragment() : ArrayList<NewsDTO> {

            val news = ArrayList<NewsDTO>()

            news.add(NewsDTO("asd","asdok","xcolkza","zcxplkasd"))
            news.add(NewsDTO("eqw","asdpok","qweop","qowerkrqepwo"))
            news.add(NewsDTO("zxc","qwelli","41345","qweasd"))
            news.add(NewsDTO("asdsad","qweqweasd","wqeeqwads","qweads"))
            news.add(NewsDTO("qewwqewq","qewads","asdasd","qwewqaads"))
            news.add(NewsDTO("qwewqeewqewqwq","dasqwe","xzczxc","asdassa"))
            news.add(NewsDTO("adsasdads","vcxfgds","dsfsdf","qwewqe"))

            return news
        }
    }
}
