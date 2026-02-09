package com.interviewpre.streamapi;

public class CheckPalindrome {
    public static void main(String[] args) {
        boolean isPalindrom = true;
        String str="java";
        for (int i=0;i<str.length();i++){
            if (str.charAt(i) != str.charAt(str.length()-1-i)){
               isPalindrom=false;
            }

        }
       if(isPalindrom){
           System.out.println("palindrome");
       }
       else
           System.out.println("not a palindrome");
    }
}
