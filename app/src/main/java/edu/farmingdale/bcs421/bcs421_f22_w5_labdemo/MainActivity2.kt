package edu.farmingdale.bcs421.bcs421_f22_w5_labdemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class MainActivity2 : AppCompatActivity() {
    lateinit var mTv:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        mTv=findViewById(R.id.textView2)

        var str:String?=intent.getStringExtra("MYKEY")
        mTv.setText(str)
    }
}