package jgeun.study.hansung_mbti.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import jgeun.study.hansung_mbti.MainActivity
import jgeun.study.hansung_mbti.R
import jgeun.study.hansung_mbti.loading.LoadingActivity
import jgeun.study.hansung_mbti.util.StatusBarUtil

class SplashActivity : AppCompatActivity() {
    private val handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        StatusBarUtil.setStatusBarColor(this, StatusBarUtil.StatusBarColorType.DEFAULT_STATUS_BAR)
        val runnable : Runnable = Runnable {
            startActivity(Intent(this, LoadingActivity::class.java))
        }

        handler.postDelayed(runnable,1500)
    }
}