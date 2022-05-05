package com.neppplus.listviewpractice_20220504_1.models

import java.io.Serializable

class StudentData (
    val name : String,
    val birthYear : Int,
    val address : String,
        ) : Serializable {
    fun getKoreanAge(year : Int) : Int {
        val koreanAge = year - this.birthYear + 1
        return koreanAge
    }
}