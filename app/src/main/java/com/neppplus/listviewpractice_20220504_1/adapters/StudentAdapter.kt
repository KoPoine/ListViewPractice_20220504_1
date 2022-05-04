package com.neppplus.listviewpractice_20220504_1.adapters

import android.content.Context
import android.widget.ArrayAdapter
import com.neppplus.listviewpractice_20220504_1.models.StudentData

class StudentAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : ArrayList<StudentData>
) : ArrayAdapter<StudentData>(mContext, resId, mList) {
}