package com.company;

import java.util.ArrayList;
import java.util.HashMap;

public class FindDuplicatesFromStrings {
    public static void main(String[] args) {
        String str = "geeksforgeeks";
        count(str);
    }
    public static void count(String str){
        HashMap<Character,Integer> hm = new HashMap<>();
        for (int i = 0; i < str.length(); i++) {
            if(!hm.containsKey(str.charAt(i))){
                hm.put(str.charAt(i),1);
            }else{
                hm.put(str.charAt(i),hm.get(str.charAt(i))+1);
            }
        }
        ArrayList<Character> al = new ArrayList<>();
        for (int i = 0; i < str.length(); i++) {
            if(hm.containsKey(hm.get(str.charAt(i))>1)){
                al.add(str.charAt(i));
            }
        }
        System.out.println(al);
        System.out.println(hm);
    }
}
