package com.linkinblo.pizzaorderpractice.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.linkinblo.pizzaorderpractice.fragments.MyProfileFragment
import com.linkinblo.pizzaorderpractice.fragments.PizzaStoreFragment

class MyViewPagerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {
    override fun getCount(): Int {
        return 2

    }

    override fun getItem(position: Int): Fragment {
        return when (position) {
            0 -> PizzaStoreFragment()
            else -> MyProfileFragment()
        }

    }
}