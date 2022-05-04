package com.neppplus.listviewpractice_20220504_1.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.listviewpractice_20220504_1.R
import com.neppplus.listviewpractice_20220504_1.models.StudentData
import java.text.DecimalFormat

class StoreAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {
    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {
        var tempRow = convertView
        if (tempRow == null) {
            tempRow = LayoutInflater.from(mContext).inflate(R.layout.student_list_item, null)
        }
        val row = tempRow!!

        val nameTxt = row.findViewById<TextView>(R.id.nameTxt)
        val minCharge = row.findViewById<TextView>(R.id.minChargeTxt)
        val menuTxt = row.findViewById<TextView>(R.id.menuTxt)

        val decimal = DecimalFormat("#,###")
        val resultCharge = decimal.format(mList[position].minCharge)

        nameTxt.text = mList[position].name
        minCharge.text = "최소주문 금액 ${resultCharge}원"
        menuTxt.text = mList[position].menu

        return row
    }
}