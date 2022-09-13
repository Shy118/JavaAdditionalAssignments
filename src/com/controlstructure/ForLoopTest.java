package com.controlstructure;

public class ForLoopTest {

	public static void main(String[] args) {
		int value = 5;
		int fact = 1;
		for (int i = 1; i <= value; i++) {
			fact *= i;
		}
		System.out.println(fact);
		
	}
}
