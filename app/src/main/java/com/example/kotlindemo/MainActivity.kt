package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var btn = findViewById<Button>(R.id.btn)
        var input_result=findViewById<EditText>(R.id.input_radius)
        var txt = findViewById<TextView>(R.id.txtView)

        btn.setOnClickListener(View.OnClickListener() {

           /* var a:Editable=input_result.text
            var b:String=a.toString()
            var radius:Double=b.toDouble() */
            var radius:Double=input_result.text.toString().toDouble()

            val pi:Double=3.141
            var area=pi*radius*radius
            txt.setText("Result : $area")
        })


        /*
        var btn = findViewById<Button>(R.id.btn1)
        var txt = findViewById<TextView>(R.id.txt1)

        var flag=false;
        btn.setOnClickListener(View.OnClickListener() {
            // Code here executes on main thread after user presses button
            if(flag) {
                txt.setText("Nikhil Reddy")
                flag = false
            }
            else{
                txt.setText("Sreya")
                flag=true
            }
        })
        */



    }
}