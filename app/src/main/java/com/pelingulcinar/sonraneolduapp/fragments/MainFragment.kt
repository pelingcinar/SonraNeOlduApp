package com.pelingulcinar.sonraneolduapp.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.pelingulcinar.sonraneolduapp.R
import com.pelingulcinar.sonraneolduapp.adapters.MainRecyclerAdapter
import com.pelingulcinar.sonraneolduapp.network.RetrofitClient
import com.pelingulcinar.sonraneolduapp.network.StoriesService
import com.pelingulcinar.sonraneolduapp.network.response.StoriesByIdResponse
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

open class MainFragment : Fragment() {

    companion object {

        fun newInstance(): Fragment {

            return MainFragment()
        }
    }

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {


        return inflater.inflate(R.layout.main_fragment, container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        val recyclerView = view?.findViewById<RecyclerView>(R.id.recyclerview_main)
        recyclerView?.layoutManager = LinearLayoutManager(this.context, RecyclerView.VERTICAL, false)

//        val feed = ArrayList<NewsDTO>()
//
//        feed.add(NewsDTO("UserName1", "https://avatars.githubusercontent.com/u/66577?v=3", "haber","Blabla"))
//        feed.add(NewsDTO("UserName2", "https://avatars.githubusercontent.com/u/66577?v=3", "haber","Blabla"))
//        feed.add(NewsDTO("UserName3", "https://avatars.githubusercontent.com/u/66577?v=3", "haber","Blabla"))
//        feed.add(NewsDTO("UserName4", "https://avatars.githubusercontent.com/u/66577?v=3", "haber","Blabla"))
//        feed.add(NewsDTO("UserName5", "https://avatars.githubusercontent.com/u/66577?v=3", "haber","Blabla"))

        RetrofitClient.getClient().create(StoriesService::class.java).getStoriesById("1").enqueue(object : Callback<StoriesByIdResponse> {
            override fun onFailure(call: Call<StoriesByIdResponse>, t: Throwable) {

                Toast.makeText(activity, "failed", Toast.LENGTH_SHORT).show()
            }

            override fun onResponse(call: Call<StoriesByIdResponse>, response: Response<StoriesByIdResponse>) {
                val adapter = MainRecyclerAdapter(response.body()?.data!!)

                recyclerView?.adapter = adapter
            }

        })
    }

}