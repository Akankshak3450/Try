package com.company;

import java.util.HashMap;
import java.util.Scanner;

public class FrequencyCount {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
    }
    public static void frequencyCount(int arr[], int N, int P)
    {
        HashMap<Integer,Integer> hs = new HashMap<>();
        int count=0;
        for (int i = 0; i <N ; i++) {
            hs.put(arr[i],++count);
        }
    }
}
