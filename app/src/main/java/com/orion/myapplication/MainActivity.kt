package com.orion.myapplication

import android.content.res.ColorStateList
import android.graphics.Color
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.telephony.ims.RegistrationManager
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager.widget.ViewPager
import androidx.viewpager2.widget.ViewPager2
import com.google.android.material.floatingactionbutton.ExtendedFloatingActionButton
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button: ExtendedFloatingActionButton = findViewById(R.id.fab)

        val viewPager2: ViewPager2 = findViewById(R.id.view_pager2)
        val viewPagerAdapter =
            ViewPagerAdapter(fragmentManager = supportFragmentManager, activity = this, numItem = 3)
        viewPager2.adapter = viewPagerAdapter
        viewPager2.orientation = ViewPager2.ORIENTATION_VERTICAL
        viewPager2.isUserInputEnabled=false

        button.setOnClickListener {
            if (viewPager2.currentItem == 0) {
                viewPager2.currentItem = 1
            } else if (viewPager2.currentItem == 1) {
                viewPager2.currentItem = 2
                button.text="Submit"
            }

        }
    }


}
