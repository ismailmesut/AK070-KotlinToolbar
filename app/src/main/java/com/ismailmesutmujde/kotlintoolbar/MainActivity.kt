package com.ismailmesutmujde.kotlintoolbar

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ismailmesutmujde.kotlintoolbar.databinding.ActivityMainBinding


class MainActivity : AppCompatActivity() {

    private  lateinit var bindingMain : ActivityMainBinding

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        bindingMain = ActivityMainBinding.inflate(layoutInflater)
        val view = bindingMain.root
        setContentView(view)

        bindingMain.toolbar.title = "Custom Toolbar Title"
        bindingMain.toolbar.subtitle = "Custom Toolbar SubTitle"
        bindingMain.toolbar.setLogo(R.drawable.image)
        bindingMain.toolbar.setTitleTextColor(resources.getColor(R.color.white))

    }
}