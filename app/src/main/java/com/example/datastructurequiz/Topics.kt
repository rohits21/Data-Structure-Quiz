package com.example.datastructurequiz

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button

class Topics : AppCompatActivity() {

    lateinit var name : String


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_topics)

        name = intent.getStringExtra(Constants.name).toString()

        val arrays : Button = findViewById(R.id.arrays)
        val strings : Button = findViewById(R.id.strings)
        val linkedList : Button = findViewById(R.id.linked_list)
        val stack : Button = findViewById(R.id.stacks)
        val queue : Button = findViewById(R.id.queue)
        val tree : Button = findViewById(R.id.tree)
        val graph : Button = findViewById(R.id.graph)

        arrays.setOnClickListener {
           startQuestionActivity(this,"Arrays")
        }

        strings.setOnClickListener {
            startQuestionActivity(this,"Strings")
        }
        linkedList.setOnClickListener {
            startQuestionActivity(this,"Linked List")
        }
        stack.setOnClickListener {
            startQuestionActivity(this,"Stack")
        }
        queue.setOnClickListener {
            startQuestionActivity(this,"Queue")
        }
        tree.setOnClickListener {
            startQuestionActivity(this,"Tree")
        }
        graph.setOnClickListener {
            startQuestionActivity(this,"Graph")
        }







    }

    private fun startQuestionActivity(context: Context, idx : String){
        val intent =  Intent(context,QuestionsActivity::class.java)
        intent.putExtra(Constants.topicSelected,idx)
        intent.putExtra(Constants.name,name)
        startActivity(intent)
        finish()
    }
}