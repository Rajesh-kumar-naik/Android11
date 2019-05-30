package com.example.iteradmin.android11

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.ImageView
import com.bumptech.glide.Glide

class Main3Activity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main3)
        val image=findViewById<ImageView>(R.id.image)
        val btn=findViewById<Button>(R.id.bt1)

        val im = arrayOf(
                "https://cdn5.newsnation.in/images/2016/11/18/223397591-priyanka_6.jpg",
                "https://delightfull.eu/blog/wp-content/uploads/2017/05/Why-we-Love-Bollywood-Actress-Kareena-Kapoor.jpg",
                "https://recipes.timesofindia.com/thumb/msid-49181247,width-400,resizemode-4/49181247.jpg",
                "https://ficklemind.com/wp-content/uploads/2019/01/anushka-sharma-top-indian-bollywood-actress-758x426.jpg"
        )
        Glide.with(this).load(im[0]).into(image)
        var i:Int=0
        val n:Int=im.size
        btn.setOnClickListener {
           Glide.with(this).load(im[i%n]).into(image)
            i++
        }
    }
}
