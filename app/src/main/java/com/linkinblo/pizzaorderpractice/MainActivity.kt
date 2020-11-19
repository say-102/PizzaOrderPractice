package com.linkinblo.pizzaorderpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.linkinblo.pizzaorderpractice.adapters.MyViewPagerAdapter
import kotlinx.android.synthetic.main.activity_main.*
import kr.co.tjoeun.lifecycle_20201114.BaseActivity

class MainActivity : BaseActivity() {

    lateinit var myViewPagerAdapter: MyViewPagerAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvents()
        setValues()
    }

    override fun setupEvents() {

    }

    override fun setValues() {

        myViewPagerAdapter = MyViewPagerAdapter(supportFragmentManager)
        myViewPager.adapter = myViewPagerAdapter

        myTabLayout.setupWithViewPager(myViewPager)

    }


}