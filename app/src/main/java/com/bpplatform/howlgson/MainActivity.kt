package com.bpplatform.howlgson

import android.os.Bundle
import android.support.v7.app.AppCompatActivity
import com.google.gson.Gson

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var json = """
            { "name":"John", "age":31, "city":"New York" }
            """
        var gson = Gson()
        var userDTO = gson.fromJson(json, UserDTO_Kotiln::class.java)

        println(userDTO.name)
        println(userDTO.age.toString())
        println(userDTO.city)
    }
}
