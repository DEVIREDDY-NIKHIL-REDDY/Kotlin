package com.example.kotlindemo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import java.util.*
import android.view.inputmethod.InputMethodManager
import android.content.Context

class MainActivity5 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main5)
        var temp = findViewById<EditText>(R.id.et1_5)
        var dirt = findViewById<EditText>(R.id.et2_5)
        var btn = findViewById<Button>(R.id.btn5)
        var txt = findViewById<TextView>(R.id.tv5)
        btn.setOnClickListener(View.OnClickListener {
            var t:Int = temp.text.toString().toInt()
            var d:Int = dirt.text.toString().toInt()
            var day:String = randomDay()
            txt.setText("1.Today is $day, you need to feed ${feedInfo(day)}\n2.${waterInfo(day, t, d)}")
            closeKeyboard()
        })

    }
    fun randomDay():String{
        var arr = arrayOf("Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday")
        var day:String = arr[Random().nextInt(arr.size)]
        return day
    }
    fun feedInfo(day:String):String{
        var food:String=""
        when(day){
            "Monday" -> food = "flakes"
            "Tuesday" -> food = "pellets"
            "Wednesday" -> food = "redworms"
            "Thursday" -> food = "granules"
            "Friday" -> food = "mosquitoes"
            "Saturday" -> food = "lettuce"
            "Sunday" -> food = "plankton"
        }
        return food
    }
    fun waterInfo(day:String,t:Int,d:Int):String{
        var str=""
        if(day=="Sunday" || t>30 || d>30){
            str="Water change is needed"
        }
        else{
            str="Water change is not needed"
        }
        return str
    }
    fun closeKeyboard() {
        val view = this.currentFocus
        if (view != null) {
            val imm: InputMethodManager =
                getSystemService(Context.INPUT_METHOD_SERVICE) as InputMethodManager
            imm.hideSoftInputFromWindow(view.windowToken, 0)
        }
    }
}