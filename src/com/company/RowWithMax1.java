package com.company;

import java.util.Scanner;

public class RowWithMax1 {
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
        int i=0;
        int j=cols-1;
        int res =-1;
        while(i<rows&&j>=0){
            if(mat[i][j]==1){
                res =i;
                j--;
            }else{
                i++;
            }
        }
        System.out.println("Maximum no. of 1's is present in "+res+" row");
    }
}
