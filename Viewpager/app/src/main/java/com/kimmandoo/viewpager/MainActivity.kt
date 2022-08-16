package com.kimmandoo.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.kimmandoo.viewpager.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() {
    val binding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        val fragmentList = listOf(FragmentA(),FragmentB())
        val adapter = ViewpagerAdapter(this)
        adapter.fragmentList = fragmentList

        binding.viewPager.adapter = adapter

    }
}