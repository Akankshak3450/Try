package com.company;
import java.util.*;
public class KadaneAlgorithm {
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
        int sum=arr[0];
        int max =arr[0];
        for (int i = 0; i < n; i++) {
            if(sum>0){
                sum += arr[i];
            }else{
                max = sum;
            }
            if(max<sum){
                max = sum;
            }
        }
        System.out.println(max);

    }
}
