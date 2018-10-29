package cn.tabll.foodsharing

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.provider.AlarmClock
import android.view.View
import android.widget.EditText
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_start.*
import org.jetbrains.anko.*
import org.jetbrains.anko.custom.customView
import org.jetbrains.anko.sdk27.coroutines.onClick

class StartActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_start)
        init()
    }

    private fun init(){
        confirm_button.onClick {
            startActivity<LoginActivity>()
        }
        cardView5.onClick {
            startActivity<StartAddActivity>()
        }



        //cardView.onClick {
        //    alert {
        //        customView {
        //            linearLayout{
        //                orientation = LinearLayout.VERTICAL
        //                textInputLayout {
        //                    editTextView = editText (productions[position].name) {
        //                        hint = "自定义设备名称"
        //                        singleLine = true
        //                    }
        //                }
        //                textView {
        //                    padding = dip(5)
        //                    hint = "未知设备型号"
        //                    if (!productions[position].type.isEmpty()){
        //                        text = String.format(view.resources.getString(R.string.production_type_is), productions[position].type)
        //                    }
        //                }
        //                textView {
        //                    padding = dip(5)
        //                    hint = "设备状态异常"
        //                    if (!productions[position].state.isEmpty()) {
        //                        text = String.format(view.resources.getString(R.string.production_state_is), productions[position].state)
        //                    }
        //                }
        //                textView {
        //                    padding = dip(5)
        //                    hint = "无使用寿命信息"
        //                    if (!productions[position].wastage.isEmpty()) {
        //                        text = String.format(view.resources.getString(R.string.production_wastage_is), productions[position].wastage)
        //                    }
        //                }
        //                textView {
        //                    padding = dip(5)
        //                    hint = "无设备制造商信息"
        //                    if (!productions[position].manufacturer.isEmpty()) {
        //                        text = String.format(view.resources.getString(R.string.production_manufacturer_is), productions[position].manufacturer)
        //                    }
        //                }
        //                textView {
        //                    padding = dip(5)
        //                    hint = "设备ID信息出错"
        //                    if (!productions[position].id.isEmpty()) {
        //                        text = String.format(view.resources.getString(R.string.production_id_is), productions[position].id)
        //                    }
        //                }
        //                padding = dip(20)
        //            }
        //        }
        //        title = "设备信息"
        //        positiveButton("OK", {
        //            //productions[position].name = editTextView!!.text.toString()
        //            //notifyItemChanged(position)
        //            //view.context.toast("已更改")
        //        })
        //    }.show()
        //}
        cardView.setOnClickListener {
            var editTextView: EditText? = null
            alert {

                title = "MORE INFORMATION"
                customView{
                    linearLayout {
                        orientation = LinearLayout.VERTICAL
                        textView {
                            text = "        NO. of people: 16"
                        }.lparams()

                        textView {
                            text = "        Dishes: BURGER and SANDWISH"
                        }

                        textView {
                            text = "        Time: from 13:20 - 14:20"
                        }

                        textView {
                            text = "        Location: Happy Market, 99 Melrose Street, Belfast"
                        }


                    }
                }
                positiveButton("OK", {

                })
            }.show()
        }
    }

    private fun infoImageClickListener(view: View){

    }
}
