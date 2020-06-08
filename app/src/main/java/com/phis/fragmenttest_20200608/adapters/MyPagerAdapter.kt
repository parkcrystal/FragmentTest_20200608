package com.phis.fragmenttest_20200608.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.phis.fragmenttest_20200608.fragment.MyProfileFragment
import com.phis.fragmenttest_20200608.fragment.UserListFragment

class MyPagerAdapter(fm : FragmentManager) : FragmentPagerAdapter(fm) {

    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){
            0 -> "프로필 화면"
            else -> "수강생 목록"
        }

    }


    override fun getItem(position: Int): Fragment {
        return when(position){
            0 -> MyProfileFragment()
            else ->UserListFragment()
        }
    }

    override fun getCount(): Int {
        return 2
    }


}