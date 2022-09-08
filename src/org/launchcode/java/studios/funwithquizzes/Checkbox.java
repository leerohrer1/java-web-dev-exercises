package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class Checkbox extends Question{
    private ArrayList<String>  correctAnswers = new ArrayList<>();
    private ArrayList<String> incorrectAnswers = new ArrayList<>();

    public Checkbox(String question, ArrayList<String> correctAnswers, ArrayList<String> incorrectAnswers) {
        super(question);
        this.correctAnswers = correctAnswers;
        this.incorrectAnswers = incorrectAnswers;
    }

    public ArrayList<Boolean> checkAnswer(ArrayList<String> responses) {
        ArrayList<Boolean> checkedAnswers = new ArrayList<>();
        for(String correctAnswer : correctAnswers) {
            for(String response : responses) {
                checkedAnswers.add(correctAnswer == response);
            }
        }
        return checkedAnswers;
    }

    public ArrayList<String> getIncorrectAnswers() {
        return incorrectAnswers;
    }

    public void setIncorrectAnswers(ArrayList<String> incorrectAnswers) {
        this.incorrectAnswers = incorrectAnswers;
    }
}