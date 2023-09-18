package com.example.activitydatashow

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.TextView

class Datashow : AppCompatActivity() {
    lateinit var tvGetString:TextView
    lateinit var tvGetInt: TextView
    lateinit var tvGetFloat:TextView
    lateinit var tvGetDouble:TextView
    lateinit var tvGetBoolean:TextView
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_datashow)
        tvGetString=findViewById(R.id.tvGetString)
        tvGetInt=findViewById(R.id.tvGetInt)
        tvGetFloat=findViewById(R.id.tvGetFloat)
        tvGetDouble=findViewById(R.id.tvGetDouble)
        tvGetBoolean=findViewById(R.id.tvGetBoolean)
        intent?.let {
            var string=it.getStringExtra("String")
            var int=it.getIntExtra("Integer",0)
            var float=it.getFloatExtra("Float",0f)
            var double=it.getDoubleExtra("Double",.00)
            var Boolean=it.getBooleanExtra("Boolean",true)

            tvGetString.setText(string)
            tvGetInt.setText(int)
            tvGetFloat.setText(float.toString())
            tvGetDouble.setText(double.toString())
            tvGetBoolean.setText(boolean)

        }
        }
    }
