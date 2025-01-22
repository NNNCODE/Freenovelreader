package com.woodnoisu.reader.ui.me

import android.app.AlertDialog
import android.content.Intent
import android.net.Uri
import com.woodnoisu.reader.R
import com.woodnoisu.reader.base.BaseFragment
import com.woodnoisu.reader.constant.Constant
import com.woodnoisu.reader.utils.FileUtil
import com.woodnoisu.reader.utils.SpUtil
import kotlinx.android.synthetic.main.fragment_me.*
import java.io.File


/**
 * 我的窗口
 */

class MeFragment : BaseFragment() {
    /**
     * 获取界面id
     */
    override fun getRLayout():Int = R.layout.fragment_me

    /**
     * 初始化界面
     */
    override fun initView(){}

    /**
     * 初始化监听
     */
    override fun initListener(){
        // 音量键控制事件
        switch_volume.setOnCheckedChangeListener { buttonView, isChecked ->
            SpUtil.setBooleanValue("volume_turn_page", isChecked)
        }


    }

    /**
     * 初始化数据
     */
    override fun initData(){
        // 是否音量键控制翻页
        switch_volume.isChecked = SpUtil.getBooleanValue("volume_turn_page", true)



    }
}