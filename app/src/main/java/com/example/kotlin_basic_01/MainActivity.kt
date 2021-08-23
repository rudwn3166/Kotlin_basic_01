package com.example.kotlin_basic_01

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        clickBtn.setOnClickListener {

//            setOnClickListener는 버튼이 눌렸을 때 기능을 수행해주는 기능
//
            Log.d("메인화면로그","클릭용 버튼 눌림")
        }

    }
}