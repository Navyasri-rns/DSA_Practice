package com.example.DSA.Quiz;

import java.util.Scanner;

public class QuestionService {

    Questions[] questions = new Questions[5];

    String selection[] = new String[5];

    public QuestionService(){
        questions[0] = new Questions(1, "size of int", "2", "6", "4", "8", "4");
        questions[1] = new Questions(2, "size of double","2", "6", "4", "8", "8");
        questions[2] = new Questions(3, "size of char", "2", "6", "4", "8", "2");
        questions[3] = new Questions(4, "size of long", "2", "6", "4", "8", "8");
        questions[4] = new Questions(5, "size of boolean", "1", "2", "4", "8", "1");
    }

    public void displayQuestions(){
        int i=0;
        for(Questions q : questions){
  //          System.out.println(q.getQuestion()); //prints only all the questions
            System.out.println("Question no: " + q.getId());
            System.out.println(q.getQuestion());
            System.out.println(q.getOpt1());
            System.out.println(q.getOpt2());
            System.out.println(q.getOpt3());
            System.out.println(q.getOpt4());
            System.out.print("enter answer: ");
            Scanner sc = new Scanner(System.in);
            selection[i] = sc.nextLine();
            i++;
        }
        System.out.println("Your answers: ");
        for(String s: selection){
            System.out.println(s);
        }
    }

    public void printScore(){
        int score = 0;
        for(int i = 0; i<questions.length; i++){
            Questions que = questions[i];
            String actualAnswer = que.getAnswer();

            String userAnswer = selection[i];

            if(actualAnswer.equals(userAnswer)){
                score++;
            }
        }
        System.out.println("Your score is: " + score);
    }
}
