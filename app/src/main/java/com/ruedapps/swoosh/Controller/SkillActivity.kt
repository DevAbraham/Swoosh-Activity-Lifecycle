package com.ruedapps.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ruedapps.swoosh.EXTRA_PLAYER
import com.ruedapps.swoosh.Model.Player
import com.ruedapps.swoosh.R
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    lateinit var player: Player

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        player = intent.getParcelableExtra(EXTRA_PLAYER) ?: Player("","")
        btnFinishSkill.setOnClickListener {

            if(player.skill != ""){
                val finishActivity = Intent (this, FinishActivity::class.java)
                finishActivity.putExtra(EXTRA_PLAYER,player)
                startActivity(finishActivity)
            }else{
                Toast.makeText(this,"Please select a skill",Toast.LENGTH_SHORT).show()
            }
        }

        tBtnBegginer.setOnClickListener {
            tBtnBaller.isChecked = false
            player.skill ="begginer"
        }

        tBtnBaller.setOnClickListener {
            tBtnBegginer.isChecked = false
            player.skill ="baller"
        }
    }


}