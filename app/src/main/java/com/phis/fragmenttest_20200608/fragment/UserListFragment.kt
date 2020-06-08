package com.phis.fragmenttest_20200608.fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import com.phis.fragmenttest_20200608.BaseFragment
import com.phis.fragmenttest_20200608.R
import com.phis.fragmenttest_20200608.adapters.MyUserAdapter
import com.phis.fragmenttest_20200608.datas.User
import kotlinx.android.synthetic.main.fragment_student_list.*

class UserListFragment : BaseFragment(){

    val listUser = ArrayList<User>()
    lateinit var myAdapter : MyUserAdapter



    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_student_list, container, false)
    }

    //실제로 액티비티가 만들어지고 동작해야하는것들을 기술한다. 
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setValues()
        setEvents()
    }

    override fun setValues() {

        listUser.add(User("조경진", 1988, true))
        listUser.add(User("김미영", 2010, false))
        listUser.add(User("김성우", 1982, true))
        listUser.add(User("김형근", 1989, true))
        listUser.add(User("이용희", 1992, true))
        listUser.add(User("이지수", 1984, false))

        myAdapter = MyUserAdapter(mContext, R.layout.listview_user, listUser)
        listViewStudents.adapter = myAdapter

    }

    override fun setEvents() {

    }

}