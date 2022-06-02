package dev.amekwi.fitmax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout

class SignUpActivity : AppCompatActivity() {
    lateinit var etfirstname:TextInputEditText
    lateinit var tilfirstname:TextInputLayout
    lateinit var etlastname:TextInputEditText
    lateinit var tillastname:TextInputLayout
    lateinit var etEmail: TextInputEditText
    lateinit var etpassword: TextInputEditText
    lateinit var tilEmail: TextInputLayout
    lateinit var tilpassword: TextInputLayout
    lateinit var etconfirm:TextInputEditText
    lateinit var tilconfirm:TextInputLayout
    lateinit var btnsignup: Button
    lateinit var tvlogin:TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_sign_up)

        etfirstname= findViewById(R.id.etfirstname)
        tilfirstname=findViewById(R.id.tilfirstname)
        etlastname=findViewById(R.id.etlastname)
        tillastname=findViewById(R.id.tillastname)
        tilconfirm=findViewById(R.id.tilconfirm)
        etconfirm=findViewById(R.id.etconfirm)
        tilEmail=findViewById(R.id.tilEmail)
        etpassword=findViewById(R.id.etpassword)
        etEmail=findViewById(R.id.etEmail)
        tilpassword=findViewById(R.id.tilpassword)
        btnsignup=findViewById(R.id.btnsignup)
        tvlogin=findViewById(R.id.tvlogin)

        tvlogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)

        }
        btnsignup.setOnClickListener {
            validateLogin()
        }
    }

    fun validateLogin() {
        var firstname=etfirstname.text.toString()
        var lastname=etlastname.text.toString()
        var email=etEmail.text.toString()
        var password=etpassword.text.toString()
        var confirm=etconfirm.text.toString()

        if(email.isBlank()){
            etEmail.error="Email is invalid"
        }
        if (password.isBlank()){
            etpassword.error="Password is required"
        }
        if (firstname.isBlank()){
            etfirstname.error="first name required"

        }
        if (lastname.isBlank()){
            etlastname.error="last name required"
        }
        if (confirm.isBlank()){
            etconfirm.error="confirm is required"
        }
    }
}

