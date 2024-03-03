package com.example.lesson4

import android.os.Bundle
import android.view.View
import android.widget.EditText
import android.widget.TableLayout
import android.widget.TableRow
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun btnClick(v: View){
        val water = findViewById<EditText>(R.id.waterText)
        val location = findViewById<EditText>(R.id.locationText)
        val type = findViewById<EditText>(R.id.typeText)
        val table = findViewById<TableLayout>(R.id.table)
        val column1 = findViewById<TextView>(R.id.column1)

        if(water.text.toString().isNullOrBlank())
        {
            Toast.makeText(this, "${water.hint} can not be empty", Toast.LENGTH_LONG).show()
        }
        else if(location.text.toString().isNullOrBlank())
        {
            Toast.makeText(this, "${location.hint} can not be empty", Toast.LENGTH_LONG).show()
        }
        else if(type.text.toString().isNullOrBlank())
        {
            Toast.makeText(this, "${type.hint} can not be empty", Toast.LENGTH_LONG).show()
        }
        else
        {
            val tableRow = TableRow(this)
            tableRow.layoutParams = TableRow.LayoutParams(
                TableRow.LayoutParams.MATCH_PARENT,
                TableRow.LayoutParams.MATCH_PARENT
            )
            val textView = TextView(this)
            textView.text = water.text.toString()
            textView.setPadding(10,0,10,0)
            textView.setTextColor( column1.textColors)
            textView.background = column1.background

            val textView2 = TextView(this)
            textView2.text = location.text.toString()
            textView2.setPadding(10,0,10,0)
            textView2.setTextColor( column1.textColors)
            textView2.background = column1.background

            val textView3 = TextView(this)
            textView3.text = type.text.toString()
            textView3.setPadding(10,0,10,0)
            textView3.setTextColor( column1.textColors)
            textView3.background = column1.background

            tableRow.addView(textView)
            tableRow.addView(textView2)
            tableRow.addView(textView3)
            table.addView(tableRow)

            water.text.clear()
            location.text.clear()
            type.text.clear()
        }
    }
}