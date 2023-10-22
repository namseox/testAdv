package com.namseox.st003_calltheme.ui.tutorial

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentActivity
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.namseox.st003_calltheme.ui.tutorial.creatcall.CallFragment
import com.namseox.st003_calltheme.ui.tutorial.flasheffect.FlashEffectFragment
import com.namseox.st003_calltheme.ui.tutorial.personalizecall.PersonalizeCallFragment

class ViewPagerAdapter(fm: FragmentActivity): FragmentStateAdapter(fm) {
    override fun getItemCount(): Int = 3

    override fun createFragment(position: Int): Fragment {
        return when (position){
            0 -> PersonalizeCallFragment()
            1 -> CallFragment()
            2 -> FlashEffectFragment()
            else -> PersonalizeCallFragment()
        }
    }
}