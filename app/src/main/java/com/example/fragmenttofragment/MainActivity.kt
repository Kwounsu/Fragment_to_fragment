package com.example.fragmenttofragment

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), SendFragment.GetData {

    lateinit var text : String
    lateinit var receiveFragment : ReceiveFragment

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        receiveFragment = fragment_receive as ReceiveFragment
        loadFragment()
    }

    private fun loadFragment() {
        val fragmentTransaction = supportFragmentManager.beginTransaction()
        val sendFragment = SendFragment()
        sendFragment.getData = this
        fragmentTransaction.add(R.id.fragment_send, sendFragment)
        fragmentTransaction.commit()
    }

    override fun dataDetail(text: String) {
        receiveFragment.dataDetail(text)
        this.text = text
    }
}
