package vcmsa.ci.historyflashcardapp

import android.content.Intent
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity

class Question : AppCompatActivity() {

    // Array of quiz questions related to ancient Egypt
    private val questions = arrayOf(
        "The Great Pyramid of Giza is the oldest of the Seven Wonders of the Ancient World.",
        "Tutankhamun was one of the longest-reigning Pharaohs in ancient Egypt.",
        "The Nile River flows from north to south.",
        "Hieroglyphics were the writing system used by ancient Egyptians.",
        "Cleopatra was the last active ruler of the Ptolemaic Kingdom of Egypt."
    )

    // Array of correct answers corresponding to the questions above
    private val answers = booleanArrayOf(true, false, false, true, true)

    // Index of the current question being shown
    private var currentIndex = 0

    // Counter to keep track of the user's score
    private var score = 0

    // Flag to check if the user has already answered the current question
    private var hasAnswered = false

    // Variables for UI elements
    private lateinit var txtQuestion: TextView
    private lateinit var txtFeedback: TextView
    private lateinit var btnTrue: Button
    private lateinit var btnFalse: Button
    private lateinit var btnNext: Button

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_question)

        //  linking UI elements to Kotlin variables
        txtQuestion = findViewById(R.id.txtQuestion)
        txtFeedback = findViewById(R.id.txtFeedback)
        btnTrue = findViewById(R.id.btnTrue)
        btnFalse = findViewById(R.id.btnFalse)
        btnNext = findViewById(R.id.btnNext)

        // Show the first question when the screen loads
        loadQuestion()

        //  Handle True button click – only allow once per question
        btnTrue.setOnClickListener {
            if (!hasAnswered) {
                checkAnswer(true)
            }
        }

        //  Handle False button click – only allow once per question
        btnFalse.setOnClickListener {
            if (!hasAnswered) {
                checkAnswer(false)
            }
        }

        //  Handle Next button click – load the next question or go to Score screen
        btnNext.setOnClickListener {
            if (currentIndex < questions.size - 1) {
                currentIndex++
                loadQuestion()
            } else {
                // When all questions are done, go to Score screen
                val intent = Intent(this, Score::class.java)
                intent.putExtra("score", score)
                intent.putExtra("total", questions.size)
                startActivity(intent)
                finish()
            }
        }
    }

    //  Loads the current question and resets button state
    private fun loadQuestion() {
        txtQuestion.text = questions[currentIndex]         // Display the current question
        txtFeedback.text = ""                              // Clear any previous feedback
        hasAnswered = false                                // Allow answering again

        btnTrue.isEnabled = true                           // Re-enable buttons
        btnFalse.isEnabled = true
    }

    //  Checks the user's answer and displays feedback, disables further input
    private fun checkAnswer(userAnswer: Boolean) {
        val correctAnswer = answers[currentIndex]

        if (userAnswer == correctAnswer) {
            txtFeedback.text = "Correct!"                  // Show "Correct!" if answer is right
            score++                                        // Increase score only once
        } else {
            txtFeedback.text = "Incorrect!"                // Show "Incorrect!" otherwise
        }

        hasAnswered = true                                 // Mark question as answered
        btnTrue.isEnabled = false                          // Disable both buttons
        btnFalse.isEnabled = false
    }
}