package com.neppplus.listviewpractice_20220504_1.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.TextView
import com.neppplus.listviewpractice_20220504_1.R
import com.neppplus.listviewpractice_20220504_1.models.StudentData

class StudentAdapter(
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
        val ageTxt = row.findViewById<TextView>(R.id.ageTxt)
        val addressTxt = row.findViewById<TextView>(R.id.addressTxt)

        nameTxt.text = mList[position].name
        ageTxt.text = mList[position].birthYear.toString()
        addressTxt.text = mList[position].address

        return row
    }
}