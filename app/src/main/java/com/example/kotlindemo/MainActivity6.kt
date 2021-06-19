package com.example.kotlindemo

import android.content.Context
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.view.inputmethod.InputMethodManager
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import android.widget.Toast

class MainActivity6 : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main6)

        var name = findViewById<EditText>(R.id.et_6_1)
        var gender = findViewById<EditText>(R.id.et_6_2)
        var age = findViewById<EditText>(R.id.et_6_3)
        var btn = findViewById<Button>(R.id.btn_6)

        btn.setOnClickListener(View.OnClickListener {
            val person = Person()
            person.name = name.text.toString()
            person.gender = gender.text.toString()
            person.age = age.text.toString().toInt()

            var result = if(person.age!=0) "${person.name}" else "Person is Minor"

            val toast = Toast.makeText(this, result, Toast.LENGTH_SHORT).show()
            closeKeyboard()

        })
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