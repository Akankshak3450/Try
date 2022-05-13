package com.company;
import java.util.*;
public class CheckWhetherANumberIsPalindromeOrNot {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("ENter a number:");
        int n = sc.nextInt();
        int temp=n;
        int rem,rev=0;
        while(n!=0){
            rem =n%10;
            rev = rev*10+rem;
            n/=10;
        }
        System.out.println("reversed number is : "+rev);
        if(rev != temp){
            System.out.println("Not palindrome");
        }else{

            System.out.println("Palindrome");
        }
    }
}
