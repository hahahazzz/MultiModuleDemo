package com.citygreen.modulea

import android.os.Bundle
import android.view.View
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import butterknife.ButterKnife
import butterknife.OnClick
import com.alibaba.android.arouter.facade.annotation.Route

@Route(path = "/test/test1")
class ModuleAMainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_module_a_main)
        ButterKnife.bind(this)
    }

    @OnClick(R2.id.text_module_a_click)
    fun click(v: View) {
        when (v.id) {
            R.id.text_module_a_click -> {
                Toast.makeText(this, "ModuleA Toast", Toast.LENGTH_LONG).show()
            }
        }
    }
}
