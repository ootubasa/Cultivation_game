package com.example.cultivation_game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_sub.*

class SubActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sub)

        var grow_Image_num = 1
        button_grow_tomato.setOnClickListener {
            if (grow_Image_num % 6 == 1)
                grow_tomato_View.setImageResource(R.drawable.tomato2)
            if (grow_Image_num % 6 == 2)
                grow_tomato_View.setImageResource(R.drawable.tomato3)
            if (grow_Image_num % 6 == 3)
                grow_tomato_View.setImageResource(R.drawable.tomato4)
            if (grow_Image_num % 6 == 4)
                grow_tomato_View.setImageResource(R.drawable.tomato5)
            if (grow_Image_num % 6 == 5)
                grow_tomato_View.setImageResource(R.drawable.tomato6)
            if (grow_Image_num % 6 == 0)
                grow_tomato_View.setImageResource(R.drawable.tomato1)
            grow_Image_num += 1
            if (grow_Image_num % 6 == 0)grow_Image_num=0
        }
    }
}