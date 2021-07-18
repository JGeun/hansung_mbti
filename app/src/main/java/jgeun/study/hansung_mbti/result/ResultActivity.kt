package jgeun.study.hansung_mbti.result

import android.content.Intent
import android.graphics.drawable.Drawable
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.res.ResourcesCompat
import jgeun.study.hansung_mbti.R
import jgeun.study.hansung_mbti.databinding.ActivityResultBinding
import jgeun.study.hansung_mbti.home.HomeActivity
import jgeun.study.hansung_mbti.util.StatusBarUtil

class ResultActivity : AppCompatActivity() {
    private val binding by lazy{
        ActivityResultBinding.inflate(layoutInflater)
    }

    private lateinit var mbti : String
    private lateinit var mbtiImage : Drawable
    private lateinit var title : String
    private lateinit var hashtag : String
    private lateinit var mbtiTitle : String
    private lateinit var contents : String
    private lateinit var positiveMBTI : String
    private lateinit var positiveImage : Drawable
    private lateinit var negativeMBTI : String
    private lateinit var negativeImage : Drawable

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        StatusBarUtil.setStatusBarColor(this, StatusBarUtil.StatusBarColorType.WHITE_STATUS_BAR)

        mbti = intent.getStringExtra("mbti").toString()
//        mbti = "ISFJ"
        initResult()
        binding.title.text = title
        binding.mbtiTitle.text = mbtiTitle
        binding.mbtiImage.setImageDrawable(mbtiImage)
        binding.contents.text = contents
        binding.hashtag.text = hashtag
        binding.positiveTitle.text = positiveMBTI
        binding.positiveImage.setImageDrawable(positiveImage)
        binding.negativeTitle.text = negativeMBTI
        binding.negativeImage.setImageDrawable(negativeImage)
        binding.btnHome.setOnClickListener{
            finish()
        }
    }

    override fun onBackPressed() {
        super.onBackPressed()
        finish()
    }

    private fun initResult(){
        when(mbti){
            "ESFJ" -> {
                title = "우리 싸우지 말자"
                mbtiTitle = "평화주의자"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_esfj, null)!!
                hashtag = "#좋은게 좋은거여 #괜찮아 #내 앞에 적은 없다"
                contents = "당신의 부기는 한없이 다정하며 자신을 앞세우기보다는 여유있게 일상을 즐기는 편입니다.\\n\\n매 경우마다 생각이 많아 사소한 일이라도 최적의 경우의 수를 생각하려고 합니다.\\n\\n따라서 위기대처 능력이 좋고, 새로운 사람들을 만나는 것을 좋아한다.\\n\\n또한, 사람의 대한 정도 매우 많기에 거절을 잘 못하는 편이라 때론 힘든 경우도 꽤 있어요."
                positiveMBTI = "믿음직한 리더형"
                negativeMBTI = "모두와 OK"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_entj, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_all_ok, null)!!
            }
            "ESFP" -> {
                title = "활력 생산소"
                mbtiTitle = "에너자이저"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_esfp, null)!!
                hashtag = "#긍정 에너지 #인간 건전지"
                contents = "당신의 부기는 넘치는 에너지로 각종 문제 해결 능력이 뛰어난 편입니다.\n\n 근심이 없으며 긍정적인 에너지로 옆에 있는 사람도 괜스레 같이 기분이 좋아지게 만듭니다. \n\n" +
                        "넘치는 에너지로 장난끼가 많아 보여 가볍게 행동한다고 볼 수도 있지만, 그 이면에는 매우 조심스럽고 신중하게 고민하면서 행동합니다.\n\n" +
                        "항상 에너지가 넘치면 좋겠지만, 막상 기분이 다운되면,  우울함의 강도가 세지만 그만큼 회복력도 강하기 때문에 본인만의 방식으로 쉽게 풀어나갑니다.\n\n"
                positiveMBTI = "게으른 완벽주의자"
                negativeMBTI = "모두와 OK"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_infp, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_all_ok, null)!!
            }
            "ESTJ" -> {
                    title = "내 앞을 막지 못해"
                    mbtiTitle = "냉철한 불도저"
                    mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_estj, null)!!
                    hashtag = "#맞는 말 #어느 순간 고개를 끄덕이고 있다 #논리왕 부기"
                    contents = "당신의 상찌는 나 자신만을 믿는 유형으로 자신의 주장을 펼치는 능력이 탁월합니다.\n\n" +
                            "최대한 모든 사실 그리고 세세한 요인들까지 파헤쳐 객관적인 근거들을 마련하고, 이를 통해 타인에게 본인의 의견을 잘 설득시킵니다.\n\n" +
                            "이처럼 너무 현실적으로 다가가다 보니 가끔 친구 혹은 지인들의 고민을 들어줄 때 갈등을 빚을 때가 있습니다.\n\n" +
                            "하지만, 그만큼 합리적인 주장이니 중대한 결정 같은 상황에 빛을 발휘합니다.\n\n"
                positiveMBTI = "엄격한 실용주의자"
                negativeMBTI = "해맑은 호기심쟁이"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_infj, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_isfp, null)!!
            }
            "ESTP" -> {
                title = "두드려야, 문이 열릴 것이다"
                mbtiTitle = "용감한 탐험가"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_estp, null)!!
                hashtag = "#오직 직진 #YOLO #내가 가는 길이 곧 길이요"
                contents = "당신의 냥이는 새로운 일을 추진하는데 주저함이 없는 타입입니다.\n\n 잘못된 것은 잘못되었다고 직설적으로 말하는 유형이라 가끔 갈등을 빚을 때도 있습니다.\n\n" +
                        "미래의 나보다 지금의 나를 더 챙기는 것이 중요하다고 생각하여 하고 싶은 일을 서슴없이 추진합니다.\n\n" +
                        "새롭거나 남들이 잘 알지 못하는 분야에 관심이 많으며 그로 인해 얻은 지식혹은 물품들을 주변에게 알려주면서 뿌듯함을 느낍니다.\n\n"
                positiveMBTI = "잡념부자"
                negativeMBTI = "게으른 완벽주의자"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_isfj, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_infp, null)!!
            }
            "ENFJ" -> {
                title = "그럴수 있지"
                mbtiTitle = "따뜻한 상담가"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_enfj, null)!!
                hashtag = "#날개 없는 천사 #인간 시리/빅스비"
                contents = "당신의 상찌는 사람들과 대화하기를 좋아하는 타입입니다.\n\n 공감능력이 뛰어나 상대방이 무엇을 원하는지 잘 잡아내며 말쏨씨도 좋아 듣는 이가 편하게 들을 수 있습니다.\n\n" +
                        "또한, 상담을 해주면 그저 고객만 끄덕이며 상대 말에 동의하는 것이 아닌 본인의 상황에 빗대어 경험과 함께 조언을 해줍니다.\n\n" +
                        "그렇다고 너무 다른 사람들을 위해 공감을 해준다면, 자신까지 무겁고 복잡해지니 때론 자신에게도 집중해주고 공감해주어야 한다.\n\n"
                positiveMBTI = "평화주의자"
                negativeMBTI = "모두와 OK"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_esfj, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_all_ok, null)!!
            }
            "ENFP" -> {
                title = "친구가 있어서 인생도 즐거워 !"
                mbtiTitle = "사교력 갑"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_enfp, null)!!
                hashtag = "#친구 빼면 시체 #자유로운 영혼 #즐거운게 최고야"
                contents = "당신의 냥이는 누구와도 친구가 될 수 있으며 모 든 일을 즐기면서 하는 타입입니다.\n\n" +
                        "매사에 활발하고 사람을 좋아하는 당신의 냥이는 타인과의 관계에서 우정을 가장 중요한 가치로 여기며, 집단 생활을 통해 타인을 만나면서 에너 지를 얻습니다.\n\n" +
                        "어떤 방면에서든 다재다능한 당신의 냥이는 특히 타인을 설득하는 것에 소질이 있어 회의나 토론 에서 본인의 의견을 논리적으로 표현하는 것에 능합니다.\n\n"+
                        "다소 변덕쟁이인 면이 있지만 인생은 즐거워야 한다는 주의이므로 후회는 잘 하지 않습니다.\n\n"
                positiveMBTI = "만능 회사원"
                negativeMBTI = "사회적 거리두기\n최강자"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_istp, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_istj, null)!!
            }
            "ENTJ" -> {
                title = "나를 따르라"
                mbtiTitle = "믿음직한 리더형"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_entj, null)!!
                hashtag = "#나만 믿으라구 #열정 #허당끼"
                contents = "당신의 부기는 외향적으로 혼자 시간을 보내는 것보다 남들과 같이 있는 것을 더 선호합니다.\n\n" +
                        "이러한 성향 때문에 다른 사람보다 앞장서서 리드하는 능력이 뛰어납니다. \n\n" +
                        "효율적인 것을 좋아해 시간, 계획 관리를 철저히 하며 계속해서 무언가 해내려는 열정이 넘칩니다. \n\n" +
                        "은근히 카리스마도 있고, 현실성을 고려하다 보니 가끔 타인의 감정을 공감을 못할 때도 있습니다. \n\n" +
                        "문제 해결측면에서는 냉정하게 보일 수 있지만, 그외 다른 상황에서 순진한 허당끼를 보여주는 귀여운 면도 있습니다.\n\n"
                positiveMBTI = "평화주의자"
                negativeMBTI = "독창주의자"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_esfj, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_entp, null)!!
            }
            "ENTP" -> {
                title = "인간을 믿지 않아"
                mbtiTitle = "독창주의자"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_entp, null)!!
                hashtag = "#내 자신을 믿는다 #굳건한 결심 #나는 ‘최강’이다"
                contents = "당신의 부기는 독창적인 아이디어로 모든 상황을 파악하고 자신의 아이디어를 강하게 어필하는 마이웨이형 부기입니다.\n\n" +
                        "따라서 사람에게 정을 붙이는데 오랜 시간이 걸릴 수는 있으나 친해진다면, 그 누구보다 의리있는 친구가 되어줄 것입니다.\n\n"
                positiveMBTI = "사회적 거리두기\n최강자"
                negativeMBTI = "만능 회사원"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_istj, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_istp, null)!!
            }
