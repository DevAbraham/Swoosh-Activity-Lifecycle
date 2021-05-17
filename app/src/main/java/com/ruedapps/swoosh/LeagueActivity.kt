package com.ruedapps.swoosh

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_league.*

class LeagueActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_league)

        btnLeagueNext.setOnClickListener {

            val skillActivity = Intent (this,SkillActivity::class.java)
            startActivity(skillActivity)
        }
    }
}