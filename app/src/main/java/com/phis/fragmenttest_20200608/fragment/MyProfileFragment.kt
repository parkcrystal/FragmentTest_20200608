package com.phis.fragmenttest_20200608.fragment

import android.content.Intent
import android.net.Uri
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.phis.fragmenttest_20200608.BaseFragment
import com.phis.fragmenttest_20200608.R
import kotlinx.android.synthetic.main.fragment_my_profile.*

class MyProfileFragment : BaseFragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_my_profile, container, false)
    }

    //실제로 액티비티가 만들어지고 동작해야하는것들을 기술한다.
    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        setValues()
        setEvents()

    }

    override fun setValues() {

    }

    override fun setEvents() {

        btnDial.setOnClickListener {
//            val phoneNum = edtPhoneNumber.text.toString()
            //${변수} 으로 사용할때, 컴포넌트들의 text를 자동으로 toString() 해서 사용된다.
            val myUri = Uri.parse("tel:${edtPhoneNumber.text}")
            val myIntent = Intent(Intent.ACTION_DIAL, myUri)
            startActivity(myIntent)
        }

    }


}