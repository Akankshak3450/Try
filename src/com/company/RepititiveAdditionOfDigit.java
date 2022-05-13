package com.company;

import java.util.Scanner;

public class RepititiveAdditionOfDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        singleDigit(n);
    }
    static int singleDigit(int N){
        while (N>=10) {
            int sum = 0;
            while (N > 0) {

                int b = N % 10;
                sum += b;
            N = N / 10;
            }
            N = sum;
        }
        System.out.println(N);
        return N;
    }
}
