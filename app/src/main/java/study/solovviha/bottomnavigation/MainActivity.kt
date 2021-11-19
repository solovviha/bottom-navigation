package study.solovviha.bottomnavigation

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
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
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container,menuFragment)
                        .commit()
                }
                R.id.about ->{
                    val aboutFragment = AboutFragment()
                    supportFragmentManager
                        .beginTransaction()
                        .replace(R.id.fragment_container, aboutFragment)
                        .commit()

                }
            }


            true
        }


    }
}