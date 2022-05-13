package com.company;
import java.util.*;
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter a number : ");
        int n = sc.nextInt();
        int rev =0;
        int remainder;
        while(n!=0){
            remainder = n%10;
            rev = rev*10+remainder;
            n /=10;
        }
        System.out.println("Reversed number is : "+rev);
    }
}
