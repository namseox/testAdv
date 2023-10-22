package com.namseox.st003_calltheme.ui.splash

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import com.namseox.st003_calltheme.MainActivity
import com.namseox.st003_calltheme.R
import com.namseox.st003_calltheme.ui.tutorial.TutorialActivity
import com.namseox.st003_calltheme.utils.Const
import com.namseox.st003_calltheme.utils.SharedPreferenceUtils
import com.namseox.st003_calltheme.utils.Utils.setDefaultScreen
import com.namseox.st003_calltheme.utils.Utils.setFullScreen

class SplashActivity : AppCompatActivity() {
    private val handler = Handler(Looper.myLooper()!!)
    private val runnable = Runnable {
        if(SharedPreferenceUtils.getInstance(applicationContext).getBooleanValue(Const.CHECKTUTORIAL)){
            startActivity(Intent(this, MainActivity::class.java))
        }else{
            startActivity(Intent(this, TutorialActivity::class.java))
        }
    }
override fun onCreate(savedInstanceState: Bundle?) {
    super.onCreate(savedInstanceState)
    setContentView(R.layout.activity_splash)
}

    override fun onStart() {
        super.onStart()
        handler.postDelayed(runnable, 1500)
    }

    override fun onPause() {
        super.onPause()
        handler.removeCallbacks(runnable)
    }

    override fun onDestroy() {
        super.onDestroy()

    }
}