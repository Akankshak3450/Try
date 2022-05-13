package com.company;

import java.util.Scanner;

public class LuckyFour {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n =sc.nextInt();
        int count=0;
        while(n>0){
            int d = n%10;
            if(d ==4){
                count++;
            }
            n = n/10;
        }
        System.out.println(count);
    }
}
/*
Kostya likes the number 4 much. Of course! This number has such a lot of properties .
 */
