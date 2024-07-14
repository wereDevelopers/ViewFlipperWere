package com.weredev.viewflipperwere_example

import android.os.Bundle
import android.os.CountDownTimer
import androidx.appcompat.app.AppCompatActivity
import com.weredev.binding_ui.viewBinding
import com.weredev.viewflipperwere_example.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private val binding by viewBinding(ActivityMainBinding::inflate)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        object : CountDownTimer(3000, 1000) {
            override fun onTick(millisUntilFinished: Long) {
            }

            override fun onFinish() {
                binding.viewFlipper.displayedChild = 0
            }
        }.start()

    }
}