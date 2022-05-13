package com.company;
import java.util.*;
public class Main {
    public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
        System.out.println("\nEnter no.of elements in array : ");
	    int n = sc.nextInt();
	    int arr[] =new int[n];
        System.out.println("\nEnter data for array :");
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        System.out.print("\nArray is : ");
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i]+"  ");
        }
//        for (int i = 0; i < n-1; i++) {
//            for (int j = 0; j < n-i-1; j++) {
//               if(arr[j]>arr[j+1]){
//                   int temp = arr[j];
//                   arr[j] = arr[j+1];
//                   arr[j+1] = temp;
//               }
//            }
//        }
//        System.out.println("Sorted array is : ");
//        for (int i = 0; i < n; i++) {
//            System.out.print(arr[i]+"  ");
//        }
//        System.out.println("MAX value is : "+arr[n-1]);
//        System.out.println("MIN value is : "+arr[0]);
//
       /* int max = arr[0];
        for (int i = 1; i < n; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max of array is:"+max);
        int min = arr[0];
        for (int i = 1; i < n; i++) {
            if(min>arr[i]){
                min =arr[i];
            }
        }
        System.out.println("Min of array is: "+min);*/

//         int even =0;
//         int odd =0;
//        for (int i = 0;i < n; i++) {
//            if(arr[i]%2 ==0){
//                even++;
//            }else if(arr[i]%2 ==1){
//                odd++;
//            }
//
//        }
//        System.out.println("Even Elements : "+even);
//        System.out.println("Odd Elements : "+odd);
//        int[] Odd = new int[odd];
//        int[] Even = new int[even];
////        for (int i = 0; i < n; i++) {
////            for (int j = 0; j < even; j++) {
////                if(arr[i]%2 ==0){
////                    Even[j] =arr[i];
////                    System.out.println();
////                }
////            }
////
////        }
//        System.out.print("\nEven array is :  ");
//        for (int i = 0; i < n; i++) {
//            if(arr[i]%2 ==0){
//                for (int j = 0; j < even; j++) {
//                    Even[j] = arr[i];
//                    System.out.print(Even[j]+"  ");
//                    break;
//                }
//            }
//        }
//        System.out.print("\nOdd array is : ");
//        for (int i = 0; i < n; i++) {
//            if(arr[i]%2 !=0){
//                for (int j = 0; j < odd; j++) {
//                    Odd[j] = arr[i];
//                    System.out.print(Odd[j]+"  ");
//                    break;
//                }
//            }
//        }
//        do {
//            int temp = arr[n - 1];
//            for (int i = n - 1; i > 0; i--) {
//                arr[i] = arr[i - 1];
//            }
//            arr[0] = temp;
//            System.out.print("\nReversed array is : ");
//            for (int i = 0; i < n; i++) {
//                System.out.print(arr[i] + "   ");
//            }
//        }while(sc.nextInt()==1);
        int max = arr[0];
        for (int i = 1; i < n; i++) {
            if(max<arr[i]){
                max = arr[i];
            }
        }
        System.out.println("Max of array is:"+max);
        int fact =1;
        for (int i = max; i >= 1; i--) {
            fact = fact*i;
        }
        System.out.println("Factorial is : "+fact);
        Long g = sc.nextLong();
    }
}
