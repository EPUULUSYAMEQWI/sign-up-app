package dev.amekwi.fitmax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class LoginActivity : AppCompatActivity() {

    lateinit var itEmail: TextInputEditText
    lateinit var itpassword: TextInputEditText
    lateinit var tilEmail: TextInputLayout
    lateinit var tilpassword: TextInputLayout
    lateinit var tvup: TextView
    lateinit var btnlogin: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        tvup= findViewById(R.id.tvup)
        tilEmail=findViewById(R.id.tilEmail)
        itpassword=findViewById(R.id.itpassword)
        itEmail=findViewById(R.id.itEmail)
        tilpassword=findViewById(R.id.tilpassword)
        btnlogin=findViewById(R.id.btnlogin)

        tvup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)

        }
            btnlogin.setOnClickListener {
                validateLogin()
            }
    }

    fun validateLogin() {
        var email=itEmail.text.toString()
        var password=itpassword.text.toString()
        if(email.isBlank()){
            itEmail.error="Email is invalid"
        }
        if (password.isBlank()){
            itpassword.error="Password is required"
        }
    }
}