package com.phis.fragmenttest_20200608

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setValues()
    abstract fun setEvents()
}