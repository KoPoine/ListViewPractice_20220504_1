package com.neppplus.listviewpractice_20220504_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import kotlinx.android.synthetic.main.activity_detail_profile.*
import java.text.DecimalFormat

class DetailProfileActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_profile)
        val name = intent.getStringExtra("name")
        val charge = intent.getIntExtra("birthYear", 0)

        val list = ArrayList<String>()

        for (i in 0 .. 20) {
            list.add("김밥")
        }

        val decimal = DecimalFormat("#,###")
        val minCharge = decimal.format(charge)
        nameTxt.text = name
        minChargeTxt.text = "최소주문 금액$minCharge 원"

        menuListView.adapter = ArrayAdapter(this, R.layout.menu_list_item, R.id.menuItemTxt, list)
    }
}