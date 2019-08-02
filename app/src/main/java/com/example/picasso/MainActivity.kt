package com.example.picasso

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.squareup.picasso.Picasso
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val url = "https://dailypost.ng/wp-content/uploads/2019/06/Ronaldo.jpg"

        Picasso.with(this)
            .load(url)
            .placeholder(R.mipmap.load)
            .error(R.mipmap.error)
            .into(imageHinh)


    }
}
