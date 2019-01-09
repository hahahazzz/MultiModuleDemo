package com.citygreen.multimoduledemo

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife
import butterknife.OnClick
import com.alibaba.android.arouter.launcher.ARouter

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        ButterKnife.bind(this)
    }

    @OnClick(R.id.text_app_click)
    fun click(v: View) {
        when (v.id) {
            R.id.text_app_click -> {
                Toast.makeText(this, "App Toast", Toast.LENGTH_LONG).show()
                ARouter.getInstance().build("/test/test1").navigation()
            }
        }
    }
}
