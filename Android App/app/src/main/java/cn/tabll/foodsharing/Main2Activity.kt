package cn.tabll.foodsharing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.support.v7.widget.LinearLayoutManager
import kotlinx.android.synthetic.main.app_bar_main.*
import cn.tabll.foodsharing.tools.ListAdapter
import kotlinx.android.synthetic.main.activity_main2.*
import org.jetbrains.anko.sdk27.coroutines.onClick
import org.jetbrains.anko.startActivity
import java.util.ArrayList


class Main2Activity : AppCompatActivity() {



    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main2)
        setSupportActionBar(toolbar)
        initData()
        confirm_button.onClick {
            startActivity<Main3Activity>()
        }
    }

    private fun initData() {
        //模拟数据
        val data:ArrayList<String> = ArrayList()
        data.add("salad")
        data.add("pudding")
        data.add("burger")
        data.add("sushi")
        data.add("HongKong noodles")
        data.add("sandwish")
        data.add("hamburger")
        data.add("cabbage")
        data.add("salad")
        data.add("pudding")
        data.add("burger")
        data.add("sushi")
        data.add("HongKong noodles")
        data.add("sandwish")
        data.add("hamburger")
        data.add("cabbage")
        data.add("salad")
        data.add("pudding")
        data.add("burger")
        data.add("sushi")
        data.add("HongKong noodles")
        data.add("sandwish")
        data.add("hamburger")
        data.add("cabbage")
        data.add("salad")
        data.add("pudding")
        data.add("burger")
        data.add("sushi")
        data.add("HongKong noodles")
        data.add("sandwish")
        data.add("hamburger")
        data.add("cabbage")

        val adapter = ListAdapter(this)
        val linearManager = LinearLayoutManager(this)
        list_main.layoutManager = linearManager
        list_main.adapter = adapter
        adapter.setData(data)
    }
}
