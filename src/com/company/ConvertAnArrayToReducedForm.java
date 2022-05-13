package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Scanner;

public class ConvertAnArrayToReducedForm {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        convert(arr,n);
    }
    public static void convert(int[] arr, int n) {
        //input array as [10,20,15,12,11,20]
        int [] temp = arr.clone();
        Arrays.sort(temp);
        //Sorted array [10,11,12,15,20,50]
        HashMap<Integer,Integer> hs = new HashMap<>();
        int j=0;
        for (int i = 0; i < n; i++) {
            hs.put(temp[i],j++);
        }
        //After above step
        //[<10,0>,<11,1>,<12,2>,<15,3>,<20,4>,<50,5> ]
        for (int i = 0; i < n; i++) {
            arr[i] = hs.get(arr[i]);
        }
        //After the above step
        //[0,4,3,2,1,5]


        for (int l = 0; l < n; l++) {
            System.out.print(arr[l]+"  ");
        }
    }

}
/*
OUTPUT :==
6
10
20
15
12
11
50
0  4  3  2  1  5

 */