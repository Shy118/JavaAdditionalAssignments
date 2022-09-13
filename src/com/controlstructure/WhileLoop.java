package com.controlstructure;

public class WhileLoop {

	public static void main(String[] args) {
		int x = 1234321;
		
        int revertedNumber = 0;
        if(x < 0) {
            System.out.print("The int variable is not a palindrome");;
        } //if
        else {
	        while(revertedNumber < x) {
	            revertedNumber = revertedNumber * 10 + x % 10;
	            x /= 10;
	        } //while
	        if (x == revertedNumber || x == revertedNumber/10) {
	        	System.out.print("The int variable is a palindrome");;
	        } //if
	        else {
	        	System.out.print("The int variable is not a palindrome");;  
	        } //else
        } //else
	} //main
} //class
