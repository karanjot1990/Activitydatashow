package com.example.activitydatashow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Datashow : AppCompatActivity() {
    lateinit var tvGetString:TextView
    private lateinit var tvGetInt: TextView
    private lateinit var tvGetFloat:TextView
    private lateinit var tvGetDouble:TextView
    //lateinit var tvGetBoolean:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datashow)

        tvGetString=findViewById(R.id.tvGetString)
        tvGetInt=findViewById(R.id.tvGetInteger)
        tvGetFloat=findViewById(R.id.tvGetFloat)
        tvGetDouble=findViewById(R.id.tvGetDouble)
        //tvGetBoolean=findViewById(R.id.tvGetBoolean)
        intent?.let {
            var name=it.getStringExtra("String")
            var number1 = it.getIntExtra("Integer",0)
            var number2=it.getFloatExtra("Float",0.0f)
            var number3=it.getDoubleExtra("Double",0.0)

            System.out.println("Integer Number $number1")

            tvGetString.text = name
            tvGetInt.text = number1.toString()
            tvGetFloat.setText(number2.toString())
            tvGetDouble.setText(number3.toString())


        }
        }
    }
