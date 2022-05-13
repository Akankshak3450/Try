package com.company;

import java.util.Scanner;

public class CheckPrimeNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        boolean b = true;
        for (int i = 2; i <=n/2 ; i++) {
            if(n%2 ==0){
                b =false;
                System.out.println(n+" is prime number ");
                break;
            }else {
                System.out.println(n + " is not a prime");
                break;
            }
        }
    }
}
