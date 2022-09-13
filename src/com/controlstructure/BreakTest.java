package com.controlstructure;

public class BreakTest {

	public static void main(String[] args) {
		
		for (int i = 1; i <= 100; i++) {
			boolean isprime = true;
			for (int j = 2; j < i; j++) {
				if ((i % j) == 0) {
					isprime = false;
					break;
				} //if
			}// for
			if (isprime == true) {
				System.out.println("i " + i);
			} //if
		} //for
	} //main
} //class
