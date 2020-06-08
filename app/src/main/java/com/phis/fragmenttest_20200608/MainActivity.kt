package com.phis.fragmenttest_20200608

import android.os.Bundle
import androidx.fragment.app.FragmentPagerAdapter
import com.phis.fragmenttest_20200608.adapters.MyPagerAdapter
import com.phis.fragmenttest_20200608.datas.User
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var myPagerAdapter: FragmentPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setValues()
        setEvents()

    }

    override fun setValues() {
        myPagerAdapter = MyPagerAdapter(supportFragmentManager)
        myViewPager.adapter = myPagerAdapter


        //탭레이아웃과 뷰페이져를 연결
        myTabLayout.setupWithViewPager(myViewPager)
    }

    override fun setEvents() {
    }
}
