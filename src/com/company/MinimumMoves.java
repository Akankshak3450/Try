package com.company;

import java.util.Scanner;

public class MinimumMoves {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        int count=0;

        while(t>0){
            int A = sc.nextInt();
            int B = sc.nextInt();
            while(A!=B){
                if(A<B) {
                    A = A + 1;
                    count++;
                }else{
                    B = B+1;
                    count++;
                }
            }
            t--;
        }
        System.out.println(count);
    }
}
