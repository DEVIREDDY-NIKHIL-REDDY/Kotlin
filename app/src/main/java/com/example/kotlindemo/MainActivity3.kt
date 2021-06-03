package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity3 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        var btn1=findViewById<Button>(R.id.btn1)
        var input=findViewById<EditText>(R.id.input)
        var result=findViewById<TextView>(R.id.textView2)

        btn1.setOnClickListener(View.OnClickListener {
            var number:Int=input.text.toString().toInt()
            var i:Int=1
            var str:String=""
            while(i<=number){
                str=str+i+'@'
                i++
            }

            result.setText(str)
            input.setText("")
        })
    }

}