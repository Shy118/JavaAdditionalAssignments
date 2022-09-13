package com.controlstructure;

public class DoWhileLoop {

	public static void main(String[] args) {
		int result = 0;
		int preValue = 0;
		int nextValue = 1;
		int count = 0;
		do  {
			System.out.println(preValue);
			result = nextValue + preValue;
			preValue = nextValue;
			nextValue = result;
			count++;	
		} while(count < 10);
	} //main

} //class
