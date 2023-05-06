package com.example.taployalt

import android.annotation.SuppressLint
import android.app.Application
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.Button
import android.widget.ListView
import androidx.fragment.app.FragmentActivity
import com.example.myapplication.ActivityForInfo
import com.example.myapplication.R
import com.nekotyan9000.lkklkk.MyCustomAdapter
import com.nekotyan9000.lkklkk.MyData

public class Global : Application() {
    companion object {
        @JvmField
        var VG: Int = 0
    }
}

class frag1 : Fragment() {



    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag1, container, false)

        val myListData = mutableListOf<MyData>()

        myListData.add(MyData(R.drawable.foto2, "Холодные закуски"))
        myListData.add(MyData(R.drawable.gor_bluda, "Горячие блюда"))
        myListData.add(MyData(R.drawable.borsh1, "Супы"))
        myListData.add(MyData(R.drawable.foto4, "Гарниры"))
        myListData.add(MyData(R.drawable.salat, "Салаты"))
        myListData.add(MyData(R.drawable.foto6, "Десерты"))

        val myListView = view.findViewById<ListView>(R.id.my_list_view)
        myListView.adapter = MyCustomAdapter(requireActivity(), myListData)



        myListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                Global.VG = 0
                val intent = Intent(requireContext(), ActivityForInfo::class.java)
                startActivity(intent)
            }
            if (position == 1) {
                Global.VG = 1
                val intent = Intent(requireContext(), ActivityForInfo::class.java)
                startActivity(intent)
            }
            if (position == 2) {
                Global.VG = 2
                val intent = Intent(requireContext(), ActivityForInfo::class.java)
                startActivity(intent)
            }
            if (position == 3) {
                Global.VG = 3
                val intent = Intent(requireContext(), ActivityForInfo::class.java)
                startActivity(intent)
            }
            if (position == 4) {
                Global.VG = 4
                val intent = Intent(requireContext(), ActivityForInfo::class.java)
                startActivity(intent)
            }
            if (position == 5) {
                Global.VG = 5
                val intent = Intent(requireContext(), ActivityForInfo::class.java)
                startActivity(intent)
            }
            Global2.GJ = -1
        }
        return view

    }

    companion object {

        @JvmStatic
        fun newInstance() = frag1()


    }
}