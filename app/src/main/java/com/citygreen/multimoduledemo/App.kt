package com.citygreen.multimoduledemo

import android.app.Application
import com.alibaba.android.arouter.launcher.ARouter

/**
 * @Author: QiuGang
 * @Date : 2019/1/9 17:32
 * @Email : 1607868475@qq.com
 * @Record:
 *
 */
class App : Application() {
    override fun onCreate() {
        super.onCreate()
        ARouter.openDebug()
        ARouter.openLog()
        ARouter.init(this)
    }
}