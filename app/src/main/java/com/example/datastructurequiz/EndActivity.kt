package com.example.datastructurequiz

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import org.w3c.dom.Text

class EndActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_end)

        val name = intent.getStringExtra(Constants.name)
        val score = intent.getIntExtra(Constants.correctAnswer.toString(),0)

        val congtv = findViewById<TextView>(R.id.congo)
        val scoretv = findViewById<TextView>(R.id.score)
        val btn = findViewById<Button>(R.id.start_again)

        congtv.text = "Congratulations ${Constants.name} !!"
        scoretv.text = "Your score is ${Constants.correctAnswer}/5"

        btn.setOnClickListener {
            val intent = Intent(this,MainActivity::class.java)
            startActivity(intent)
            finish()
        }



    }
}