package com.neurospherex.presentation.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.neurospherex.R
import com.neurospherex.databinding.ActivityHomeBinding
import com.neurospherex.utils.extensions.initiateStatusBar

class HomeActivity : AppCompatActivity() {

    private lateinit var activityHomeBinding: ActivityHomeBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        activityHomeBinding.lifecycleOwner = this

        initiateStatusBar()
    }
}