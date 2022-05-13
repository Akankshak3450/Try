package com.company;

import java.util.Arrays;
import java.util.Scanner;
import java.util.concurrent.atomic.AtomicReferenceArray;

public class TheSquidGame {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        SquidGame(arr,n);
    }
    public static void SquidGame(int arr[],int n){
        int amount=0;
        Arrays.sort(arr);
        for (int i = 1; i < n; i++) {
            amount += arr[i];
        }
        System.out.println(amount);
    }
}
