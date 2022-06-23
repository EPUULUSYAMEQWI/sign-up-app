package dev.amekwi.fitmax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.amekwi.fitmax.databinding.ActivityLoginBinding
import dev.amekwi.fitmax.databinding.ActivitySignUpBinding

class SignUpActivity : AppCompatActivity() {
    lateinit var binding: ActivitySignUpBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivitySignUpBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvlogin.setOnClickListener {
            val intent = Intent(this, LoginActivity::class.java)
            startActivity(intent)
        }
        binding.btnsignup.setOnClickListener {
            validateLogin()
        }
    }
    fun validateLogin() {
        var firstname=binding.etfirstname.text.toString()
        var lastname=binding.etlastname.text.toString()
        var email=binding.etEmail.text.toString()
        var password=binding.etpassword.text.toString()
        var confirm=binding.etconfirm.text.toString()

        if(email.isBlank()){
            binding.etEmail.error="Email is invalid"
        }
        if (password.isBlank()){
            binding.etpassword.error="Password is required"
        }
        if (firstname.isBlank()){
            binding.etfirstname.error="first name required"
        }
        if (lastname.isBlank()){
            binding.etlastname.error="last name required"
        }
        if (confirm.isBlank()){
            binding.etconfirm.error="confirm is required"
        }
    }
}

