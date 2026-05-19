package com.shishusneh.ui

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.shishusneh.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {

        super.onCreate(savedInstanceState)

        binding =
            ActivityMainBinding.inflate(layoutInflater)

        setContentView(binding.root)

        binding.btnGrowth.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    GrowthChartActivity::class.java
                )
            )
        }

        binding.btnVaccine.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    VaccineActivity::class.java
                )
            )
        }

        binding.btnFeeding.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    FeedingGuideActivity::class.java
                )
            )
        }

        binding.btnMilestone.setOnClickListener {

            startActivity(
                Intent(
                    this,
                    MilestoneActivity::class.java
                )
            )
        }
    }
}
