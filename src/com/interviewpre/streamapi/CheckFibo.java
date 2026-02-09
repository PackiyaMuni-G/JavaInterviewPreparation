package com.interviewpre.streamapi;

public class CheckFibo {
    public static void main(String[] args) {
        int n1=0,n2=1;
        int sum=0;
        int n=7;
        for (int i = 0; i < n; i++) {

            sum = n1 + n2;
            n1=n2;
            n2=sum;

        }
        System.out.println(sum);

    }
}
