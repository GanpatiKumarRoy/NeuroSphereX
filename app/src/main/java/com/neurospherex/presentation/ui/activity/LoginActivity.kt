package com.neurospherex.presentation.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.neurospherex.R
import com.neurospherex.databinding.ActivityLoginBinding
import com.neurospherex.utils.extensions.initiateStatusBar
import com.neurospherex.utils.extensions.showToast
import com.neurospherex.utils.extensions.startScreen

class LoginActivity : AppCompatActivity() {

    private lateinit var activityLoginBinding: ActivityLoginBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityLoginBinding = DataBindingUtil.setContentView(this, R.layout.activity_login)
        activityLoginBinding.lifecycleOwner = this

        initiateStatusBar()

        activityLoginBinding.submitButton.setOnClickListener {
            startScreen(HomeActivity::class, clearTask = true)
        }
    }
}