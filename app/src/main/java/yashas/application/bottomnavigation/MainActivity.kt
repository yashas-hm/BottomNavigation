package yashas.application.bottomnavigation

import android.app.AlertDialog
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.MenuItem
import com.google.android.material.bottomnavigation.BottomNavigationView

class MainActivity : AppCompatActivity() {
    lateinit var bottomNav: BottomNavigationView
    var previousMenuItem : MenuItem? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        bottomNav = findViewById(R.id.bottom_nav)

        bottomNav.setOnNavigationItemSelectedListener {
            if (previousMenuItem != null) {
                it.isChecked = false
            }
            it.isCheckable = true
            it.isChecked = true
            previousMenuItem = it
            when(it.itemId){
                R.id.demo1 -> {

                }
                R.id.demo2 ->{

                }
                R.id.demo3 ->{

                }

            }
            return@setOnNavigationItemSelectedListener true
        }


    }

    override fun onBackPressed() {
        val dialog = AlertDialog.Builder(this@MainActivity)
        dialog.setTitle("Exit")
        dialog.setMessage("Sure you want to exit?")
        dialog.setPositiveButton("Yes") { text, listner ->
            finish()
        }
        dialog.setNegativeButton("No") { text, listner ->

        }
        dialog.create()
        dialog.show()
    }
}