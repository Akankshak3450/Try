package com.company;

import java.util.Scanner;

public class CheckWhetherMatrixContainsANumberOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int [][] matrix = new int[3][4];
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                matrix[i][j] = sc.nextInt();
            }

        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 4; j++) {
                System.out.print(matrix[i][j]+"  ");
            }
            System.out.println();
        }
        int target=sc.nextInt();
        int temp=0;

        for(int i=0;i<3;i++){
            for(int j=0;j<4;j++){
                if(target == matrix[i][j]){
                    temp =1;
                }
            }
        }
        if(temp==1)
            System.out.println("true");
        else System.out.println("false");
    }
}
