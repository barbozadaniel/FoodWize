package cn.tabll.foodsharing

import android.animation.Animator
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.design.widget.TabLayout
import android.support.v7.widget.CardView
import android.view.View
import android.view.ViewAnimationUtils
import kotlinx.android.synthetic.main.activity_login.*
import org.jetbrains.anko.doAsync
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity
import org.jetbrains.anko.uiThread

class LoginActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_login)

        init()
    }

    private fun init() {
        confirm_button.onClick {
            startActivity<MainActivity>()
        }

        confirm_signUp_button.onClick {
            startActivity<MainActivity>()
        }

        //Tab点击事件
        login_tabLayout.addOnTabSelectedListener(object : TabLayout.OnTabSelectedListener{
            override fun onTabReselected(tab: TabLayout.Tab?) { }
            override fun onTabUnselected(tab: TabLayout.Tab?) { }
            override fun onTabSelected(tab: TabLayout.Tab?) {
                when (login_tabLayout.selectedTabPosition) {
                    0 -> {
                        sign_up_cardView.visibility = CardView.GONE
                        sign_in_cardView.visibility = CardView.VISIBLE
                        animateCircularReveal(sign_in_cardView)
                    }
                    1 -> {
                        sign_in_cardView.visibility = CardView.GONE
                        sign_up_cardView.visibility = CardView.VISIBLE
                        animateCircularReveal(sign_up_cardView)
                    }
                }
            }
        })

        //短信验证码点击事件
        get_verification_button.setOnClickListener {
            phone_number_signUp_textView.isEnabled = false
            get_verification_button.isEnabled = false
            doAsync {
                //sendVerificationMessage() //发送验证码
                var secondLeft = 60 //短信发送等待时间
                while (secondLeft != 0) {
                    secondLeft--
                    uiThread {
                        get_verification_button.text = secondLeft.toString()
                    }
                    when (secondLeft) {
                        0 -> {
                            uiThread {
                                get_verification_button.isEnabled = true
                                get_verification_button.text = "获取验证码"
                            }
                        }
                        else -> Thread.sleep(1000)
                    }
                }
            }
        }
    }

    /**
     * 注册与登陆CardView的切换动画
     **/
    private fun animateCircularReveal(view: View){
        val cx = (view.right - view.left) / 2
        val cy = view.top
        val finalRadius = Math.max(view.width, view.height)
        val anim: Animator = ViewAnimationUtils.createCircularReveal(view, cx, cy, 200f, finalRadius.toFloat())
        anim.start()
    }

}
