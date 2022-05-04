package com.neppplus.listviewpractice_20220504_1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.neppplus.listviewpractice_20220504_1.adapters.StudentAdapter
import com.neppplus.listviewpractice_20220504_1.models.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val mStudentList = ArrayList<StudentData>()
    lateinit var mStudentAdapter : StudentAdapter
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        학생 데이터 입력
        mStudentList.add( StudentData("김민철", 1990, "서울시 서대문구") )
        mStudentList.add( StudentData("권용훈", 1986, "경기도 성남시") )
        mStudentList.add( StudentData("김노아", 2000, "서울시 강남구") )
        mStudentList.add( StudentData("김진우", 1993, "서울시 영등포구") )
        mStudentList.add( StudentData("박동근", 1991, "서울시 성동구") )
        mStudentList.add( StudentData("박선희", 1986, "서울시 강동구") )
        mStudentList.add( StudentData("서수현", 1993, "서울시 중랑구") )
        mStudentList.add( StudentData("송미진", 1994, "경기도 성남시") )
        mStudentList.add( StudentData("심재혁", 1995, "서울시 동대문구") )
        mStudentList.add( StudentData("정한별", 1997, "서울시 강동구") )
        mStudentList.add( StudentData("조장환", 1987, "경기도 남양주시") )
        mStudentList.add( StudentData("최혜인", 1997, "경기도 성남시") )

        mStudentAdapter = StudentAdapter(this, R.layout.student_list_item, mStudentList)
        mainListView.adapter = mStudentAdapter
        
        mainListView.setOnItemClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "$i", Toast.LENGTH_SHORT).show()
        }

        mainListView.setOnItemLongClickListener { adapterView, view, i, l ->
            Toast.makeText(this, "$i 길게 눌렀습니다.", Toast.LENGTH_SHORT).show()
            return@setOnItemLongClickListener(true)
        }

    }
}