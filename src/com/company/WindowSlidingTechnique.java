package com.company;

import java.util.Scanner;

public class WindowSlidingTechnique {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no. of terms : ");
        int n =sc.nextInt();
        System.out.println("Enter elements for array : ");
        int arr[] =new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
        int k = sc.nextInt();
        windowSliding(arr,n,k);
    }
    public static void windowSliding(int arr[],int n,int k){
        int sum = Integer.MIN_VALUE;
        for(int i=0;i<n-k+1;i++){
            int curSum = 0;
            for (int j = 0; j < k; j++)
                curSum += arr[i+j];
            sum = Math.max(curSum,sum);
        }
        System.out.println(sum);
    }
}
