//package com.company;
//import java.util.ArrayList;
//import java.util.List;
//import java.util.*;
//
//public class PlusMinus {
//    private static Object List;
//    private static Object Integer;
//
//    public static void main(String[] args) {
//        Scanner sc = new Scanner(System.in);
//        List<Integer> arr = LinkedList<Integer>(-1,-1,0,2,1,2,0,-1,0,-1);
//    }
//    public static void plusMinus(List<Integer> arr) {
//        // Write your code here
//        List <Integer> pos = new ArrayList<>();
//        List <Integer> neg = new ArrayList<>();
//        List <Integer> zeros = new ArrayList<>();
//        int n = arr.size();
//        for (int i = 0; i < n; i++) {
//            int temp=arr.get(i);
//            if(temp >0){
//                pos.add(i);
//            }else if(temp<0){
//                neg.add(i);
//            }else{
//                zeros.add(i);
//            }
//        }
//        int s = pos.size();
//        int b = neg.size();
//        int g = zeros.size();
//        int q = arr.size();
//        double c = s/q;
//        double a= b/q;
//        double v = g/q;
//        System.out.println(c);
//        System.out.println(a);
//        System.out.println(v);
//    }
//}
