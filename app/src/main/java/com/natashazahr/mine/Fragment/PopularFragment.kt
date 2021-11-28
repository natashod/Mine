package com.natashazahr.mine.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import com.natashazahr.mine.Model.DataLocation
import com.natashazahr.mine.Model.Location

class PopularFragment : Fragment() {

    private lateinit var popularBinding: PopularFragment
    private var list: ArrayList<Location> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        popularBinding = PopularFragment().inflate(inflater, container, false)

        return popularBinding.root
    }


    override fun oneViewCreated(view: View, savedInstanceState: Bundle?) {
        list.addAll(DataLocation.dataLocation)
        popularBinding.rvPopular.apply {
            setHasFixedSize(true)
            //fungsi biar size ga berubah
            layoutManager = LinearLayoutManager(context)
            val foodAdapter = FoodAdapter(list)
            adapter = foodAdapter
        }


    }
}
