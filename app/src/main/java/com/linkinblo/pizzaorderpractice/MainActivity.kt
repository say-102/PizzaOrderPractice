package com.linkinblo.pizzaorderpractice

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.linkinblo.pizzaorderpractice.adapters.MyViewPagerAdapter
import com.linkinblo.pizzaorderpractice.adapters.PizzaAdapter
import com.linkinblo.pizzaorderpractice.datas.Store
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.android.synthetic.main.fragment_pizza_store.*
import kotlinx.android.synthetic.main.pizza_store_list_item.*
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