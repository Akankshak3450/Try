package com.company;

import java.util.Arrays;
import java.util.Scanner;

public class CommonElementsInAllRowsAndCols {
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
        int temp[] =new int[rows*cols];
        int t =0;
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < cols; j++) {
                temp[t] = mat[i][j];
                t++;
            }
        }
        Arrays.sort(temp);
        int r=0;
        for (int i = 0; i < temp.length-1; i++) {
           r = temp[i];
            for (int j = 0; j < rows-1; j++) {
                for (int k = 0; k < cols-1; k++) {
                    if(temp[i] == mat[j][k]) {

                    }
                }
            }

        }
        System.out.println(r);

    }
}
