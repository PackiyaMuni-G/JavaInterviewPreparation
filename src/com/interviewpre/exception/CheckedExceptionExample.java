package com.interviewpre.exception;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class CheckedExceptionExample {
public static void main(String[] args) {
	try {
	FileReader file=new FileReader("myfile.txt");
	}catch(FileNotFoundException e) {
		System.out.println("filenotfount occured");
	}
}
}
