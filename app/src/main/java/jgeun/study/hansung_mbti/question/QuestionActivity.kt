package jgeun.study.hansung_mbti.question

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import jgeun.study.hansung_mbti.MainActivity
import jgeun.study.hansung_mbti.R
import jgeun.study.hansung_mbti.databinding.ActivityQuestionBinding
import jgeun.study.hansung_mbti.result.ResultActivity
import jgeun.study.hansung_mbti.util.StatusBarUtil

class QuestionActivity : AppCompatActivity() {

    private val binding by lazy{
        ActivityQuestionBinding.inflate(layoutInflater)
    }

    private var index: Int = 1

    private val questionList = ArrayList<String>()
    private val firstAnswer = ArrayList<String>()
    private val secondAnswer = ArrayList<String>()

    private var mbti_EI = 0
    private var mbti_SN = 0
    private var mbti_FT = 0
    private var mbti_JP = 0

    private lateinit var personMBTI : String

    private val intentResult by lazy{
        Intent(this, ResultActivity::class.java)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        StatusBarUtil.setStatusBarColor(this, StatusBarUtil.StatusBarColorType.WHITE_STATUS_BAR)

        initQuestionList()
        initAnswer()

        binding.firstQuestion.setOnClickListener{
            checkMBTI(1)
            if(index >= questionList.size){
                defineMBTI()
                intentResult.putExtra("mbti", personMBTI)
                println("mbti결정: " + personMBTI)
                startActivity(intentResult)
                overridePendingTransition(0, 0);
                finish()
            }else{

                logMBTI()
                settingText()
            }
        }

        binding.secondQuestion.setOnClickListener{
            checkMBTI(2)
            if(index >= questionList.size){
                defineMBTI()
                println("defineMBTI: " + personMBTI)
                intentResult.putExtra("mbti", personMBTI)
                println("mbti결정: " + personMBTI)
                startActivity(intentResult)
                overridePendingTransition(0, 0);
            }else{
                logMBTI()
                settingText()
            }
        }
    }

    private fun defineMBTI(){
        if(mbti_EI > 0 && mbti_SN >0 && mbti_FT > 0 && mbti_JP > 0){
            personMBTI = "ESFJ"
        }else if(mbti_EI > 0 && mbti_SN >0 && mbti_FT > 0 && mbti_JP < 0){
            personMBTI = "ESFP"
        }else if(mbti_EI > 0 && mbti_SN >0 && mbti_FT < 0 && mbti_JP > 0){
            personMBTI = "ESTJ"
        }else if(mbti_EI > 0 && mbti_SN >0 && mbti_FT < 0 && mbti_JP < 0){
            personMBTI = "ESTP"
        }else if(mbti_EI > 0 && mbti_SN <0 && mbti_FT > 0 && mbti_JP > 0){
            personMBTI = "ENFJ"
        }else if(mbti_EI > 0 && mbti_SN <0 && mbti_FT > 0 && mbti_JP < 0){
            personMBTI = "ENFP"
        }else if(mbti_EI > 0 && mbti_SN <0 && mbti_FT < 0 && mbti_JP > 0){
            personMBTI = "ENTJ"
        }else if(mbti_EI > 0 && mbti_SN <0 && mbti_FT < 0 && mbti_JP < 0){
            personMBTI = "ENTP"
//            -------------------
        }else if(mbti_EI < 0 && mbti_SN >0 && mbti_FT > 0 && mbti_JP > 0){
            personMBTI = "ISFJ"
        }else if(mbti_EI < 0 && mbti_SN >0 && mbti_FT > 0 && mbti_JP < 0){
            personMBTI = "ISFP"
        }else if(mbti_EI < 0 && mbti_SN >0 && mbti_FT < 0 && mbti_JP > 0){
            personMBTI = "ISTJ"
        }else if(mbti_EI < 0 && mbti_SN >0 && mbti_FT < 0 && mbti_JP < 0){
            personMBTI = "ISTP"
        }else if(mbti_EI < 0 && mbti_SN <0 && mbti_FT > 0 && mbti_JP > 0){
            personMBTI = "INFJ"
        }else if(mbti_EI < 0 && mbti_SN <0 && mbti_FT > 0 && mbti_JP < 0){
            personMBTI = "INFP"
        }else if(mbti_EI < 0 && mbti_SN <0 && mbti_FT < 0 && mbti_JP > 0){
            personMBTI = "INTJ"
        }else if(mbti_EI < 0 && mbti_SN <0 && mbti_FT < 0 && mbti_JP < 0){
            personMBTI = "INTP"
        }else{
            personMBTI = ""
        }
    }

