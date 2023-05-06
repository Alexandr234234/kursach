package com.example.taployalt

import android.annotation.SuppressLint
import android.app.Application
import android.content.Intent
import android.media.MediaPlayer
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.*
import com.example.myapplication.ActivityForInfo
import com.example.myapplication.R
import com.nekotyan9000.lkklkk.MyCustomAdapter
import com.nekotyan9000.lkklkk.MyData


public class Global2 : Application() {
    companion object {
        @JvmField
        var GJ: Int = 0
    }
}

class frag2 : Fragment() {



    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val view = inflater.inflate(R.layout.fragment_frag2, container, false)

        val myListData = mutableListOf<MyData>()

        myListData.add(MyData(R.drawable.sok, "Соки"))
        myListData.add(MyData(R.drawable.gaz, "Газировка"))
        myListData.add(MyData(R.drawable.kofe, "Кофе"))
        myListData.add(MyData(R.drawable.chai, "Чай"))


        val myListView = view.findViewById<ListView>(R.id.my_list_view2)
        myListView.adapter = MyCustomAdapter(requireActivity(), myListData)



        myListView.onItemClickListener = AdapterView.OnItemClickListener { parent, view, position, id ->
            if (position == 0) {
                Global2.GJ = 0
                val intent = Intent(requireContext(), ActivityForInfo::class.java)
                startActivity(intent)
            }
            if (position == 1) {
                Global2.GJ = 1
                val intent = Intent(requireContext(), ActivityForInfo::class.java)
                startActivity(intent)
            }
            if (position == 2) {
                Global2.GJ = 2
                val intent = Intent(requireContext(), ActivityForInfo::class.java)
                startActivity(intent)
            }
            if (position == 3) {
                Global2.GJ = 3
                val intent = Intent(requireContext(), ActivityForInfo::class.java)
                startActivity(intent)
            }

        }
        return view
    }

    companion object {

        @JvmStatic
        fun newInstance() = frag2()


    }
}