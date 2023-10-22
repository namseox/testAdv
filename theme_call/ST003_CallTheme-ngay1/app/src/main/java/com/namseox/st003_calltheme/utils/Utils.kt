package com.namseox.st003_calltheme.utils

import android.app.Activity
import android.os.Build
import android.view.WindowInsetsController
import android.view.WindowManager

object Utils {
    fun Activity.setFullScreen() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            this.window.insetsController?.let {
                it.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }
        } else {
            this.window.setFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
    }

    fun Activity.setDefaultScreen() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.R) {
            this.window.insetsController?.let {
//            it.show(WindowInsets.Type.statusBars())
//            it.systemBarsBehavior = WindowInsetsController.BEHAVIOR_SHOW_TRANSIENT_BARS_BY_SWIPE
            }
        } else {
            this.window.clearFlags(
                WindowManager.LayoutParams.FLAG_FULLSCREEN
            )
        }
    }
}