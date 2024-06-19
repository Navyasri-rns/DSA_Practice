package com.example.DSA.Quiz;

public class Display {

    public static void main(String[] args) {

        QuestionService qs = new QuestionService();
        qs.displayQuestions();
        qs.printScore();
    }
}
