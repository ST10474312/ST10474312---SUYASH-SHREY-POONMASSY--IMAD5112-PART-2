package vcmsa.ci.historyflashcardapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Score : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_score)

        // Get user's score from the Question screen
        val score = intent.getIntExtra("score", 0)
        val total = intent.getIntExtra("total", 0)

        // Connect UI views
        val txtResult: TextView = findViewById(R.id.txtResult)
        val btnRetry: Button = findViewById(R.id.btnRetry)
        val btnExit: Button = findViewById(R.id.btnExit)
        val btnReview: Button = findViewById(R.id.btnReview)

        // 🔽 NEW: Add a personalised message based on score
        val feedbackMessage = if (score >= 3) {
            "Great job!"
        } else {
            "Keep practising!"
        }

        // Display result and feedback
        txtResult.text = "You got $score out of $total correct!\n$feedbackMessage"

        // Retry the quiz (back to welcome screen)
        btnRetry.setOnClickListener {
            val intent = Intent(this, MainActivity::class.java)
            intent.addFlags(Intent.FLAG_ACTIVITY_CLEAR_TOP or Intent.FLAG_ACTIVITY_NEW_TASK)
            startActivity(intent)
            finish()
        }

        // Exit the app
        btnExit.setOnClickListener {
            finishAffinity()
        }

        // Review answers screen
        btnReview.setOnClickListener {
            val intent = Intent(this, Review::class.java)
            startActivity(intent)
        }
    }
}