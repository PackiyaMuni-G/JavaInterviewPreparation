package com.interviewpre.program;



public class Duplicatewords {

    public static void main(String[] args) {
        String str = "HelloWorld";  // Example string
    
        char[] charArr = str.toCharArray();
     for(int i=0;i<charArr.length;i++) {
    	    int count=1;
    	 for(int j=i+1;j<charArr.length;j++) {
    		 if(charArr[i] == charArr[j] && charArr[j] != ' ') {
    			 count++;
    			 charArr[j]='0';
    		 }
    		 
    	 }
    	 if(count > 1 && charArr[i] != '0') {
    		 System.out.println(charArr[i] + " - " + count);
    	
    	 }
     }
        
        
     
    }

	}


