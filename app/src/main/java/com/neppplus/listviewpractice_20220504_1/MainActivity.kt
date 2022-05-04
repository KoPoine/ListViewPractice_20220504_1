package com.neppplus.listviewpractice_20220504_1

import android.content.DialogInterface
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import androidx.appcompat.app.AlertDialog
import com.neppplus.listviewpractice_20220504_1.adapters.StoreAdapter
import com.neppplus.listviewpractice_20220504_1.models.StudentData
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    val mStoreList = ArrayList<StudentData>()
    lateinit var mStoreAdapter : StoreAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

//        학생 데이터 입력
        mStoreList.add( StudentData("김밥천국", 19900, "김밥") )
        mStoreList.add( StudentData("김밥천국", 19860, "김밥 성남시") )
        mStoreList.add( StudentData("김밥천국", 20000, "김밥 강남구") )
        mStoreList.add( StudentData("김밥천국", 19930, "김밥 영등포구") )
        mStoreList.add( StudentData("김밥천국", 19910, "김밥 성동구") )
        mStoreList.add( StudentData("김밥천국", 19860, "김밥 강동구") )
        mStoreList.add( StudentData("김밥천국", 19930, "김밥 중랑구") )
        mStoreList.add( StudentData("김밥천국", 19940, "김밥 성남시") )
        mStoreList.add( StudentData("김밥천국", 19950, "김밥 동대문구") )
        mStoreList.add( StudentData("김밥천국", 19970, "김밥 강동구") )
        mStoreList.add( StudentData("김밥천국", 19870, "김밥 남양주시") )
        mStoreList.add( StudentData("김밥천국", 19970, "김밥 성남시") )

        mStoreAdapter = StoreAdapter(this, R.layout.student_list_item, mStoreList)
        mainListView.adapter = mStoreAdapter
        
        mainListView.setOnItemClickListener { adapterView, view, i, l ->
            val myIntent = Intent(this, DetailProfileActivity::class.java)
            myIntent.putExtra("name", mStoreList[i].name)
                .putExtra("birthYear", mStoreList[i].minCharge)
                .putExtra("address", mStoreList[i].menu)
            startActivity(myIntent)
        }
        mainListView.setOnItemLongClickListener { adapterView, view, i, l ->
            val store = mStoreList[i].name
            val alert = AlertDialog.Builder(this)
                .setTitle("상점 삭제")
                .setMessage("${mStoreList[i].name} 가게를 삭제하시겠습니까?")
                .setPositiveButton("확인", DialogInterface.OnClickListener { dialogInterface, i ->
                    Toast.makeText(this, "${store}을/를 삭제하였습니다.", Toast.LENGTH_SHORT).show()
                })
                .setNegativeButton("취소", null)
                .show()
            return@setOnItemLongClickListener(true)
        }
    }
}