package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class SortedMatrix {
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
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }
        int temp[] = new int[rows*cols];
        int u = temp.length;
        int k=0;

        Arrays.sort(temp);
        for (int i = 0; i < temp.length; i++) {
            System.out.print(temp[i]+"  ");
        }


    }
}
