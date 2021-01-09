package com.example.a513

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import androidx.viewpager.widget.ViewPager

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val adapte = ViewPagerAdapter(supportFragmentManager)
        findViewById<ViewPager>(R.id.viewPager).adapter = adapte
    }
}
class ViewPagerAdapter(fm:  FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getItem(position: Int) = when(position) {
        0 -> FirstFragment()
        1 -> SecondFragment()
        else-> ThirdFragment()
    }
    override fun getCount() = 3
}