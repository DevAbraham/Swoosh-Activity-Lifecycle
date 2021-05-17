package com.ruedapps.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ruedapps.swoosh.EXTRA_LEAGUE
import com.ruedapps.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var selectedLeague = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        btnLeagueNext.setOnClickListener {

            if(selectedLeague != ""){
                val skillActivity = Intent (this, SkillActivity::class.java)
                skillActivity.putExtra(EXTRA_LEAGUE,selectedLeague)
                startActivity(skillActivity)
            }else{
                Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
            }
        }

        tBtnMens.setOnClickListener {
            tBtnWomens.isChecked = false
            tBtnCop.isChecked = false

            selectedLeague = "mens"
        }

        tBtnWomens.setOnClickListener {
            tBtnMens.isChecked = false
            tBtnCop.isChecked = false

            selectedLeague = "womens"

        }

        tBtnCop.setOnClickListener {
            tBtnMens.isChecked = false
            tBtnWomens.isChecked = false

            selectedLeague = "co-ed"
        }
    }
}