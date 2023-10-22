package com.namseox.st003_calltheme.ui.base

import com.namseox.st003_calltheme.databinding.ItemThemesBinding

interface BaseListener{
    interface onClick{
        fun onClickItem(binding : ItemThemesBinding, positon : Int)
    }
}