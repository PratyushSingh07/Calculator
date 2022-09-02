package com.example.calculator

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import com.google.android.material.button.MaterialButton
import android.widget.TextView
import android.widget.Button
import java.util.Queue
import java.util.LinkedList

var z:String=""
class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val btnC = findViewById<Button>(R.id.button_C)
        val bntSc = findViewById<Button>(R.id.button_SC)
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
        }
        btnEqual.setOnClickListener {
            var str= z+"/"
            var temp="";
            var nums: Queue<Int> = LinkedList<Int>()
            var sym:  Queue<String> = LinkedList<String>()
            for(i in 0..str.length-1){
                if(str[i]>='0' && str[i]<='9')temp+=str[i]
                else{
                    sym.add(str[i].toString())
                    nums.add(temp.toInt())
                    // println(temp)
                    temp=""
                    println(nums.peek())
                    println(sym.peek())
                    if(nums.size==2){
                        var a:Int=nums.remove()
                        var b:Int=nums.remove();
                        // println("$a $b ")
                        var exp=sym.remove();
                        if(exp=="+")nums.add(a+b)
                        else if(exp=="-")nums.add(a-b)
                        else if(exp=="*")nums.add(a*b)
                        else if(exp=="/")nums.add(a/b)
                        var s:String =nums.peek().toString();
                        findViewById<TextView>(R.id.result_tv).text=s
                    }
                }
                var s:String =nums.peek().toString();
                findViewById<TextView>(R.id.result_tv).text=s
            }
        }
        btnMinus.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btnMinus.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btnPlus.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btnPlus.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btnMul.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btnMul.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btnDiv.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btnDiv.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btnOpen.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btnOpen.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btnClose.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btnClose.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btn9.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn9.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btn8.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn8.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btn7.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn7.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btn6.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn6.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
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
        }
        btn3.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn3.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btn2.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn2.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btn1.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn1.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btn0.setOnClickListener {
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = btn0.getText().toString()
            z+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(z)
        }
        btnC.setOnClickListener {
            z=""
            var txt = findViewById<TextView>(R.id.solution_tv)
            txt.text = "0"
            var res=findViewById<TextView>(R.id.result_tv)
            res.text="0"
        }
        bntSc.setOnClickListener {
            val intent=Intent(this,ScientificActivity::class.java)
            startActivity(intent)
//             findViewById<TextView>(R.id.result_tv).text="pratyush sexy"
        }
    }
}
