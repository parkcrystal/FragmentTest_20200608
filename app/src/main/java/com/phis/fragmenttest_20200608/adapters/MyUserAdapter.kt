package com.phis.fragmenttest_20200608.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.phis.fragmenttest_20200608.R
import com.phis.fragmenttest_20200608.datas.User

class MyUserAdapter(context: Context, resId: Int, list: List<User>) :
    ArrayAdapter<User>(context, resId, list) {

    val mContext = context
    val mList = list
    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        tempRow?.let{

        }.let{
            tempRow = inf.inflate(R.layout.listview_user, null)
        }

        val row = tempRow!!

        val tvNameAgeGender = row.findViewById<TextView>(R.id.tvNameAgeGender)



        val user = mList.get(position)
        tvNameAgeGender.text = "${user.name}, (${user.getAge()}세), ${user.getGender()}"
        return row
    }


}