package com.natashazahr.mine.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.natashazahr.mine.Model.Location


class HomepageFragment : Fragment(){

    private lateinit var homepageBinding: HomepageFragment
    private var list : ArrayList<Location> = arrayListOf()

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        homepageBinding = HomepageFragment.inflate(inflater, container, false)

        return homepageBinding.root
    }





}