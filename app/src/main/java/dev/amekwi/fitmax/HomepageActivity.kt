package dev.amekwi.fitmax

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import dev.amekwi.fitmax.databinding.ActivityHomepageBinding

class HomeActivity : AppCompatActivity() {
    lateinit var binding: ActivityHomepageBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding= ActivityHomepageBinding.inflate(layoutInflater)
        setContentView(binding.root)
        castViews()
        setupBottomNav()
    }
    fun castViews(){

    }
    fun setupBottomNav(){
        binding.btmNav.setOnItemSelectedListener { item->
            when(item.itemId){
                R.id.plan->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, PlanFragment()).commit()
                    true
                }
                R.id.track->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, TrackFragment()).commit()
                    true
                }
                R.id.profile->{
                    supportFragmentManager.beginTransaction().replace(R.id.fcvHome, ProfileFragment()).commit()
                    true
                }
                else-> false
            }
        }
    }
}