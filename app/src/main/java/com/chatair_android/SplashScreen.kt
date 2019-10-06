package com.chatair_android

import android.content.Intent
import android.os.AsyncTask
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.widget.ProgressBar


class SplashScreen : AppCompatActivity() {
    private lateinit var progressBar:ProgressBar
    private val loadingTime = 3000L // 3 Seconds
    private lateinit var handler: Handler
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash_screen)
        progressBar = findViewById(R.id.progressBar)

        Thread(Runnable {
            doProgress()
            goToMain()
        }).start()

    }
    fun doProgress(){
        var progress = 0
        while (progress < 100) {
            try {
                Thread.sleep(loadingTime/10)
                progressBar.setProgress(progress)
            } catch (e: Exception) {
                e.printStackTrace()
            }

            progress += 10
        }
    }
    private fun goToMain(){
        val mainActIntent = Intent(applicationContext,MainActivity::class.java)
        startActivity(mainActIntent)
        finish()
    }
}
