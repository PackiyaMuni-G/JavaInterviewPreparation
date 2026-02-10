package com.interviewpre.trickey;

public class PalindromeExample {
    public static void main(String[] args) {
        String s="racecar";
        boolean isPalindrome=true;
        for(int i=0;i<s.length()/2;i++){
            if (s.charAt(i) != s.charAt(s.length()-i-1)){
                isPalindrome=false;
                break;
            }


        }
        if (isPalindrome){
            System.out.println( s + " word is palindrome");
        }
        else
            System.out.println( s + " word is a  not a palindrome");

    }
}
