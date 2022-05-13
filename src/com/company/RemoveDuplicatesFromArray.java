package com.company;
import java.util.*;
public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements in array : ");
        int n = sc.nextInt();
        int arr[] = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
//        int i=1;
//        int next=0;
//        int x= arr[0];
//        while(i<n){
//            System.out.println(x);
//            next = arr[i];
//            while(x == next){
//                i++;
//                next = arr[i];
//            }
//            x = next;
//            i++;
//        }
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(arr[i]);

        }
        System.out.println(hs);
    }
}


