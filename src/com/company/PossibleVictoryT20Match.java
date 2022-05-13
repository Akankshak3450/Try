package com.company;

import java.util.Scanner;

public class PossibleVictoryT20Match {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        int O = sc.nextInt();
        int c = sc.nextInt();
        int ro = (20-O);
        int runInOneOver = ro*6;
        int allOvers = runInOneOver*6;
        if(r<(c+allOvers)){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
