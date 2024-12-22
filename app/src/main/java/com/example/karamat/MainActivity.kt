package com.example.karamat

import android.content.Intent
import android.os.Bundle
import android.widget.TextView
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.google.android.material.button.MaterialButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        var btn = findViewById<MaterialButton>(R.id.signInButton)
        btn.setOnClickListener{
            Toast.makeText(this, "Redirecting to Login Page!", Toast.LENGTH_SHORT).show()
            var intent= Intent(this, login_page::class.java)
            startActivity(intent)
        }

        var btn_2 = findViewById<MaterialButton>(R.id.signUpButton)
        btn_2.setOnClickListener{
            Toast.makeText(this, "Redirecting to SignUp Page!", Toast.LENGTH_SHORT).show()
            var intent= Intent(this, signup_page::class.java)
            startActivity(intent)
        }

        var btn_3 = findViewById<TextView>(R.id.skipText)
        btn_3.setOnClickListener{
            Toast.makeText(this, "Directly to the Home Page", Toast.LENGTH_SHORT).show()
            var intent = Intent(this, home_page::class.java)
            startActivity(intent)
        }
    }
}