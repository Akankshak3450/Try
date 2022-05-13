package com.company;

public class RotationOfString {
    public static void main(String[] args) {
        String str1 = "ABACD";
        String str2 = "CDABA";
        System.out.println(tue(str1,str2));
    }
    public static int tue(String s1,String s2){
        String temp = s1+s1;
        int flag =0;
        for (int i = 0; i < temp.length()-s1.length(); i++) {
            String sd = temp.substring(i,i+s1.length());
            if(s2.contentEquals(sd)){
                System.out.println(sd);
                flag =1;
            }else{
                continue;
            }
        }
        return flag;
    }
}
