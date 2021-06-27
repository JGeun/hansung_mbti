package jgeun.study.hansung_mbti.result

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import jgeun.study.hansung_mbti.R
import jgeun.study.hansung_mbti.databinding.ActivityResultBinding

class ResultActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityResultBinding.inflate(layoutInflater)
    }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val mbti = intent.getStringExtra("mbti")
        Log.d("result", mbti.toString())
        setContentView(binding.root)
    }
}