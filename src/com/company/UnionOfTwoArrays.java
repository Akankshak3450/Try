package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class UnionOfTwoArrays {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter no.of elements in array : ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        int[] a = new int[n];
        int b[] = new int[m];
        System.out.println("Enter data for first array : ");
        for (int i = 0; i < n; i++) {
            a[i] = sc.nextInt();
        }
        System.out.println("Enter data for second array : ");
        for (int i = 0; i < m; i++) {
            b[i] = sc.nextInt();
        }
        doUnion(a,n,b,m);

    }
    public static int doUnion(int a[], int n, int b[], int m)
    {
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < n; i++) {
            hs.add(a[i]);
        }
        for (int i = 0; i < m;i++) {
            hs.add(b[i]);
        }
        System.out.println(hs);
        System.out.println(hs.size());
        return hs.size();
    }
}
