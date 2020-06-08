package com.phis.fragmenttest_20200608

import android.content.Context
import android.os.Bundle
import androidx.fragment.app.Fragment

abstract class BaseFragment : Fragment() {

    lateinit var mContext: Context

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        mContext = activity as Context

    }

    abstract fun setValues()
    abstract fun setEvents()
}