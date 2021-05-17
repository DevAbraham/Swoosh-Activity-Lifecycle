package com.ruedapps.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ruedapps.swoosh.EXTRA_LEAGUE
import com.ruedapps.swoosh.EXTRA_SKILL
import com.ruedapps.swoosh.R

class FinishActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)

        var league = intent.getStringExtra(EXTRA_LEAGUE)
        var skill = intent.getStringExtra(EXTRA_SKILL)

    }
}