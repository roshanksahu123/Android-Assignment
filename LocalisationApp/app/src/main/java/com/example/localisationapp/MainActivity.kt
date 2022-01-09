package com.example.localisationapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.appcompat.app.AppCompatDelegate
import com.google.android.material.button.MaterialButtonToggleGroup
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        btg_theme.addOnButtonCheckedListener(object : MaterialButtonToggleGroup.OnButtonCheckedListener {
            override fun onButtonChecked(
                group: MaterialButtonToggleGroup?,
                selectedBtnId: Int,
                isChecked: Boolean
            ) {
                if (isChecked){
                    val theme = when(selectedBtnId){
                        R.id.btnDefault -> AppCompatDelegate.MODE_NIGHT_FOLLOW_SYSTEM
                        R.id.btnDark -> AppCompatDelegate.MODE_NIGHT_YES
                        else -> AppCompatDelegate.MODE_NIGHT_NO
                    }
                    AppCompatDelegate.setDefaultNightMode(theme)
                }
            }

        })
    }
}