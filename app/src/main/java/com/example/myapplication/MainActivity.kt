package com.example.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.Toast
import com.squareup.moshi.Moshi
import com.squareup.moshi.kotlin.reflect.KotlinJsonAdapterFactory
import java.time.LocalDateTime

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button = findViewById<Button>(R.id.button)

        val moshi = Moshi.Builder().add(KotlinJsonAdapterFactory()).add(LocalDateTimeAdapter()).build()

        // コマンドラインでビルドした時にだけクラッシュする
        button.setOnClickListener {
            val sample = Sample(LocalDateTime.now())
            val hoge = moshi.adapter(Sample::class.java).toJson(sample)

            Toast.makeText(applicationContext, hoge, Toast.LENGTH_SHORT).show()
        }
    }
}