    private fun checkMBTI(checkNum: Int){
        println("index: " + index)
        when(index){
            1 -> {
                if (checkNum == 1){
                    mbti_JP -= 1
                }else{
                    mbti_JP += 1
                }
            }
            2 -> {
                if (checkNum == 1){
                    mbti_EI -= 1
                }else{
                    mbti_EI += 1
                }
            }
            3 -> {
                if (checkNum == 1){
                    mbti_EI += 1
                }else{
                    mbti_EI -= 1
                }
            }
            4 -> {
                if (checkNum == 1){
                    mbti_JP += 1
                }else{
                    mbti_JP -= 1
                }
            }
            5 -> {
                if (checkNum == 1){
                    mbti_FT += 1
                }else{
                    mbti_FT -= 1
                }
            }
            6 -> {
                if (checkNum == 1){
                    mbti_FT += 1
                }else{
                    mbti_FT -= 1
                }
            }
            7 -> {
                if (checkNum == 1){
                    mbti_JP += 1
                }else{
                    mbti_JP -= 1
                }
            }
            8 -> {
                if (checkNum == 1){
                    mbti_SN += 1
                }else{
                    mbti_SN -= 1
                }
            }
            9 -> {
                if (checkNum == 1){
                    mbti_SN += 1
                }else{
                    mbti_SN -= 1
                }
            }
            10 -> {
                if (checkNum == 1){
                    mbti_SN -= 1
                }else{
                    mbti_SN += 1
                }
            }
            11 -> {
                if (checkNum == 1){
                    mbti_EI -= 1
                }else{
                    mbti_EI += 1
                }
            }
            12 -> {
                if (checkNum == 1){
                    mbti_FT -= 1
                }else{
                    mbti_FT += 1
                }
            }
        }
    }

    private fun settingText(){
        binding.questionNum.text = (index+1).toString()
        binding.questionContent.text = questionList.get(index)
        binding.firstQuestionContent.text = firstAnswer.get(index)
        binding.secondQuestionContent.text= secondAnswer.get(index)

        index+=1
    }

    private fun logMBTI(){
        println("mbti_EI : " + mbti_EI)
        println("mbti_SN : " + mbti_SN)
        println("mbti_FT : " + mbti_FT)
        println("mbti_JP : " + mbti_JP)
    }

    private fun initQuestionList(){
        questionList.add("같이 조별과제할 때 더 힘든 사람은?")
        questionList.add("처음 간 카페에서 주문할 때")
        questionList.add("세상 아름다운 경치를 보면")
        questionList.add("긴 회의를 진행할 때 나는")
        questionList.add("슬픔을 나누면")
        questionList.add("시험결과가 처참할 때")
        questionList.add("해야 할 일이 생겼을 때")
        questionList.add("주로 듣는 음악은?")
        questionList.add("방근 본 영화에 대해 친구와 얘기할 때")
        questionList.add("친구한테 길 알려줄 때")
        questionList.add("약속을 잡을 때 나는")
        questionList.add("내가 좋아하는 사람은 대게")
    }

    private fun initAnswer(){
        firstAnswer.add("엄격하고 까탈스러운 꼰대")
        firstAnswer.add("자주 마시는 음료")
        firstAnswer.add("인증샷을 찍어 SNS 공유")
        firstAnswer.add("오늘 정한대로만 하자")
        firstAnswer.add("반이 된다")
        firstAnswer.add("그러려니 하고 받아들인다")
        firstAnswer.add("미리 다 하고 논다")
        firstAnswer.add("지금 가장 핫한 TOP 100")
        firstAnswer.add("출연배우와 줄거리를 자세히 이야기")
        firstAnswer.add("쭉 올라가서 큰 건물보이면\n왼쪽으로 가")
        firstAnswer.add("날짜를 띄엄띄엄 잡는 편")
        firstAnswer.add("스마트한 사람")

        secondAnswer.add("자기 할 일을 매번 까먹는 까마귀")
        secondAnswer.add("그 카페만의 독특한 음료")
        secondAnswer.add("더 자세히 들여다 본다")
        secondAnswer.add("진행되는 거 봐가면서 정하자")
        secondAnswer.add("슬픈 사람이 둘이 된다")
        secondAnswer.add("어디서부터 잘못된 건지 따져본다")
        secondAnswer.add("끝까지 미루다가 한다")
        secondAnswer.add("내 취향의 숨겨진 명곡")
        secondAnswer.add("감독의 제작 의도와 주제를\n짧게 이야기")
        secondAnswer.add("60m 직진해서 편의점끼고 우회전해")
        secondAnswer.add("연달아 잡는 편")
        secondAnswer.add("다정한 사람")
    }
}