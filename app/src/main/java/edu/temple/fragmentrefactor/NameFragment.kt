package edu.temple.fragmentrefactor

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import kotlin.text.isNotBlank

class NameFragment : Fragment() {

    private lateinit var displayTextView: TextView
    private lateinit var nameEditText: EditText
    private lateinit var changeButton: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val layout = inflater.inflate(R.layout.fragment_name, container, false)

        displayTextView = layout.findViewById(R.id.displayTextView)
        nameEditText = layout.findViewById(R.id.nameEditText)
        changeButton = layout.findViewById(R.id.changeButton)

        changeButton.setOnClickListener {
            val name = nameEditText.text

            displayTextView.text = if (name.isNotBlank()) {
                "Hello, $name!"
            } else {
                "Please enter your name"
            }
        }

        return layout
    }
}