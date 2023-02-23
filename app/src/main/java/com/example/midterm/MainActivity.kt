package com.example.midterm

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        fun towerOfHanoi(n: Int, from: Char, to: Char, aux: Char) {
            if (n == 1) {
                return
            }
            towerOfHanoi(n-1, from, aux, to)
            towerOfHanoi(n-1, aux, to, from)
        }

        fun main() {
            val n = 3
            towerOfHanoi(n, 'A', 'B', 'C')
        }
        main()

    }
}