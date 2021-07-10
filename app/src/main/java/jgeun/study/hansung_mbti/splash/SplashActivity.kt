package jgeun.study.hansung_mbti.splash

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import jgeun.study.hansung_mbti.MainActivity
import jgeun.study.hansung_mbti.R
import jgeun.study.hansung_mbti.databinding.ActivitySplashBinding
import jgeun.study.hansung_mbti.home.HomeActivity
import jgeun.study.hansung_mbti.loading.LoadingActivity
import jgeun.study.hansung_mbti.util.StatusBarUtil

class SplashActivity : AppCompatActivity() {
    private val handler = Handler(Looper.getMainLooper())
    private val binding by lazy{
        ActivitySplashBinding.inflate(layoutInflater)
    };
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        StatusBarUtil.setStatusBarColor(this, StatusBarUtil.StatusBarColorType.DEFAULT_STATUS_BAR)
        val runnable : Runnable = Runnable {
            startActivity(Intent(this, HomeActivity::class.java))
            overridePendingTransition(0, 0);
            finish()
        }

        handler.postDelayed(runnable,1500)
    }
}