//            -------------------
            "ISFJ" -> {
                title = "내 집에서 노는게 제일 좋아~"
                mbtiTitle = "집순이"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_isfj, null)!!
                hashtag = "#이불 밖은 위험해 #집에서 할 수 있는게 얼마나 많은데"
                contents = "당신의 부기는 상대를 알기 전까지 자신을 잘 드러내지 않고 남이 나를 어떻게 생각하지에 대해 고민이 많은 부기에요.\n\n" +
                        "소유욕이 적으며 생각이 많은데 비해 실행력이 없는 타입입니다.\n\n" +
                        "혼자만의 시간을 갖는 것을 좋아하고, 같이하는 것 보다 홀로 일을 해결하는 것이 더욱 편하다고 느낍니다.\n\n" +
                        "하지만, 협동심이 없는 것이 아니기에 막상 같이 일을 하기 시작하면 가장 적극적으로 참여하는 사람이랍니다.\n\n"
                positiveMBTI = "냉철한 불도저"
                negativeMBTI = "낯가림 최강자"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_estj, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_intp, null)!!
            }
            "ISFP" -> {
                title = "오늘은 또 무슨 일이 일어날까?"
                mbtiTitle = "해맑은 호기심쟁이"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_isfp, null)!!
                hashtag = "#궁금한건 못참아 #새로운 일이 좋아 #천방지축"
                contents = "당신의 꾸꾸는 상상력이 풍부하며 다재다능하 고 사람들에게 친절을 베푸는 걸 좋아하는 타입 입니다.\n\n" +
                        "무엇이든 직접 해봐야 직성이 풀리는 성격인 당 신의 꾸꾸는 새로운 자극을 신선하게 받아들이며 이를 탐구하는 것에 흥미를 가지지만 동시에 안정적인 것을 추구하기 때문에 변화보다는 지 금 이대로의 상태에 머무는 것을 좋아합니다.\n\n" +
                        "호기심이 많은 당신의 꾸꾸는 임기 응변이 뛰어 나고 두뇌회전이 빨라 난관에 창의적으로 접근 하며, 이를 통해 다양한 해결책을 낼 수 있습니 다.\n\n" +
                        "다만 시간이 지날 수록 흥미를 유지하는 끈기가 부족하며 언어에 살짝 약한 모습을 보일 수 있 습니다.\n\n"
                positiveMBTI = "용감한 탐험가"
                negativeMBTI = "냉철한 불도저"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_estp, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_estj, null)!!
            }
            "ISTJ" -> {
                title = "혼자있는게 제일 좋아"
                mbtiTitle = "사회적 거리두기 최강자"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_istj, null)!!
                hashtag = "#고독하구만 #홀로 자유로움을 추구 #독립적"
                contents = "당신의 꼬꼬는 조용하고 개인적인 공간을 좋아하는 타입입니다.\n\n" +
                        "스트레스를 받으면 본인만의 공간&방식이 있으며, 그곳에서 아무 방해 없이 힐링하는 것을 즐깁니다.\n\n"+
                        "이때, 문제가 있었다면 무엇부터 잘못되었는지 혼자서 되짚어보며, 해결책을 찾아냅니다. \n\n"
                positiveMBTI = "독창주의자"
                negativeMBTI = "사교력 갑"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_entp, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_enfp, null)!!
            }
            "ISTP" -> {
                title = "든든한 우리 팀원들과 함께라면 저도 걱정 없어요 !"
                mbtiTitle = "만능 회사원"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_istp, null)!!
                hashtag = "#맡겨만 주세요 #인생은 함께야 #인간 스펀지"
                contents = "당신의 꾸꾸는 책임감과 공동체의식이 강한 타입으로, 자신만의 신념을 관철하면서도 사 람들과 함께 어울려 살아가는 것을 중요하게 생각하는 협동가입니다.\n\n"+
                        "해야 할 것, 하지 말아야 할 것을 명확하게 구분할 줄 알고 자신의 능력을 객관적으로 잘 판단하여 일과 사회생활에 능숙한 면모가 나타납니다.\n\n" +
                        "다만 천성적으로 밝고 타인에게 의지하는 성 향으로 홀로 남겨져 있는 상황을 견디기 힘 들어하고 비난을 받아들이는 것에 어려운 모 습을 보일 수 있습니다. \n\n"
                positiveMBTI = "에너자이저"
                negativeMBTI = "독창주의자"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_esfp, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_entp, null)!!
            }
            "INFJ" -> {
                title = "어제 내가 뭘하고 왔더라"
                mbtiTitle = "잡념부자"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_infj, null)!!
                hashtag = "#오늘 강의 들었나 #혀 위치는 왜 가운데일까 #내 점수는 왜 이럴까"
                contents = "당신의 부기는 필요하거나 원하는 일을 끝까지 해내며 계획적인 편입니다. 그러나 그 일을 끝까지 해내는데 있어 잡념이 많은 타입입니다.\n\n"  +
                        "갑자기 이전 일에 대한 생각이나 아무 의미 없는 생각에 빠져서 깊게 탐구를 하지만, 이는 극히 자연스러운 행동이니 이를 두고 스트레스를 받을 필요가 없습니다.\n\n" +
                        "잡념을 그만둬야겠다 보다는 잡념을 하고 있다라는 사실을 그대로 두는 것이 더욱 마음이 편하며 오히려 그 잡념 속에서 예상치 못한 해결책을 찾을 수도 있을 것입니다.\n\n"
                positiveMBTI = "해맑은 호기심쟁이"
                negativeMBTI = "엄격한 실용주의자"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_isfp, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_intj, null)!!
            }
            "INFP" -> {
                title = "아직은 때가 아니다"
                mbtiTitle = "게으른 완벽주의자"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_infp, null)!!
                hashtag = "#색연필 색순서 정리 담당 #완벽한 준비"
                contents = "당신의 냥이는 조용하고 친근한 타입의 냥입니다. 완벽을 추구하면서도 게으른 모순적인 면모를 보여줍니다.\n\n" +
                        "일을 시작하려고 하면 철저하게 준비하려는 성향과 완벽히 마무리를 지었을 때, 얻는 희열감과 만족감을 느낍니다.\n\n" +
                        "그렇지만, 실수가 두렵고 불안해서 본인 기준에 만족되지 않으면 일을 자주 미루는 경향이 있습니다. \n\n" +
                        "만약, 처음부터 모든 것이 마음에 들 수 없음을 인정하게 되면, 두려움을 많이 극복하고 편하게 일을 수행할 수 있을 것입니다!\n\n"
                positiveMBTI = "사교력 갑"
                negativeMBTI = "용감한 탐험가"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_enfp, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_estp, null)!!
            }
            "INTJ" -> {
                title = "어쩔 수 없이 또 내가 나서야겠군 !"
                mbtiTitle = "엄격한 실용주의자"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_intj, null)!!
                hashtag = "#브레인은 바로 나 #실용적인게 최고 #백퍼센트 이과"
                contents = "당신의 부기는 실용적이지 못한 모든 일에 무관심하며 호불호가 강한 확실한 부기입니다.\n\n" +
                        "이 부기는 리더를 나서서 하지는 않지만 자신의 속한 팀의 진행속도가 답 답해지면 어느 순간 리더의 자리를 꿰차 팀의 효율을 높입니다.\n\n" +
                        "자신의 능력에 대한 자신감이 높아 자연히 성취도도 좋 은 편이며, 행동으로 실천하는 것을 꺼리지 않는 모습 을 보입니다.\n\n" +
                        "또 일을 순서에 따라 신중하게 계획하고 처리할 줄 알며, 이를 통해 얼핏 완벽주의자인 성향도 볼 수 있습니다.\n\n" +
                        "그러나 냉철한 모습과는 다르게 이 부기는 자신의 사람 이라고 생각되는 사람에게 진심 어린 조언으로 마음을 표현하는 가슴 따뜻한 부기랍니다\n\n"
                positiveMBTI = "낯가림 최강자"
                negativeMBTI = "잡념부자"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_intp, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_infj, null)!!
            }
            "INTP" -> {
                title = "먼저 말 걸어주면 좋아"
                mbtiTitle = "낯가림 최강자"
                mbtiImage = ResourcesCompat.getDrawable(resources, R.drawable.img_intp, null)!!
                hashtag = "#어색어색 #뭐라고 말해야할지 #알고보면 핵인싸"
                contents = "당신의 상찌는 차분하게 인생을 관찰하는 타입입 니다. 새로운 환경이나 사람을 만났을 때, 조용하 며 적극적인 행동을 보이지 않습니다.\n\n" +
                        "하지만,그 렇다 해서 인관관계가 서툰 것이 아니라 억지로 대답하며 반응하는 것이 더욱 어색하게 느껴지기 때문에 말 수가 적어지게 되는 것입니다.\n\n" +
                        "하지만 이를 극복하고 가까워 진다면, 이렇게 인 싸력을 가진 사람인가 싶을 정도로 다른 모습을 보입니다.\n\n" +
                        "또한, 가까워 지는 기간동안 상황을 지 켜보며 뛰어난 분석력과 관찰력을 보여 상대에 대 한 고민을 잘 해결주는 듬직한 면모가 있습니다.\n\n"
                positiveMBTI = "따듯한 상담가"
                negativeMBTI = "집순이"
                positiveImage = ResourcesCompat.getDrawable(resources, R.drawable.img_enfj, null)!!
                negativeImage = ResourcesCompat.getDrawable(resources, R.drawable.img_isfj, null)!!
            }
        }
    }
}