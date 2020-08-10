package net.sajo.recyclerviewpractice

import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class TextAdapter: RecyclerView.Adapter<TextAdapter.ViewHolder>() {

    class ViewHolder(view: View): RecyclerView.ViewHolder(view)

    override fun getItemCount(): Int = 3

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        R.layout.item_text
    }

    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        TODO("Not yet implemented")
    }
}