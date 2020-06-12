package com.german.walletapplication

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.german.walletapplication.wallet.*
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        scene1_part1.setOnClickListener {
            startActivity(Intent(this, Scene1Part1Activity::class.java)) }
        scene1_part2.setOnClickListener {
            startActivity(Intent(this, Scene1Part2Activity::class.java)) }
        scene1_part3.setOnClickListener {
            startActivity(Intent(this, Scene1Part3Activity::class.java)) }
        scene1.setOnClickListener {
            startActivity(Intent(this, Scene1Activity::class.java)) }
        scene2_part1.setOnClickListener {
            startActivity(Intent(this, Scene2Part1Activity::class.java)) }
        scene2_part2.setOnClickListener {
            startActivity(Intent(this, Scene2Part2Activity::class.java)) }
        button_wallet.setOnClickListener {
            startActivity(Intent(this, WalletActivity::class.java)) }
    }
}