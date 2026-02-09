package com.interviewpre.streamapi;

public class CheckPrime {
    public static void main(String[] args) {
        boolean isPrime = true;
        int n = 25;

        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) {
                isPrime = false;

            }

        }
        if(isPrime){
            System.out.println(n +" prime");
        }
        else
            System.out.println(n +" not a prime");
    }


}