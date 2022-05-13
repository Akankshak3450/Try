package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class MedianInRowwiseSortedMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter rows and cols : ");
        int rows = sc.nextInt();
        int cols = sc.nextInt();
        int mat[][]= new int[rows][cols];
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        int temp[] = new int[rows*cols];
        int i=0;
        while(i< temp.length) {
            for (int j = 0; j < rows; j++) {
                for (int k = 0; k < cols; k++) {
                    temp[i] = mat[j][k];
                    i++;
                }
            }
        }
        Arrays.sort(temp);
        for (int y = 0; y < temp.length; y++) {
            System.out.print(temp[y]+"  ");
        }
        System.out.println("Median of a matrix is : "+temp[temp.length/2]);
    }
}
