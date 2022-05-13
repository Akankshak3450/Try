package com.company;

import java.util.Scanner;

public class SpiralOfTheMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m= sc.nextInt();
        int mat[][] = new int[n][m];
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                mat[i][j] = sc.nextInt();
            }
        }
        for (int i = 0; i < n; i++) {
            for (int j = 0; j <m ; j++) {
                System.out.print(mat[i][j]+"  ");
            }
            System.out.println();
        }

        int i=0;
        for (int j = 0; j < n; j++) {
            System.out.print(mat[i][j]+" ");
        }
        int j=m-1;
        for (int k = 1; k < n; k++) {
            System.out.print(mat[k][j]+" ");
        }
        int k=n-1;
        for (int l = m-2; l >=0 ; l--) {
            System.out.print(mat[k][l]+" ");
        }
        int l=1;
        for (int o = n-1; o > l; o--) {
            System.out.print(mat[l][o]);
        }
        int o=0;
        for (int p = n-2; p >1 ; p--) {
            System.out.print(mat[p][o]+" ");
        }

    }

}
