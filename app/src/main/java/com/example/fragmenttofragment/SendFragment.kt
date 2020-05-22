package com.example.fragmenttofragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import androidx.fragment.app.Fragment

class SendFragment : Fragment() {

    interface GetData {
        fun dataDetail (text : String)
    }

    lateinit var getData : GetData
    lateinit var edtSend : EditText
    lateinit var btnSend : Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_send, container, false)
        edtSend = view.findViewById(R.id.edt_send)
        btnSend = view.findViewById(R.id.btn_send)
        btnSend.setOnClickListener ( View.OnClickListener{
            getData.dataDetail(edtSend.text.toString())
        })
        return view
    }
}
