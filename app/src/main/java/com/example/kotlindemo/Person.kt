package com.example.kotlindemo

class Person {
    var name:String?= null
    set(value){
        field= value?.uppercase()
    }

    var gender:String? = null

    var age:Int = 0
    set(value) = if(value<18) field =0 else field=value



}