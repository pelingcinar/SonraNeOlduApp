package com.pelingulcinar.sonraneolduapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pelingulcinar.sonraneolduapp.R
import com.pelingulcinar.sonraneolduapp.adapters.MainRecyclerAdapter
import com.pelingulcinar.sonraneolduapp.data.NewsDTO

open class MainFragment : Fragment() {


    private val news by lazy { arguments?.getSerializable("news") as NewsDTO }

    companion object {

        fun newInstance(news: NewsDTO): Fragment {

            val mainFragment = MainFragment()
            val bundle = Bundle()
            bundle.putSerializable("news", news)
            mainFragment?.arguments = bundle

            return mainFragment
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)


        val recyclerView = view.findViewById<RecyclerView>(R.id.recyclerview_main)
        recyclerView.layoutManager = LinearLayoutManager(this.context, RecyclerView.VERTICAL, false)

        val feed = ArrayList<NewsDTO>()

        feed.add(NewsDTO("UserName1", "https://avatars.githubusercontent.com/u/66577?v=3", "haber","Blabla"))
        feed.add(NewsDTO("UserName2", "https://avatars.githubusercontent.com/u/66577?v=3", "haber","Blabla"))
        feed.add(NewsDTO("UserName3", "https://avatars.githubusercontent.com/u/66577?v=3", "haber","Blabla"))
        feed.add(NewsDTO("UserName4", "https://avatars.githubusercontent.com/u/66577?v=3", "haber","Blabla"))
        feed.add(NewsDTO("UserName5", "https://avatars.githubusercontent.com/u/66577?v=3", "haber","Blabla"))

        val adapter = MainRecyclerAdapter(feed)

        recyclerView.adapter = adapter

    }

}