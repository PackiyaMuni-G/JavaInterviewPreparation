package com.interviewpre.trickey;

public class NumberPalindrome
{
    public static void main(String[] args) {
        int reverse=0;
        int n=121;
        int original=n;
        System.out.println(n);
        System.out.println(original);
        while(n > 0){  //12

            int digit = n % 10; // 121/10 -> 1 2 1
            reverse = reverse * 10 + digit; // 1 1*10+2 12*10+1
            n = n / 10; //2  //0

        }
    System.out.println(n);
        if(original == reverse){
            System.out.println( original + "is a palindrome");
        }
        else
            System.out.println( original + " it is not a palindorme");

    }
}
