package com.example.calculate

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        plus.setOnClickListener {
            if (numOne.text.isEmpty() || numTwo.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please enter the damn two numbers.Jeez!!",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                var a: Double = numOne!!.text.toString().toDouble()
                var b: Double = numTwo!!.text.toString().toDouble()
                var c: Double
                c = a + b
                result.text = c.toString()
            }
        }
        minus.setOnClickListener {
            if (numOne.text.isEmpty() || numTwo.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please enter the damn two numbers.Jeez!!",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                var a: Double = numOne!!.text.toString().toDouble()
                var b: Double = numTwo!!.text.toString().toDouble()
                var c: Double
                c = a - b
                result.text = c.toString()
            }
        }
        mul.setOnClickListener {
            if (numOne.text.isEmpty() || numTwo.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please enter the damn two numbers.Jeez!!",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                var a: Double = numOne!!.text.toString().toDouble()
                var b: Double = numTwo!!.text.toString().toDouble()
                var c: Double
                c = a * b
                result.text = c.toString()
            }
        }
        div.setOnClickListener {
            if (numOne.text.isEmpty() || numTwo.text.isEmpty()) {
                Toast.makeText(
                    applicationContext,
                    "Please enter the damn two numbers.Jeez!!",
                    Toast.LENGTH_LONG
                ).show()
            } else {
                var a: Double = numOne!!.text.toString().toDouble()
                var b: Double = numTwo!!.text.toString().toDouble()
                var c: Double
                c = a / b
                result.text = c.toString()
            }
        }
        clr.setOnClickListener {
            numOne.setText("")
            numTwo.setText("")
        }
    }
}
