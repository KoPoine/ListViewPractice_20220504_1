package com.neppplus.listviewpractice_20220504_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_detail_profile.*

class DetailProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_profile)
        val name = intent.getStringExtra("name")
        val birthYear = intent.getIntExtra("birthYear", 0)
        val age = 2022 - birthYear + 1
        val address = intent.getStringExtra("address")

        nameTxt.text = name
        ageTxt.text = "(${age}세)"
        addressTxt.text = address
    }
}