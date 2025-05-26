# 🏛 Ancient Egypt Flashcard Quiz App

---

## 📖 Overview

This mobile flashcard quiz app was developed in *Kotlin using Android Studio* for the IMAD5112 Assignment 2 at The IIE.  
The app is designed to help users test their knowledge of Ancient Egyptian history in a fun, interactive, and educational way.  
It features five true/false questions, instant feedback, scoring, and a review screen.

---

## 🎯 Purpose

The goal of the project is to demonstrate understanding of mobile app development concepts, including:
- Activity navigation using Intents
- Array handling and control logic (loops and conditions)
- UI design using ConstraintLayout
- User interaction and validation
- GitHub version control and documentation

---

## 🧩 Features on Each Screen

### 🔹 *Welcome Screen*
- Displays app title and description
- "Start Quiz" button launches the quiz

### 🔹 *Question Screen*
- Shows one question at a time from an array
- "True" and "False" buttons for answering
- Instant feedback displayed as "Correct!" or "Incorrect!"
- "Next" button moves to the next question

### 🔹 *Score Screen*
- Shows the user’s total score out of 5
- Displays a message:
  - “Great job!” if the score is 3 or more
  - “Keep practising!” if the score is less than 3
- Includes three buttons:
  - "Retry" to restart the quiz
  - "Review" to see all correct answers
  - "Exit" to close the app

### 🔹 *Review Screen*
- Lists all 5 questions with their correct answers
- "Back" button returns to the score screen

---

## 🎨 Design Considerations and Personal Touches

- *Color Scheme*:  
  - Warm yellows (#FFE798) and cool blues (#E1F5FE) were used for a calm, friendly interface
  - Green (#4CAF50) and red (#F44336) buttons clearly distinguish correct/incorrect choices
  - Blue-purple (#3F51B5) used for main navigation buttons

- *Layout & Text*:  
  - All screens use *ConstraintLayout* for responsive design
  - Text is kept large and readable (18–22sp)
  - Feedback is shown clearly in a TextView beneath each question

- *Personal Touches*:  
  - Egyptian-themed questions written by the developer
  - Friendly tone in the result messages
  - Back button added to Review screen for improved navigation

---

## ✅ Usability

- Clear navigation between screens
- Buttons are well spaced and responsive
- Prevents users from answering the same question multiple times
- App works smoothly on emulator with no crashes or visual bugs

---

## 🔁 Development Workflow

- Project was developed using *Android Studio* with Kotlin
- Code was written in a modular way using multiple Activities
- Frequent testing was done manually to ensure logic and UI correctness
- All views are linked using findViewById
- Scoring and feedback logic was added with strong attention to edge cases
- Code includes meaningful *in-line comments* for clarity
- Version control and documentation are managed via *GitHub*
