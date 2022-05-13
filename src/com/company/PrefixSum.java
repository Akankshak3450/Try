package com.company;

import java.util.Scanner;

public class PrefixSum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        prefix(arr,n);
    }
    public static void prefix(int arr[] , int n){
        int[] temp = new int[n];
        int sum=0;
        for (int i = 0; i < n; i++) {
            sum += arr[i];
            temp[i] = sum;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(temp[i]+"  ");
        }
    }
}
