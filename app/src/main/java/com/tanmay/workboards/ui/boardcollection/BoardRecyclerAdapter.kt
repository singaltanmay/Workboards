package com.tanmay.workboards.ui.boardcollection

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.tanmay.workboards.R
import com.tanmay.workboards.model.Board

class BoardRecyclerAdapter(var data: List<Board>, val context: Context) :
    RecyclerView.Adapter<BoardRecyclerAdapter.BoardHolder>() {

    inner class BoardHolder(itemView: View) : RecyclerView.ViewHolder(itemView) {
        val boardTitleTextView = itemView.findViewById<TextView>(R.id.item_board_title)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): BoardHolder {
        val view = LayoutInflater.from(context).inflate(R.layout.item_board_personal, parent, false)
        return BoardHolder(view)
    }

    override fun onBindViewHolder(holder: BoardHolder, position: Int) {
        holder.boardTitleTextView.text = data[position].name
    }

    override fun getItemCount() = data.size

}
