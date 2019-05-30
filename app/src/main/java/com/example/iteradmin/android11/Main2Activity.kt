package com.example.iteradmin.android11

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.AutoCompleteTextView
import android.widget.TextView
import android.widget.Toast

class Main2Activity : AppCompatActivity() {
    val stdata= arrayOf("Andhra Pradesh ","Arunachal Pradesh","Assam","Bihar",
            "Chhattisgarh","Goa","Gujarat","Haryana","Himachal Pradesh","Jammu and Kashmir")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)

        val capdata= arrayOf("Hyderabad","Itanagar","Dispur","Patna","Raipur","Panaji",
                "Gandhinagar", "Chandigarh","Shimla","Srinagar (summer), Jammu (winter)")
        val state=findViewById<AutoCompleteTextView>(R.id.search2)
        val capital=findViewById<TextView>(R.id.text1)
        val adp=ArrayAdapter<String>(this,
                android.R.layout.simple_dropdown_item_1line,stdata)
        state.setAdapter(adp)
        state.threshold=1

        state.setOnItemClickListener { parent, view, position, id ->
            val s:String=parent.getItemAtPosition(position).toString()
            val c:Int=getCapital(s)
            state.setText(capdata[c])

        }
    }
    fun getCapital(stdata:String):Int{
        var i=0
        for (s in stdata) {
            if(stdata.equals(s)) {
                return i
                i++
            }
        }
        return i
    }

}




