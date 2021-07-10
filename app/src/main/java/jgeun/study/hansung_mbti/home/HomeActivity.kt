package jgeun.study.hansung_mbti.home

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import jgeun.study.hansung_mbti.databinding.ActivityHomeBinding
import jgeun.study.hansung_mbti.loading.LoadingActivity
import jgeun.study.hansung_mbti.question.QuestionActivity
import jgeun.study.hansung_mbti.util.StatusBarUtil

class HomeActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityHomeBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.homeLlStart.setOnClickListener{
            startActivity(Intent(this, LoadingActivity::class.java))

        }
        StatusBarUtil.setStatusBarColor(this, StatusBarUtil.StatusBarColorType.DEFAULT_STATUS_BAR)


    }
}