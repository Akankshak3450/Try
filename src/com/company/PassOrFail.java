package com.company;

import java.util.Scanner;

public class PassOrFail {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int X = sc.nextInt();
        int P = sc.nextInt();
        POF(N,X,P);
    }
    public static void POF(int N,int X,int P){
        int g = X*3+(-1)*(N-X);
        if(g>=P){
            System.out.println("PASS");
        }else {
            System.out.println("FAIL");
        }
    }
}
/*
Chef is struggling to pass a certain college course.

The test has a total of N question, each question carries 3 marks for a correct answer and −1 for an incorrect answer. Chef is a risk-averse person so he decided to attempt all the questions. It is known that Chef got X questions correct and the rest of them incorrect. For Chef to pass the course he must score at least P marks.

Will Chef be able to pass the exam or not?
 */