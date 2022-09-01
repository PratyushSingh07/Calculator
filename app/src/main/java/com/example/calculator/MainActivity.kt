package com.example.calculator

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.button.MaterialButton
import android.widget.TextView
import android.widget.Button
import org.mozilla.javascript.ContextFactory
import java.lang.Exception
import org.mozilla.javascript.ScriptableObject

var stack=ArrayDeque<String>()
var z:String=""
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnC = findViewById<Button>(R.id.button_C)
        val bntAc = findViewById<Button>(R.id.button_AC)
        val btn0 = findViewById<Button>(R.id.button_0)
        val btn1 = findViewById<Button>(R.id.button_1)
        val btn2 = findViewById<Button>(R.id.button_2)
        val btn3 = findViewById<Button>(R.id.button_3)
        val btn4 = findViewById<Button>(R.id.button_4)
        val btn5 = findViewById<Button>(R.id.button_5)
        val btn6 = findViewById<Button>(R.id.button_6)
        val btn7 = findViewById<Button>(R.id.button_7)
        val btn8 = findViewById<Button>(R.id.button_8)
        val btn9 = findViewById<Button>(R.id.button_9)
        val btnOpen = findViewById<Button>(R.id.button_open)
        val btnClose = findViewById<Button>(R.id.button_close)
        val btnDiv = findViewById<Button>(R.id.button_div);
        val btnMul = findViewById<Button>(R.id.button_mul);
        val btnPlus = findViewById<Button>(R.id.button_plus);
        val btnMinus = findViewById<Button>(R.id.button_minus);
        val btnEqual = findViewById<Button>(R.id.button_equal)
        val btnDot = findViewById<Button>(R.id.button_dot)
        btnDot.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btnDot.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
            stack.addFirst(z)
        }
        btnEqual.setOnClickListener {
            getResult(btnEqual as MaterialButton)
        }
        btnMinus.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btnMinus.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
            stack.addFirst(z)
        }
        btnPlus.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btnPlus.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
            stack.addFirst(z)
        }
        btnMul.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btnMul.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
            stack.addFirst(z)
        }
        btnDiv.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btnDiv.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
            stack.addFirst(z)
        }
        btnOpen.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btnOpen.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
            stack.addFirst(z)
        }
        btnClose.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btnClose.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
            stack.addFirst(z)
        }
        btn9.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn9.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
            stack.addFirst(z)
        }
        btn8.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn8.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z);stack.addFirst(z)
        }
        btn7.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn7.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z);stack.addFirst(z)
        }
        btn6.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn6.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z);stack.addFirst(z)
        }
        btn5.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn5.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btn4.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn4.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
            stack.addFirst(z)
        }
        btn3.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn3.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
            stack.addFirst(z)
        }
        btn2.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn2.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
            stack.addFirst(z)
        }
        btn1.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn1.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
            stack.addFirst(z)
        }
        btn0.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn0.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
            stack.addFirst(z)
        }
        btnC.setOnClickListener {
            stack.clear()
            z=""
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = "0"
        }
    }
    fun getResult(btn:MaterialButton){
        if(stack.size>0){
            var a=stack.removeFirst();
            stack.removeFirst();
            var b=stack.removeFirst()
            var c:Int=a.toInt(); var d:Int=b.toInt();
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn.getText().toString()
            if(txt.text.equals("+")){
                val res=c+d;
                findViewById<TextView>(R.id.result_tv).setText(res)
            }
            else if(txt.text.equals("-")){
                val res=c-d;
                findViewById<TextView>(R.id.result_tv).setText(res)
            }
            else if(txt.text.equals("-")){
                val res=c*d;
                findViewById<TextView>(R.id.result_tv).setText(res)
            }
            else if(txt.text.equals("/")){
                val res=c/d;
                findViewById<TextView>(R.id.result_tv).setText(res)
            }
        }
    }
}
