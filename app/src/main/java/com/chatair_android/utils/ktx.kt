package com.chatair_android.utils

import android.content.Context
import android.content.Intent
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity

fun AppCompatActivity.gotoActivity(context: Context, cls: Class<*>) {
    this.startActivity(Intent(context, cls))
}

fun Context.showLongToast(message: String) {
    Toast.makeText(this, message, Toast.LENGTH_LONG).show()
}