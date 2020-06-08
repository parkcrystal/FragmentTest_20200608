package com.phis.fragmenttest_20200608.datas

import java.util.*

class User(val name:String, val birth:Int, val gender:Boolean) {

    fun getAge() : Int{
        return Calendar.getInstance().get(Calendar.YEAR) - birth+1
    }

    fun getGender() : String{
        when(gender){
            true -> return "남자"
            else -> return "여자"
        }
    }
}