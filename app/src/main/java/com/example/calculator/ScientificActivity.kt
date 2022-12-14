package com.example.calculator

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.button.MaterialButton
import java.util.*

var str:String=""
class ScientificActivity :AppCompatActivity(){
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_scientific)
        val btnC = findViewById<Button>(R.id.button_C)
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
        val btnDiv = findViewById<Button>(R.id.button_div)
        val btnMul = findViewById<Button>(R.id.button_mul)
        val btnPlus = findViewById<Button>(R.id.button_plus)
        val btnMinus = findViewById<Button>(R.id.button_minus)
        val btnEqual = findViewById<Button>(R.id.button_equal)
        val btnDot = findViewById<Button>(R.id.button_dot)
        val btnSqrt=findViewById<Button>(R.id.button_root)
        val btnSqr=findViewById<Button>(R.id.button_sqr)
        val btnPowXY=findViewById<Button>(R.id.button_xPowY)
        val btnLog=findViewById<Button>(R.id.button_log)
        btnC.setOnClickListener {
            str=""
            findViewById<TextView>(R.id.solution_tv).text="0"
        }
        btnEqual.setOnClickListener {
            var x=str+"/";
            var temp="";
            var nums: Queue<Int> = LinkedList<Int>()
            var sym: Queue<String> = LinkedList<String>()
            for(i in 0..x.length-1){
                if(x[i]>='0' && x[i]<='9')temp+=x[i]
                else{
                    sym.add(x[i].toString())
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
                        findViewById<TextView>(R.id.solution_tv).text=s
                    }
                }
                var s:String =nums.peek().toString();
                findViewById<TextView>(R.id.solution_tv).text=s
            }
        }
        extract(btn0);extract(btn1);extract(btn2);extract(btn3);extract(btn4);extract(btn5);extract(btn6);extract(btn7);
        extract(btn8);extract(btn9);extract(btnDiv);extract(btnMul);extract(btnPlus);extract(btnMinus);extract(btnDot);
        extract(btnSqrt);extract(btnSqr);extract(btnPowXY);extract(btnLog);
    }
     fun extract(btn:Button){
        btn.setOnClickListener {
            var txt=findViewById<TextView>(R.id.solution_tv)
            txt.text=btn.getText().toString()
            str+=findViewById<TextView>(R.id.solution_tv).getText().toString()
            findViewById<TextView>(R.id.solution_tv).setText(str)
        }

    }
}