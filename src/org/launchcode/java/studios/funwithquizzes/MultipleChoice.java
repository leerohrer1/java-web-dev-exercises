package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class MultipleChoice extends Question{
    private String correctAnswer;
    private ArrayList<String> incorrectAnswers;

    public MultipleChoice(String question, String correctAnswer, ArrayList<String> incorrectAnswers) {
        super(question);
        this.correctAnswer = correctAnswer;
        this.incorrectAnswers = incorrectAnswers;
    }

    public boolean checkAnswer(String response) {
        return response == correctAnswer;
    }
}
