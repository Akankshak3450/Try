package com.company;

import java.util.Scanner;

public class MoveAllNegativeElementsToEnd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        segregateElements(arr,n);
    }
    public static void segregateElements(int arr[], int n)
    {
        int j=0;
        int[] temp = new int[n];
        for (int i = 0; i < n; i++) {
            if(arr[i]>0){
                temp[j] = arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            if(arr[i]<0){
                temp[j] =arr[i];
                j++;
            }
        }
        for (int i = 0; i < n; i++) {
            arr[i] = temp[i];
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
    }
}
