package jgeun.study.hansung_mbti.util

import android.app.Activity
import android.os.Build
import android.view.View
import android.view.WindowInsetsController
import androidx.core.content.ContextCompat
import jgeun.study.hansung_mbti.R

class StatusBarUtil {
    enum class StatusBarColorType(val backgroundColorId: Int) {
        // 색 지정
        WHITE_STATUS_BAR(R.color.white),
        DEFAULT_STATUS_BAR(R.color.white),
        QUESTION_STATUS_BAR(R.color.questionBackgroundColor)
    }

    companion object{
        public fun setStatusBarColor(activity: Activity, colorType: StatusBarColorType){
            if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.LOLLIPOP) {
                if(Build.VERSION.SDK_INT >= Build.VERSION_CODES.R)
                    activity.window.insetsController?.setSystemBarsAppearance(
                        WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS,
                        WindowInsetsController.APPEARANCE_LIGHT_STATUS_BARS
                    )
                else
                    activity.window.decorView.systemUiVisibility = View.SYSTEM_UI_FLAG_LIGHT_STATUS_BAR
            }else{
                // 검은색
                activity.window.decorView.systemUiVisibility = 0
            }

            // 상태바 배경 색 지정
            activity.window.statusBarColor =
                ContextCompat.getColor(activity, colorType.backgroundColorId)
        }
    }
}