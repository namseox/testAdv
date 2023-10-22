package com.namseox.st003_calltheme.ui.themes

import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.namseox.st003_calltheme.R
import com.namseox.st003_calltheme.data.model.ThemeCall
import com.namseox.st003_calltheme.databinding.FragmentDiyThemeBinding
import com.namseox.st003_calltheme.databinding.FragmentThemesBinding
import com.namseox.st003_calltheme.databinding.ItemThemesBinding
import com.namseox.st003_calltheme.ui.base.AbsBaseFragment
import com.namseox.st003_calltheme.ui.base.BaseListener

class ThemesFragment : AbsBaseFragment<FragmentThemesBinding>(),BaseListener.onClick{
    lateinit var adapter: ThemesAdapter
    var data = listOf<ThemeCall>()
    override fun getLayout(): Int = R.layout.fragment_themes

    override fun initView() {
        adapter = ThemesAdapter(this)
        loadThemeCall()
        setRecycleView()
    }

    private fun setRecycleView() {
        adapter.getData(data)
        binding.ctlThemesItem.adapter = adapter
        val manager = GridLayoutManager(requireContext(), 2, RecyclerView.VERTICAL, false)
        binding.ctlThemesItem.layoutManager = manager
    }

    private fun loadThemeCall() {

    }

    override fun onClickItem(binding: ItemThemesBinding, positon: Int) {

    }
}