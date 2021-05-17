package com.ruedapps.swoosh.Controller

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.ruedapps.swoosh.EXTRA_LEAGUE
import com.ruedapps.swoosh.EXTRA_SKILL
import com.ruedapps.swoosh.R
import kotlinx.android.synthetic.main.activity_league.*
import kotlinx.android.synthetic.main.activity_skill.*

class SkillActivity : AppCompatActivity() {

    var league = ""
    var skill = ""

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_skill)
        league = intent.getStringExtra(EXTRA_LEAGUE).toString()

        btnFinishSkill.setOnClickListener {

            if(skill != ""){
                val finishActivity = Intent (this, FinishActivity::class.java)
                finishActivity.putExtra(EXTRA_LEAGUE,league)
                finishActivity.putExtra(EXTRA_SKILL,skill)
                startActivity(finishActivity)
            }else{
                Toast.makeText(this,"Please select a skill",Toast.LENGTH_SHORT).show()
            }
        }

        tBtnBegginer.setOnClickListener {
            tBtnBaller.isChecked = false
            skill = "baller"
        }

        tBtnBaller.setOnClickListener {
            tBtnBegginer.isChecked = false
            skill = "begginer"
        }
    }


}