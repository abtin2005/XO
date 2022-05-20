package com.xcode.xo

import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.View
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
    }

    fun onclick(view: View) {
        val btnc = view as Button
        var cell = 0
        when (btnc.id) {
            R.id.btn1 -> cell = 1
            R.id.btn2 -> cell = 2
            R.id.btn3 -> cell = 3
            R.id.btn4 -> cell = 4
            R.id.btn5 -> cell = 5
            R.id.btn6 -> cell = 6
            R.id.btn7 -> cell = 7
            R.id.btn8 -> cell = 8
            R.id.btn9 -> cell = 9
        }
        play(cell, btnc)
    }

    var player1 = ArrayList<Int>()
    var player2 = ArrayList<Int>()
    var actp = 1
    fun play(cell: Int, btnc: Button) {
        if (actp == 1) {
            btnc.text = "X"
            btnc.setBackgroundColor(Color.GREEN)
            player1.add(cell)
            actp = 2
        } else {
            btnc.text = "O"
            btnc.setBackgroundColor(Color.RED)
            player2.add(cell)
            actp = 1
        }
        btnc.isEnabled = false
    }

    fun Checkw() {
        var winner = -1

        //r1
        if (player1.contains(1) && player1.contains(2) && player1.contains(3)) {
            winner = 1
            if (player2.contains(1) && player2.contains(2) && player2.contains(3))
                winner = 2
            //r2
            if (player1.contains(4) && player1.contains(5) && player1.contains(6)) {
                winner = 1
                if (player2.contains(4) && player2.contains(5) && player2.contains(6))
                    winner = 2
                //3
                if (player1.contains(7) && player1.contains(8) && player1.contains(9)) {
                    winner = 1
                    if (player2.contains(7) && player2.contains(8) && player2.contains(9))
                        winner = 2
                    //c1
                    if (player1.contains(1) && player1.contains(4) && player1.contains(7))
                        winner = 1
                    if (player1.contains(1) && player1.contains(4) && player1.contains(7))
                        winner = 1
                    //c2
                    if (player1.contains(2) && player1.contains(5) && player1.contains(8)) {
                        winner = 1
                        if (player2.contains(2) && player2.contains(5) && player2.contains(8))
                            winner = 2
                        //c2
                        if (player1.contains(3) && player1.contains(6) && player1.contains(9)) {
                            winner = 1
                            if (player2.contains(3) && player2.contains(6) && player2.contains(9))
                                winner = 2
                        }
                    }
                }
            }
        }
    }
}
