package cn.tabll.foodsharing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_start_add.*
import org.jetbrains.anko.sdk27.coroutines.onClick

class StartAddActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start_add)
        confirm_button.onClick {
            finish()
        }
    }
}
