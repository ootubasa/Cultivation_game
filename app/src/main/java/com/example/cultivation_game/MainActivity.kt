package com.example.cultivation_game

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        var grow_Image_num = 1
        button_grow.setOnClickListener {
            if (grow_Image_num % 9 == 1)
                grow_tomato_View.setImageResource(R.drawable.flower_seichou2)
            if (grow_Image_num % 9 == 2)
                grow_tomato_View.setImageResource(R.drawable.flower_seichou3)
            if (grow_Image_num % 9 == 3)
                grow_tomato_View.setImageResource(R.drawable.flower_seichou4)
            if (grow_Image_num % 9 == 4)
                grow_tomato_View.setImageResource(R.drawable.flower_seichou5)
            if (grow_Image_num % 9 == 5)
                grow_tomato_View.setImageResource(R.drawable.flower_seichou6)
            if (grow_Image_num % 9 == 6)
                grow_tomato_View.setImageResource(R.drawable.flower_seichou7)
            if (grow_Image_num % 9 == 7)
                grow_tomato_View.setImageResource(R.drawable.flower_seichou8)
            if (grow_Image_num % 9 == 8)
                grow_tomato_View.setImageResource(R.drawable.flower_seichou9)
            if (grow_Image_num % 9 == 0)
                grow_tomato_View.setImageResource(R.drawable.flower_seichou1)
            grow_Image_num += 1
            if (grow_Image_num % 9 == 0)grow_Image_num=0
        }
    }
}