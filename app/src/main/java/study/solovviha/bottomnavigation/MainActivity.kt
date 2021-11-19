package study.solovviha.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.fragment.app.Fragment
import com.google.android.material.bottomnavigation.BottomNavigationView
import com.google.android.material.navigation.NavigationBarMenuView

class MainActivity : AppCompatActivity() {

    private lateinit var bottomMenu: BottomNavigationView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        bottomMenu=findViewById(R.id.bottom_menu)

        bottomMenu.setOnItemSelectedListener { item ->
            when(item.itemId){
                R.id.menu -> {
                    val menuFragment = MenuFragment()
                    replaceFragment(menuFragment)
                }
                R.id.about ->{
                    val aboutFragment = AboutFragment()
                    replaceFragment(aboutFragment)

                }
            }


            true
        }


    }

    private fun replaceFragment(fragment: Fragment){
       supportFragmentManager
           .beginTransaction()
           .replace(R.id.fragment_container, fragment)
           .commit()

    }
}