package com.interviewpre.oops;

public class OnlinePayment implements  Payment{
    @Override
    public void pay() {
        System.out.println("paid");
    }
}
