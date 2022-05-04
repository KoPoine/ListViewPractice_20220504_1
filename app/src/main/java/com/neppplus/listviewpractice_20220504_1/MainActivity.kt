package com.neppplus.listviewpractice_20220504_1

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
//        mainListView.setOnItemLongClickListener { adapterView, view, i, l ->
//            Toast.makeText(this, "$i 길게 눌렀습니다.", Toast.LENGTH_SHORT).show()
//            return@setOnItemLongClickListener(true)
//        }
    }
}