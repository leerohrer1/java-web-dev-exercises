package org.launchcode.java.studios.funwithquizzes;

public class TrueFalse extends Question {
    private boolean correctAnswer;

    public TrueFalse(String question, boolean correctAnswer) {
        super(question);
        this.correctAnswer = correctAnswer;
    }

    public boolean checkAnswer(boolean response) {
        return response == correctAnswer;
    }
}
