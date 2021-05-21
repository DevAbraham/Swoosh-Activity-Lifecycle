package com.ruedapps.swoosh.Controller

import android.os.Bundle
import android.os.PersistableBundle
import android.util.Log
import androidx.appcompat.app.AppCompatActivity
import com.ruedapps.swoosh.TAG_LIFECYCLE

open class BaseActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?, persistentState: PersistableBundle?) {
        Log.d(TAG_LIFECYCLE,"${javaClass.simpleName} OnCreate")
        super.onCreate(savedInstanceState, persistentState)
    }

    override fun onStart() {
        Log.d(TAG_LIFECYCLE,"${javaClass.simpleName} OnStart")
        super.onStart()
    }

    override fun onResume() {
        Log.d(TAG_LIFECYCLE,"${javaClass.simpleName} OnResume")
        super.onResume()
    }

    override fun onPause() {
        Log.d(TAG_LIFECYCLE,"${javaClass.simpleName} OnPause")
        super.onPause()
    }

    override fun onStop() {
        Log.d(TAG_LIFECYCLE,"${javaClass.simpleName} OnStop")
        super.onStop()
    }

    override fun onDestroy() {
        Log.d(TAG_LIFECYCLE,"${javaClass.simpleName} OnDestroy")
        super.onDestroy()
    }

    override fun onRestart() {
        Log.d(TAG_LIFECYCLE,"${javaClass.simpleName} OnRestart")
        super.onRestart()
    }

}