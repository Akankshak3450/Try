package com.company;

import java.util.Scanner;

public class BlackCellsInChessBoard {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int d = n*n/2;
        System.out.println(d);
    }
}
/*
Given n (n is even), determine the number of black cells in an n×n chessboard.
 */