package com.interviewpre.multithtread;

public class ThreadTrickey {
    public static void main(String[] args) {
        Thread t=new Thread(() -> {
           System.out.println("thread running");
        });
        t.start();
        t.start();
        //Calling start() twice on the same Thread object causes IllegalThreadStateException because a thread can be started only once in its lifecycle.
    }
}
