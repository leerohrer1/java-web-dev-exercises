package org.launchcode.java.studios.funwithquizzes;

import java.util.ArrayList;

public class Quiz {
    private ArrayList<Question> questions;
    private ArrayList<Question> answers;

    public Quiz(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public ArrayList<Question> getQuestions() {
        return questions;
    }

    public void setQuestions(ArrayList<Question> questions) {
        this.questions = questions;
    }

    public void addQuestion(Question question) {
        questions.add(question);
    }

    public ArrayList<Question> getAnswers() {
        return answers;
    }

    public void setAnswers(ArrayList<Question> answers) {
        this.answers = answers;
    }

}
