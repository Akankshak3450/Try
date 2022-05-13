package com.company;
import java.util.*;
public class FibonacciSeries {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of terms : ");
        int n = sc.nextInt();
        int firstterm =0;
        int secondterm =1;
        int nextterm;
        for (int i = 1; i <=n ; i++) {
            System.out.print(firstterm+"  ");
            nextterm = firstterm+secondterm;
            firstterm =secondterm;
            secondterm = nextterm;
        }
    }
}
