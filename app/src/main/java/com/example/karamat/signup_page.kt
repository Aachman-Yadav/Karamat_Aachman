package com.example.karamat

import android.content.Intent
import android.os.Bundle
import android.widget.ImageView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class signup_page : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_signup_page)
        var back_btn_2 = findViewById<ImageView>(R.id.back_btn_2)

        back_btn_2.setOnClickListener{
            Toast.makeText(this, "Going back to splash screen!", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, MainActivity::class.java)
            startActivity(intent)
        }

        var signup_btn = findViewById<MaterialButton>(R.id.signup_btn_2)
        signup_btn.setOnClickListener {
            Toast.makeText(this, "Redirecting to Home Page!!", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, home_page::class.java)
            startActivity(intent)
        }
    }
}