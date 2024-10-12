package com.neurospherex.presentation.ui.activity

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.recyclerview.widget.LinearLayoutManager
import com.neurospherex.R
import com.neurospherex.data.remote.models.Course
import com.neurospherex.databinding.ActivityHomeBinding
import com.neurospherex.presentation.ui.adapter.CourseAdapter
import com.neurospherex.utils.extensions.initiateStatusBar

class HomeActivity : AppCompatActivity() {

    private lateinit var activityHomeBinding: ActivityHomeBinding
    private lateinit var courseAdapter: CourseAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        activityHomeBinding = DataBindingUtil.setContentView(this, R.layout.activity_home)
        activityHomeBinding.lifecycleOwner = this
        initiateStatusBar()
        setupRecyclerView()
    }

    private fun setupRecyclerView() {
        val courseList = listOf(
            Course(
                courseIcon = R.drawable.deep_learning_icon,
                courseName = "Deep Learning",
                courseDescription = "Deep Learning uses neural networks to analyze large datasets and solve complex tasks efficiently."
            ),
            Course(
                courseIcon = R.drawable.deep_learning_icon,
                courseName = "Machine Learning",
                courseDescription = "Machine Learning provides systems the ability to automatically learn and improve from experience without being explicitly programmed."
            ),
            Course(
                courseIcon = R.drawable.deep_learning_icon,
                courseName = "Real Spoof Detection",
                courseDescription = "Real Spoof Detection uses AI algorithms to distinguish between real faces and spoofing attacks like photos or masks."
            )
        )

        courseAdapter = CourseAdapter(courseList)
        activityHomeBinding.recyclerView.apply {
            layoutManager = LinearLayoutManager(this@HomeActivity)
            adapter = courseAdapter
        }
    }
}