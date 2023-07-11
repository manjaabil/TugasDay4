package com.example.tablayoutviewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.LayoutInflater
import android.widget.TableLayout
import androidx.core.splashscreen.SplashScreen.Companion.installSplashScreen
import androidx.viewpager2.widget.ViewPager2
import com.example.tablayoutviewpager.databinding.ActivityMainBinding
import com.google.android.material.tabs.TabLayout

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Thread.sleep(2000)
        installSplashScreen()
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        setTabLayout()

    }

    private fun setTabLayout() {
        val vpAdapter = ViewPagerAdapter(supportFragmentManager)

        binding.viewPager.adapter = vpAdapter
        binding.tabLayout.setupWithViewPager(binding.viewPager)
    }

}
