package com.interviewpre.exception;



class FinaliseExample {
    public static void main(String[] args)
    {
        System.out.println("Main function running");
        System.gc();
    }
    // Here overriding finalize method
    public void finalize()
    {
        System.out.println("finalize method overridden");
    }
}
