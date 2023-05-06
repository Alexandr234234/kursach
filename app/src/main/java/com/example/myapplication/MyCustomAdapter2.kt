package com.example.myapplication

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.BaseAdapter
import android.widget.ImageView
import android.widget.TextView

class MyCustomAdapter2 (val ctx: Context, val myDataList: List<MyData2>): BaseAdapter() {
    override fun getCount(): Int {
        return myDataList.size
    }

    override fun getItem(position: Int): MyData2 {
        return myDataList[position]
    }

    override fun getItemId(position: Int): Long {
        return position.toLong()
    }

    override fun getView(position: Int, convertView: View?, parent: ViewGroup?): View {
        var myConvertView = convertView
        if(myConvertView == null) {
            myConvertView = LayoutInflater.from(ctx).inflate(R.layout.my_list_item2, parent, false)
        }

        var currentItem = getItem(position)

        val imageItem = myConvertView?.findViewById<ImageView>(R.id.list_item_image)
        val titleItem = myConvertView?.findViewById<TextView>(R.id.list_item_title)
        val title2Item = myConvertView?.findViewById<TextView>(R.id.list_item_desc)
        val title3Item = myConvertView?.findViewById<TextView>(R.id.list_item_title3)

        imageItem?.setImageResource(currentItem.image)
        titleItem?.text = currentItem.title
        title2Item?.text = currentItem.title2
        title3Item?.text = currentItem.title3

        return myConvertView!!
    }

}