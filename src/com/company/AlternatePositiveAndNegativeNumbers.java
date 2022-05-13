package com.company;

import java.util.ArrayList;
import java.util.Scanner;

public class AlternatePositiveAndNegativeNumbers {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements in array : ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        rearrange(arr,n);
    }
    public static void rearrange(int [] arr,int n){
        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        int p=0;
        int ne=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>=0){
                p++;
            }else{
               ne++;
            }
        }
        int po[] = new int[p];
        int index=0;
        int [] ng= new int[ne];
        int ind=0;
        for (int i = 0; i < n; i++) {
            if(arr[i]>=0){
                po[index] = arr[i];
                index++;
            }else{
                ng[ind] = arr[i];
                ind++;
            }
        }
        for (int i = 0; i < p; i++) {
            System.out.println(po[i]);
        }
        for (int i = 0; i < ne; i++) {
            System.out.println(ng[i]);
        }
        int nd =0;
        int ns =1;
        for (int i = 0; i < p; i++) {
            arr[nd] = po[i];
            nd = nd+2;
        }
        for (int i = 0; i < ne; i++) {
            arr[ns] = ng[i];
            ns = ns+2;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"   ");
        }

    }
}
