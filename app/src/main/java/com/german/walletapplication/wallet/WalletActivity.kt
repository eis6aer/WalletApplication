package com.german.walletapplication.wallet

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.constraintlayout.motion.widget.MotionLayout
import androidx.constraintlayout.motion.widget.MotionScene
import androidx.constraintlayout.motion.widget.TransitionAdapter
import com.german.walletapplication.R
import kotlinx.android.synthetic.main.activity_wallet.*

class WalletActivity : AppCompatActivity() {
    private var isSelectedCard = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_wallet)

        container.setTransitionListener(object : TransitionAdapter() {
            override fun onTransitionCompleted(motionLayout: MotionLayout, currentId: Int) {
                if (currentId == R.id.left || currentId == R.id.right) {
                    motionLayout.progress = 0f
                    motionLayout.setTransition(R.id.initialToLeft)
                }
            }
        })
    }
}