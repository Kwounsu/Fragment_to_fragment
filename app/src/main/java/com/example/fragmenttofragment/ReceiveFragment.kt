package com.example.fragmenttofragment

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.EditText
import android.widget.TextView

class ReceiveFragment : Fragment() {

    lateinit var txtReceive : TextView

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_receive, container, false)

        txtReceive = view.findViewById(R.id.txt_receive)

        return view
    }

    fun dataDetail(text:String) {
        txtReceive.text = text
    }
}
