package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.Spinner
import android.widget.TextView

class MainActivity4 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main4)
        
        var num1 = findViewById<EditText>(R.id.ev1_4)
        var num2 = findViewById<EditText>(R.id.ev2_4)
        var btn = findViewById<Button>(R.id.btn4)
        var result = findViewById<TextView>(R.id.tv_4)
        var spinner = findViewById<Spinner>(R.id.spinner4)
        btn.setOnClickListener(View.OnClickListener {
            var a:Float=num1.text.toString().toFloat()
            var b:Float=num2.text.toString().toFloat()
            var operation:String=spinner.selectedItem.toString()
            when(operation){
                "+" -> result.setText("Result: ${add(a,b)}")
                "-" -> result.setText("Result: ${sub(a,b)}")
                "*" -> result.setText("Result: ${multi(a,b)}")
                "/" -> result.setText("Result: ${div(a,b)}")
                "%" -> result.setText("Result: ${mod(a,b)}")
            }
        })
    }
    fun add(a:Float,b:Float):Float = a+b

    fun sub(a:Float,b:Float):Float = a-b
    fun multi(a:Float,b:Float):Float = a*b
    fun div(a:Float,b:Float):Float = a/b
    fun mod(a:Float,b:Float):Float = a%b
}