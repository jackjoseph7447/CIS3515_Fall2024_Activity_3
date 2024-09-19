package edu.temple.inclassuiacvitivity

import android.content.Context
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.TextView

class TextSizeAdapter(_context : Context, _array : Array<Int>) : BaseAdapter() {

    val context = _context
    val array = _array

    override fun getCount(): Int {
        return array.size
    }

    override fun getItem(position: Int): Any {
        return array[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        val textView : TextView

        textView = TextView(context)
        textView.text = array[position].toString()
        textView.textSize = array[position].toFloat()
        textView.setPadding(5,10,0,10)

        return textView
    }

}