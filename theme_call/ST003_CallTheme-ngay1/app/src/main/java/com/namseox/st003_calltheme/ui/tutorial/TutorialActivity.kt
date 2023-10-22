package com.namseox.st003_calltheme.ui.tutorial

import android.content.ContentValues.TAG
import android.content.Intent
import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.FrameLayout
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import androidx.viewpager2.widget.CompositePageTransformer
import androidx.viewpager2.widget.MarginPageTransformer
import androidx.viewpager2.widget.ViewPager2
import com.lvt.ads.util.Admob
import com.namseox.st003_calltheme.MainActivity
import com.namseox.st003_calltheme.R
import com.namseox.st003_calltheme.databinding.ActivityTutorialBinding
import com.namseox.st003_calltheme.utils.Const
import com.namseox.st003_calltheme.utils.SharedPreferenceUtils

class TutorialActivity : AppCompatActivity() {
    lateinit var binding: ActivityTutorialBinding
    private var native_ads: FrameLayout? = null
    var listFragment = 3
    private var viewPagerAdapter: ViewPagerAdapter? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this,R.layout.activity_tutorial)
        native_ads = findViewById<FrameLayout>(R.id.fr_ads)
        Admob.getInstance().loadNativeAd(
            this,
            "ca-app-pub-3940256099942544/2247696110",
            native_ads,
            com.lvt.ads.R.layout.ads_native_small_btn_ads_top
        )
        viewPagerAdapter = ViewPagerAdapter(this)


        val compositePageTransformer = CompositePageTransformer()
        compositePageTransformer.addTransformer(MarginPageTransformer(100))
        compositePageTransformer.addTransformer { page: View, position: Float ->
            val r = 1 - Math.abs(position)
            page.scaleY = 0.8f + r * 0.2f
            val absPosition = Math.abs(position)
            page.alpha = 1.0f - (1.0f - 0.3f) * absPosition
        }
        binding.pageIndicatorView.count = listFragment
        binding.viewPager.setPageTransformer(compositePageTransformer)
        bindViewModel()
    }


    private fun bindViewModel() {
        binding.viewPager.adapter = viewPagerAdapter
        binding.viewPager.registerOnPageChangeCallback(object : ViewPager2.OnPageChangeCallback() {
            override fun onPageSelected(position: Int) {
                super.onPageSelected(position)
                binding.pageIndicatorView.selection = position
                if(binding.viewPager.currentItem == listFragment - 1){
                    binding.btnNext.text = "Let's explore"
                    binding.btnNext.setTextColor(Color.parseColor("#ffffff"))
                }else{
                    binding.btnNext.text = "Next"
                    binding.btnNext.setTextColor(Color.parseColor("#ffffff"))
                }
            }
        })

        binding.btnNext.setOnClickListener(object : View.OnClickListener{
            override fun onClick(p0: View?) {
                Log.d(TAG, "onClick: ")
                if (binding.viewPager.currentItem < listFragment - 1) {
                    binding.viewPager.setCurrentItem(binding.viewPager.currentItem + 1)
                    Log.d(TAG, "onClick: "+(binding.viewPager.currentItem + 1))
                } else {
                    Log.d(TAG, "onClick:2 ")
                    SharedPreferenceUtils.getInstance(applicationContext).putBooleanValue(Const.CHECKTUTORIAL,true)
                    val intent = Intent(this@TutorialActivity, MainActivity::class.java)
                    startActivity(intent)
                    finish()
                }
            }

        })
    }

}