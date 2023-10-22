package com.namseox.st003_calltheme.ui.themes

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import androidx.recyclerview.widget.RecyclerView.ViewHolder
import com.namseox.st003_calltheme.data.model.ThemeCall
import com.namseox.st003_calltheme.databinding.ItemThemesBinding
import com.namseox.st003_calltheme.ui.base.BaseListener

class ThemesAdapter(var onClick: BaseListener.onClick) : RecyclerView.Adapter<RecyclerView.ViewHolder>() {

    var data = mutableListOf<ThemeCall>()

    fun getData(listTheme: List<ThemeCall>) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): RecyclerView.ViewHolder {
        var binding = ItemThemesBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return ViewHolder(binding)
    }

    override fun getItemCount(): Int = data.size

    override fun onBindViewHolder(holder: RecyclerView.ViewHolder, position: Int) {
        if (holder is ViewHolder) {
            holder.bind(position)
            holder.binding.ctlThemesItem.setOnClickListener {
                onClick.onClickItem(holder.binding, position)
            }
        }
    }


    inner class ViewHolder(val binding: ItemThemesBinding) : RecyclerView.ViewHolder(binding.root) {
        fun bind(position: Int) {
            binding.themeCallModel = data[position]
        }

    }
}
