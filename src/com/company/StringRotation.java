package com.company;

import java.util.Scanner;
import java.util.*;
public class StringRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] arr1 = {1, 3, 5, 7, 9};
        int n = arr1.length;
        int [] arr2 ={0,2,4,6,8};
        int m = arr2.length;

        int a= m+n;
        int temp [] = new int[a];
        int p=0,q=0;
        int last=0;
        for (int i = 0; i < a; i++) {
            if(p>n-1 || q>m-1){
                break;
            }else{
                if(arr1[p]<arr2[q]){
                    temp[i]= arr1[p];
                    p++;
                }else{
                    temp[i] = arr2[q];
                    q++;
                }
            }

            last=i;
        }
        if(p>n-1){
            for (int i = q; i < m; i++) {
                temp[++last] = arr2[q];
                q++;
            }
        }
        if(q>m-1){
            for (int i = p; i < n; i++) {
                temp[++last] = arr1[p];
                p++;
            }
        }
        for (int i = 0; i < a; i++) {
            System.out.print(temp[i]+"  ");

        }
//        for (int i = 0; i < temp.length; i++) {
//            if(i<n){
//                arr1[i] = temp[i];
//            }else{
//                arr2[i-n] = temp[i];
//            }
//        }
    }
}
