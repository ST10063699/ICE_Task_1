package com.example.icetask1

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView

class Languages : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_languages)

        val textView: TextView = findViewById(R.id.textView)
        val buttonEnglish: Button = findViewById(R.id.button)
        val buttonFrench: Button = findViewById(R.id.button2)
        val buttonJapanese: Button = findViewById(R.id.button3)
        val buttonSpanish: Button = findViewById(R.id.button4)
        val buttonHindi: Button = findViewById(R.id.button5)

        buttonEnglish.setOnClickListener {
            textView.text = "Hello World!"
        }

        buttonFrench.setOnClickListener {
            textView.text = "Bonjour le monde!"
        }

        buttonJapanese.setOnClickListener {
            textView.text = "こんにちは、世界！"
        }

        buttonSpanish.setOnClickListener {
            textView.text = "¡Hola Mundo!"
        }

        buttonHindi.setOnClickListener {
            textView.text = "नमस्ते दुनिया!"
        }
    }
}
