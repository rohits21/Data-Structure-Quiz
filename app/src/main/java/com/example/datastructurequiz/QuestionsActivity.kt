package com.example.datastructurequiz

import android.annotation.SuppressLint
import android.content.Intent
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.ProgressBar
import android.widget.TextView
import android.widget.Toast
import org.w3c.dom.Text

class QuestionsActivity : AppCompatActivity() {


    private var ques:TextView ?= null
    private var op1:TextView ?= null
    private var op2:TextView ?= null
    private var op3:TextView ?= null
    private var op4:TextView ?= null
    private var explain:TextView ?= null

    private var btn:Button ?= null
    private var progress:ProgressBar ?= null
    private var progressText:TextView ?= null

    private var score = 0
    private var currentPosition:Int = 1
    lateinit var name : String

    lateinit var questionList: ArrayList<questions>


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_questions)

        val topic = intent.getStringExtra(Constants.topicSelected)
         name = intent.getStringExtra(Constants.name).toString()

        val heading = findViewById<TextView>(R.id.heading)
        heading.text = topic


        ques = findViewById<TextView>(R.id.questions)
        op1 = findViewById<TextView>(R.id.optionOne)
        op2 = findViewById<TextView>(R.id.optionTwo)
        op3 = findViewById<TextView>(R.id.optionThree)
        op4 = findViewById<TextView>(R.id.optionFour)

        explain = findViewById<TextView>(R.id.explanation)
        btn = findViewById<Button>(R.id.submitBtn)
        progress = findViewById<ProgressBar>(R.id.progressBar)
        progressText = findViewById<TextView>(R.id.progressText)

        if(topic == "Arrays"){
            questionList = Constants.getArrayQuiz()
        }

        if(topic == "Strings"){
            questionList = Constants.getStringQuiz()
        }

        if(topic == "Linked List"){
            questionList = Constants.getLinkedListQuiz()
        }

        if(topic == "Queue"){
            questionList = Constants.getQueueQuiz()
        }

        if(topic == "Stack"){
            questionList = Constants.getStackQuiz()
        }

        if(topic == "Tree"){
            questionList = Constants.getTreeQuiz()
        }

        if(topic == "Graph"){
            questionList = Constants.getGraphQuiz()
        }




        setQuestion()
    }

    private fun setQuestion(){

        val cur = questionList[currentPosition-1]
        ques?.text = cur.ques
        op1?.text = cur.op1
        op2?.text = cur.op2
        op3?.text = cur.op3
        op4?.text = cur.op4
        progressText?.text ="${currentPosition}/${questionList.size}"
        progress?.max = questionList.size

        selectopt(cur)
        explain?.visibility = View.GONE


    }

    private fun selectopt(cur:questions) {
        var selectedOp:Int = 0

        op1?.setOnClickListener {
            selectOption(it)
            selectedOp = 1
        }
        op2?.setOnClickListener {
            selectOption(it)
            selectedOp = 2
        }

        op3?.setOnClickListener {
            selectOption(it)
            selectedOp = 3
        }

        op4?.setOnClickListener {
            selectOption(it)
            selectedOp = 4
        }

        btn?.setOnClickListener {
            if(btn?.text == "Submit"){



                if(selectedOp == 0){
                    Toast.makeText(this, "Please select an option", Toast.LENGTH_SHORT).show()
                }
                else{
                    showans(selectedOp,cur)

                    if(currentPosition == questionList.size){
                        btn?.text = "Finish"
                    }
                    else{
                        btn?.text = "Next"
                    }

                }
            }

            if(btn?.text == "Next"){
                btn?.setOnClickListener {
                    currentPosition++
                    op1?.isClickable = true
                    op2?.isClickable = true
                    op3?.isClickable = true
                    op4?.isClickable = true
                    setQuestion()
                    op1?.setBackgroundResource(R.drawable.option_bg)
                    op2?.setBackgroundResource(R.drawable.option_bg)
                    op3?.setBackgroundResource(R.drawable.option_bg)
                    op4?.setBackgroundResource(R.drawable.option_bg)



                    btn?.text = "Submit"

                }
            }

            if(btn?.text == "Finish"){

                Constants.correctAnswer = score
                btn?.setOnClickListener {
                    val intent = Intent(this,EndActivity::class.java)
                    intent.putExtra(Constants.name,name)
                    startActivity(intent)
                    finish()
                }

            }
        }
    }

    @SuppressLint("ResourceAsColor")
    private fun showans(selectedOp: Int, cur:questions){



        op1?.isClickable = false
        op2?.isClickable = false
        op3?.isClickable = false
        op4?.isClickable = false



        explain?.text = cur.explanation
        explain?.visibility = View.VISIBLE
        progress?.progress = cur.id

        when( cur.correctOp ){
            1-> op1?.setBackgroundColor(Color.GREEN)
            2-> op2?.setBackgroundColor(Color.GREEN)
            3-> op3?.setBackgroundColor(Color.GREEN)
            4-> op4?.setBackgroundColor(Color.GREEN)

        }



        if(selectedOp != cur.correctOp){
            Toast.makeText(this, "Incorrect ans", Toast.LENGTH_SHORT).show()
            when( selectedOp ){
                1-> op1?.setBackgroundColor(Color.RED)
                2-> op2?.setBackgroundColor(Color.RED)
                3-> op3?.setBackgroundColor(Color.RED)
                4-> op4?.setBackgroundColor(Color.RED)
            }
        }
        else{
            score++
        }
    }

    private fun selectOption(view: View){
        op1?.setBackgroundResource(R.drawable.option_bg)
        op2?.setBackgroundResource(R.drawable.option_bg)
        op3?.setBackgroundResource(R.drawable.option_bg)
        op4?.setBackgroundResource(R.drawable.option_bg)
        view.setBackgroundResource(R.drawable.select)
    }

}