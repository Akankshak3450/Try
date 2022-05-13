package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class LeftRotation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        List<Integer> my_list = new ArrayList<>();
        int nn = sc.nextInt();
        for (int i = 0; i < nn; i++) {
            my_list.add(sc.nextInt());
        }
        System.out.println(my_list);
        int d = sc.nextInt();
        int n = my_list.size();
        int arr[] = new int[n];
        //int j=0;
        for (int i = 0; i < n; i++) {
            arr[i] = my_list.get(i);
         //   j++;
        }
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
        int k=0;
        while(k<d){
           int temp =arr[0];
            for (int i = 1; i < n; i++) {
                arr[i-1] = arr[i];
            }
            arr[n-1] = temp;
            k++;
        }
        my_list.clear();
        for (int i = 0; i < n; i++) {
            my_list.add(arr[i]);
        }

        System.out.println("-------------------------------------------------------");
        System.out.println(my_list);
    }
}
