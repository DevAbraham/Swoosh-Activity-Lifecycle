package com.ruedapps.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ruedapps.swoosh.EXTRA_PLAYER
import com.ruedapps.swoosh.Model.Player
import com.ruedapps.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {

    var player = Player ("","")

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        btnLeagueNext.setOnClickListener {

            if(player.league != ""){
                val skillActivity = Intent (this, SkillActivity::class.java)
                    skillActivity.putExtra(EXTRA_PLAYER, player)
                startActivity(skillActivity)
            }else{
                Toast.makeText(this,"Please select a league",Toast.LENGTH_SHORT).show()
            }
        }

        tBtnMens.setOnClickListener {
            tBtnWomens.isChecked = false
            tBtnCop.isChecked = false
            player.league = "mens"
        }

        tBtnWomens.setOnClickListener {
            tBtnMens.isChecked = false
            tBtnCop.isChecked = false

            player.league = "womens"

        }

        tBtnCop.setOnClickListener {
            tBtnMens.isChecked = false
            tBtnWomens.isChecked = false

            player.league = "co-ed"
        }
    }
}