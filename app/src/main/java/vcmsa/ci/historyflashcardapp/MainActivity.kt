package vcmsa.ci.historyflashcardapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)

        // Find the Start Quiz button from the layout using its unique ID
        val startButton: Button = findViewById(R.id.btnStartQuiz)

        // Set a listener that will run when the user taps the Start button
        startButton.setOnClickListener {
            // Create an intent to go from this screen (MainActivity) to the Question screen
            val intent = Intent(this, Question::class.java)

            // Start the new activity using the intent we just created
            startActivity(intent)
        }
    }
}