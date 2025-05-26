package vcmsa.ci.historyflashcardapp

import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity

class Review : AppCompatActivity() {



    // Array containing the review questions
    private val questions = arrayOf(
        "The Great Pyramid of Giza is the oldest of the Seven Wonders of the Ancient World.",
        "Tutankhamun was one of the longest-reigning Pharaohs in ancient Egypt.",
        "The Nile River flows from north to south.",
        "Hieroglyphics were the writing system used by ancient Egyptians.",
        "Cleopatra was the last active ruler of the Ptolemaic Kingdom of Egypt."
    )

    // Array holding the correct True/False answers to the above questions
    private val answers = booleanArrayOf(true, false, false, true, true)

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_review)



        // Reference to the TextView that will display the full review content
        val txtReview: TextView = findViewById(R.id.txtReview)

        // Reference to the Back button to return to the Score screen
        val btnBack: Button = findViewById(R.id.btnBack)



        // Create a string of all questions with their correct answers
        val reviewContent = StringBuilder()
        for (i in questions.indices) {
            val qNumber = i + 1                                      // Question number
            val answerText = if (answers[i]) "True" else "False"     // Convert boolean to text
            reviewContent.append("Q$qNumber: ${questions[i]}\n")     // Add question
            reviewContent.append("Answer: $answerText\n\n")          // Add answer
        }

        // Set the review content text to the TextView
        txtReview.text = reviewContent.toString()



        // When Back is clicked, close the Review screen and return to the Score screen
        btnBack.setOnClickListener {
            finish()  // Ends the current activity and returns to the previous one
        }
    }
}