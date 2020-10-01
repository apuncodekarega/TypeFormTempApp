package com.orion.myapplication

import android.view.ViewGroup
import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    fragmentManager: FragmentManager,
    activity: AppCompatActivity,
    private val numItem:Int
) : FragmentStateAdapter(fragmentManager, activity.lifecycle) {


    override fun getItemCount(): Int {
        return numItem
    }

    override fun createFragment(position: Int): Fragment {
        when (position) {
            0 -> return FragmentA()
            1 -> return FragmentB()
            2 -> return FragmentC()
        }
        return FragmentA()
    }

}