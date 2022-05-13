package com.company;

import java.util.Scanner;

public class RedLightGreenLight {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        int h =sc.nextInt();
        redGreen(arr,n,h);
    }
    public static void redGreen(int arr[],int n,int h ){
        int count=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>h){
                count++;
            }
        }
        System.out.println(count);
    }

}
/*
“You won’t get caught if you hide behind someone.”

Sang-Woo advises Gi-Hun to hide behind someone to avoid getting shot.

Gi-Hun follows Sang-Woo's advice and hides behind Ali, who saved his life earlier. Gi-Hun and Ali both have the same height, K. Many players saw this trick and also started hiding behind Ali.

Now, there are N players standing between Gi-Hun and Ali in a straight line, with the ith player having height Hi. Gi-Hun wants to know the minimum number of players who need to get shot so that Ali is visible in his line of sight
 */