package com.ruedapps.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ruedapps.swoosh.EXTRA_PLAYER
import com.ruedapps.swoosh.Model.Player
import com.ruedapps.swoosh.R
import kotlinx.android.synthetic.main.activity_finish.*

class FinishActivity : AppCompatActivity() {
    lateinit var player :Player
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_finish)
        player = intent.getParcelableExtra(EXTRA_PLAYER) ?: Player("","")
        txtSearchLeagues.text = "Looking for ${player.league} ${player.skill} league near you..."
    }
}