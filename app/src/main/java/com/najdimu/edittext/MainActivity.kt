package com.najdimu.edittext

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.najdimu.edit_text_validator.EditTextValidator
import com.najdimu.edittext.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        binding.submitBtn.setOnClickListener {
            val password = binding.password.text.toString()
            val reEnterPassword = binding.reEnterPassword.text.toString()

            if (password != reEnterPassword) {
                EditTextValidator.showError(binding.reEnterPassword, "Enter correct password")
            }
        }

    }
}