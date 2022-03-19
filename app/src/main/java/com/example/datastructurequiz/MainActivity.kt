package com.example.datastructurequiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val submitButton : Button = findViewById(R.id.submitButton)
        val nameInput : EditText = findViewById(R.id.nameInput)

        Constants.name = nameInput.text.toString()

        submitButton.setOnClickListener {

            if(nameInput.text.isNotEmpty()){
                val intent = Intent(this,Topics::class.java)
                intent.putExtra(Constants.name,nameInput.text)
                startActivity(intent)
                finish()
            }
            else{
                Toast.makeText(this, "Please Enter Your Name", Toast.LENGTH_SHORT).show()
            }
        }
    }
}