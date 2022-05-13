package com.company;

import java.util.HashSet;
import java.util.Scanner;

public class RemoveDuplicates {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        RemoveDuplicates(arr);
    }
    public static int RemoveDuplicates(int[] nums) {
        int j = 0;
        HashSet<Integer> hs = new HashSet<>();
        for (int i = 0; i < nums.length; i++) {
           hs.add(nums[i]);
        }
        int e = (int)('_');
        System.out.println(hs);
        int h = hs.size();
        while(h<= nums.length){
            hs.add(e);
            h++;
        }
        System.out.println(hs);
        return 0;
    }
}
