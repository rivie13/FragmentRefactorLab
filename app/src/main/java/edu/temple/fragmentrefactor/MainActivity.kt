package edu.temple.fragmentrefactor

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        // Add the NameFragment to the fragmentContainer
        supportFragmentManager.beginTransaction()
            .add(R.id.fragmentContainer, NameFragment())
            .commit()
    }
}