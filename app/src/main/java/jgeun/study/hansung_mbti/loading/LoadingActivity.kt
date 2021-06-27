package jgeun.study.hansung_mbti.loading

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import jgeun.study.hansung_mbti.MainActivity
import jgeun.study.hansung_mbti.R
import jgeun.study.hansung_mbti.databinding.ActivityLoadingBinding
import jgeun.study.hansung_mbti.question.QuestionActivity
import jgeun.study.hansung_mbti.util.StatusBarUtil
import kotlin.concurrent.thread

class LoadingActivity : AppCompatActivity() {
    private var progressIndex = 0
    private lateinit var binding : ActivityLoadingBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLoadingBinding.inflate(layoutInflater)
        setContentView(binding.root)

        StatusBarUtil.setStatusBarColor(this, StatusBarUtil.StatusBarColorType.DEFAULT_STATUS_BAR)

        thread (start= true){
            var i = 0
            while(progressIndex < 100){
                progressIndex += 1
                runOnUiThread{
                    binding.loadingProgressbar.progress = progressIndex
                }
                Thread.sleep(50)
            }
            startActivity(Intent(this, QuestionActivity::class.java))
            overridePendingTransition(0, 0);
        }
    }
}