package edu.farmingdale.bcs421.bcs421_f22_w5_labdemo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText

class MainActivity : AppCompatActivity() {
    lateinit var  mBtn:Button
    lateinit var mEditText: EditText
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        mBtn=findViewById(R.id.button)
        mEditText=findViewById(R.id.editTextTextPersonName)

        mBtn.setOnClickListener {
            val intent=Intent(this,MainActivity2::class.java)
            intent.putExtra("MYKEY",mEditText.text.toString())
            startActivity(intent)
        }
    }
}