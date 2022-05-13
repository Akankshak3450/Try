package com.company;

import java.util.Scanner;

public class CountingPrettyNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        countPrettyNumber(n, m);
    }

    public static void countPrettyNumber(int n, int m) {
        int count = 0;
        for (int i = n; i <= m; i++) {
            int s = i%10;
            if(s ==2 || s ==3|| s==9)
                    count++;
        }

        System.out.println(count);
    }
}

