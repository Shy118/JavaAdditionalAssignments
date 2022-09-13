package com.controlstructure;

public class SwitchCaseTest {

	public static void main(String[] args) {
		char chr = 'k';
		switch(chr) {
			case 'a','e','i','o','u': {
				System.out.println("The character is a vowel");
			}
			break;
			default: {
				System.out.println("The character is not a vowel");			
			}
		}
	}

}
