package tech.olib07.diceroller;

import androidx.appcompat.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View
import android.widget.EditText
import android.widget.TextView
import kotlin.random.Random

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    fun roll(view: View) {
        val input = findViewById<EditText>(R.id.numberInput);
        val outputBox = findViewById<TextView>(R.id.outputText);
        val number = input.text.toString().toIntOrNull() ?: return;
        if (number >= 2147483647) return;
        val rand = Random.nextInt(1, number + 1);
        outputBox.text = rand.toString();
    }
}