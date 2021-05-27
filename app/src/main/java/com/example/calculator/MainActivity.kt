package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var etnumber = findViewById<EditText>(R.id.etnumber)
        var etnumber2 = findViewById<EditText>(R.id.etnumber2)
        var tvAns = findViewById<EditText>(R.id.tvAns)
        var btnAdd = findViewById<Button>(R.id.btnADD)
        var btnSubtract = findViewById<Button>(R.id.btnSubtract)
        var btnModulus = findViewById<Button>(R.id.btnModulus)
        var btnMultiplication = findViewById<Button>(R.id.btnMultiplication)


        btnAdd.setOnClickListener {
            if (etnumber.text.toString().equals("") || etnumber2.text.toString().equals("")) {
                Toast.makeText(baseContext, "Enter Number", Toast.LENGTH_LONG).show()
            } else {
                val etnumber= etnumber.text.toString().toInt()
                val etnumber2= etnumber2.text.toString().toInt()
                val number = etnumber + etnumber2
                tvAns.setText(number.toString())
            }
        }


        btnSubtract.setOnClickListener {
            if (etnumber.text.toString().equals("") || etnumber2.text.toString().equals("")) {
                Toast.makeText(baseContext, "Enter Number", Toast.LENGTH_LONG).show()
            } else {
                val etnumber = etnumber.text.toString().toInt()
                val etnumber2 = etnumber2.text.toString().toInt()
                val number = etnumber - etnumber2
                tvAns.setText(number.toString())

                btnSubtract.setOnClickListener {
                    if (etnumber.text.toString().equals("") || etnumber2.text.toString().equals("")) {
                        Toast.makeText(baseContext, "Enter Number", Toast.LENGTH_LONG).show()
                    } else {
                        val etnumber = etnumber.text.toString().toInt()
                        val etnumber2 = etnumber2.text.toString().toInt()
                        val number = etnumber - etnumber2
                        tvAns.setText(number.toString())

                        btnSubtract.setOnClickListener {
                            if (etnumber.text.toString().equals("") || etnumber2.text.toString().equals("")) {
                                Toast.makeText(baseContext, "Enter Number", Toast.LENGTH_LONG).show()
                            } else {
                                val etnumber = etnumber.text.toString().toInt()
                                val etnumber2 = etnumber2.text.toString().toInt()
                                val number = etnumber - etnumber2
                                tvAns.setText(number.toString())



                    }
                }
            }
        }
    }
}


