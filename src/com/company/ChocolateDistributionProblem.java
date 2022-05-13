package com.company;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class ChocolateDistributionProblem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Long> al = new ArrayList<>();
        Long n = sc.nextLong();
        for (int i = 0; i < n; i++) {
            al.add(sc.nextLong());
        }
        System.out.println("Enter no. of students : ");
        long m = sc.nextLong();
        findMinDiff(al,n,m);
    }
    public static long findMinDiff (ArrayList<Long> a, long n, long m) {
        Long arr[] = new Long[(int) n];
        for (int i = 0; i < n; i++) {
            arr[i] = a.get(i);
        }
        Arrays.sort(arr);
        int M = (int) m;
        int min=0;
        int sum=0;

        min = (int) (arr[M-1]-arr[0]);
        for(int i=0;i<n;i++){
            int k = (int) ((int)i+m-1);
            sum= (int) (arr[k]-arr[i]);
            if(sum>min){
                sum = min;
            }
            if(k==(n-1)){
                break;
            }
        }
        System.out.println(sum);
        return (long)sum;
    }
}
