package com.company;
import java.util.*;
public class MaxHourGlassInArray {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                arr[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < m; j++) {
                System.out.print(arr[i][j] + "  ");
            }
            System.out.println();
        }
        int largestSum = 0;
        int res = 0;
        for (int i = 1; i < n - 1; i++) {
            for (int j = 1; j < m - 1; j++) {
                int sum = arr[i - 1][j - 1] + arr[i][j - 1] + arr[i + 1][j - 1] + arr[i][j] + arr[i - 1][j + 1] + arr[i][j + 1] + arr[i + 1][j + 1];

                if (i == 0 && j == 0) {
                    largestSum = sum;
                } else {
                    if (sum > largestSum) {
                        largestSum = sum;
                    }
                }
            }
        }
        System.out.println(largestSum);
    }
}
