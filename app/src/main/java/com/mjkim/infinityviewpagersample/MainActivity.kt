package com.mjkim.infinityviewpagersample

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.core.content.ContextCompat
import com.mjkim.infinityviewpager.InfinityViewPager
import kotlinx.android.synthetic.main.activity_main.*
import java.util.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        init()
    }

    private fun init(){
        //make sample example image list
        val sampleImgList = ArrayList<Any>()
        sampleImgList.add(ContextCompat.getDrawable(this, R.drawable.glide_sample_photo1)!!)
        sampleImgList.add(ContextCompat.getDrawable(this, R.drawable.glide_sample_photo2)!!)
        sampleImgList.add(ContextCompat.getDrawable(this, R.drawable.glide_sample_photo3)!!)
        sampleImgList.add(ContextCompat.getDrawable(this, R.drawable.glide_sample_photo4)!!)

        //viewpager init (Context, layout, viewpager2, *sampleList)
        //* In sampleList, you can put - java : ArrayList<Object> / - kotlin : ArrayList<Any>  (all types supported by Glide can be used)
        val infinityViewPager = InfinityViewPager(this, R.layout.sample_fragment, main_viewpager, sampleImgList)

        //set viewpager timer
        infinityViewPager.setTimerEnabled(true, 3000, 3000)
    }
}