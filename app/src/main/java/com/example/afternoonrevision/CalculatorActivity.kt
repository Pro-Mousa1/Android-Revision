package com.example.afternoonrevision

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class CalculatorActivity : AppCompatActivity() {
    lateinit var mAnswer:TextView
    lateinit var mFirstNum:EditText
    lateinit var mSecondNum:EditText
    lateinit var mAdd:Button
    lateinit var mSub:Button
    lateinit var mMul:Button
    lateinit var mDiv:Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_calculator)
        mAnswer = findViewById(R.id.mTvAnswer)
        mFirstNum = findViewById(R.id.mEditFstNUm)
        mSecondNum = findViewById(R.id.mEditSndNum)
        mAdd = findViewById(R.id.mBtnAdd)
        mSub = findViewById(R.id.mBtnSub)
        mMul = findViewById(R.id.mBtnMul)
        mDiv = findViewById(R.id.mBtnDiv)
        mAdd.setOnClickListener {
            var firstnumber = mFirstNum.text.toString().trim()
            var secondnumber = mSecondNum.text.toString().trim()
            if (firstnumber.isEmpty() || secondnumber.isEmpty()){
                mAnswer.text = "You cannot leave it blank"
            }else{
                var jibu = firstnumber.toDouble() + secondnumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mSub.setOnClickListener {
            var firstnumber = mFirstNum.text.toString().trim()
            var secondnumber = mSecondNum.text.toString().trim()
            if (firstnumber.isEmpty() || secondnumber.isEmpty()){
                mAnswer.text = "You cannot leave it blank"
            }else{
                var jibu = firstnumber.toDouble() - secondnumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mMul.setOnClickListener {
            var firstnumber = mFirstNum.text.toString().trim()
            var secondnumber = mSecondNum.text.toString().trim()
            if (firstnumber.isEmpty() || secondnumber.isEmpty()){
                mAnswer.text = "You cannot leave it blank"
            }else{
                var jibu = firstnumber.toDouble() * secondnumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
        mDiv.setOnClickListener {
            var firstnumber = mFirstNum.text.toString().trim()
            var secondnumber = mSecondNum.text.toString().trim()
            if (firstnumber.isEmpty() || secondnumber.isEmpty()){
                mAnswer.text = "You cannot leave it blank"
            }else{
                var jibu = firstnumber.toDouble() / secondnumber.toDouble()
                mAnswer.text = jibu.toString()
            }
        }
    }
}