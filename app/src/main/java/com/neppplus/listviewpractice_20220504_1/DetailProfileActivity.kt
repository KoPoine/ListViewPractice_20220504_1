package com.neppplus.listviewpractice_20220504_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.neppplus.listviewpractice_20220504_1.models.StudentData
import kotlinx.android.synthetic.main.activity_detail_profile.*

class DetailProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_profile)
        val studentData = intent.getSerializableExtra("studentData") as StudentData

        nameTxt.text = studentData.name
        ageTxt.text = "(${studentData.getKoreanAge(2022)}세)"
        addressTxt.text = studentData.address
    }
}