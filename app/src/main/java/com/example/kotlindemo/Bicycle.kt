package com.example.kotlindemo

class Bicycle {
    var brandName:String = ""
    //getter
    get(){
        return field
    }
    //setter
    set(value){
        field = value.uppercase()
    }
    var model:Int = 0
    //getter
    get(){
        return field
    }

    //setter
    set(value){
        if(value>1990){
            field=value
        }
        else{
            println("Model is not in production")
            //throw Exception("Model is not in production")
        }
    }
    fun display(){
        println("$brandName -> $model")
    }

}