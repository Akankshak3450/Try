package com.company;
import java.util.Scanner;
public class RotateMatrixBy90 {
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
//        for (int i = 0; i < rows / 2; i++)
//        {
//            for (int j = i; j <cols - i - 1; j++)
//            {
//                int temp = mat[i][j];
//                mat[i][j] = mat[cols - 1 - j][i];
//                mat[cols - 1 - j][i] = mat[rows - 1 - i][cols - 1 - j];
//                mat[rows - 1 - i][cols - 1 - j] = mat[j][rows - 1 - i];
//                mat[j][rows - 1 - i] = temp;
//            }
//        }
        System.out.println("-----------------------------------");
        System.out.println("Rotated matrix is : ");
        for (int i = 0; i < rows; i++) {
            for (int j = cols - 1; j >= 0; j--) {
                System.out.print(mat[j][i] + "  ");
            }
            System.out.println();
        }
        /*
        00 01 02
        10 11 12
        20 21 22

        After rotating the matrix by 90 degrees in clockwise direction, indices transform into
            20 10 00  current_row_index = 0, i = 2, 1, 0
            21 11 01 current_row_index = 1, i = 2, 1, 0
            22 12 02  current_row_index = 2, i = 2, 1, 0

             j = current_row_index.
         */
    }
}
