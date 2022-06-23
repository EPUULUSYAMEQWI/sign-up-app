package dev.amekwi.fitmax

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import com.google.android.material.textfield.TextInputEditText
import com.google.android.material.textfield.TextInputLayout
import dev.amekwi.fitmax.databinding.ActivityLoginBinding

class LoginActivity : AppCompatActivity() {
    lateinit var binding:ActivityLoginBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding=ActivityLoginBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.tvup.setOnClickListener {
            val intent = Intent(this, SignUpActivity::class.java)
            startActivity(intent)
        }
            binding.btnlogin.setOnClickListener {
                validateLogin()
            }
    }
    fun validateLogin() {
        var email=binding.itEmail.text.toString()
        var password=binding.itpassword.text.toString()
        if(email.isBlank()){
            binding.itEmail.error="Email is invalid"
        }
        if (password.isBlank()){
            binding.itpassword.error="Password is required"
        }
    }
}