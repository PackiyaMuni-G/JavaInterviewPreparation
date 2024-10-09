package com.interviewpre.exception;


class CustomException extends Exception{

	public CustomException(String msg) {
		super(msg);
		
	}
	

	
}




public class CustomExceptionExample {

	public static void main(String[] args) {
		
		int age=16;
		
		try {
			isAgeLimit(age);
		} catch (CustomException e) {
			// TODO Auto-generated catch block
		System.out.println(e.getMessage());
		}
		
		
		
		

	}
	public static void isAgeLimit(int age) throws CustomException {
		if(age < 18) {
			throw new CustomException("Age is not satisfy");
		}
		else
			System.out.println("eligible");
	}


}
