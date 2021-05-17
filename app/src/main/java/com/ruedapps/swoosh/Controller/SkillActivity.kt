package com.ruedapps.swoosh.Controller

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ruedapps.swoosh.EXTRA_LEAGUE
import com.ruedapps.swoosh.R

class SkillActivity : AppCompatActivity() {

    var league = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()
    }


}