package com.example.activitydatashow

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import androidx.activity.result.contract.ActivityResultContracts
import java.sql.Savepoint

class MainActivity : AppCompatActivity() {
    lateinit var etString: EditText
    lateinit var etInt: EditText
    lateinit var etFloat: EditText
    lateinit var etDouble: EditText
    lateinit var etBoolean: EditText
    lateinit var btnSave: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        etString = findViewById(R.id.etString)
        etInt = findViewById(R.id.etInt)
        etFloat = findViewById(R.id.etFloat)
        etDouble = findViewById(R.id.etDouble)
        etBoolean = findViewById(R.id.etBoolean)
        btnSave = findViewById(R.id.btnSave)

        btnSave.setOnClickListener {
            if (etString.text.isEmpty()) {
                etString.error = "Enter Your String"
            } else if (etInt.text.isEmpty()) {
                etInt.error = "Enter Your Integer"
            } else if (etFloat.text.isEmpty()) {
                etFloat.error = "Enter Your Float "
            } else if (etDouble.text.isEmpty()) {
                etDouble.error = "Enter Your Double"
            } else if (etBoolean.text.isEmpty()) {
                etBoolean.error = "Enter Your Boolean"
            }else{
                var intent=Intent(this,Datashow::class.java)
                intent.putExtra("String",etString.text.toString())
                intent.putExtra("Integer",etInt.text.toString().toInt())
                intent.putExtra("Float",etFloat.text.toString().toFloat())
                intent.putExtra("Double",etDouble.text.toString().toDouble())
                intent.putExtra("Boolean",etBoolean.text.toString().toBoolean())
                startActivity(intent)

            }
        }
    }
}