package com.natashazahr.mine

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.natashazahr.mine.Fragment.PopularFragment

class MainActivity : AppCompatActivity() {
    private lateinit var mainBinding: ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        mainBinding = inflate(layoutInflater)
        setContentView(mainBinding.root)
        supportActionBar?.hide()
        setCurrentFragment(HomepageFragment())
        mainBinding.navBottomMain.setOnNavigationItemSelectedListener {
            when (it.itemId) {
                R.id.ic_popular -> setCurrentFragment(PopularFragment())

            }
            true
        }
    }
    private fun setCurrentFragment(fragment : Fragment) = supportFragmentManager.beginTransaction().apply{
        replace(R.id.fl_main, fragment)
        commit()

    }
}