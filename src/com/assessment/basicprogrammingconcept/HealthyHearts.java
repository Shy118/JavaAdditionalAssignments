package com.assessment.basicprogrammingconcept;

import java.util.Scanner;

public class HealthyHearts {

	public static void main(String[] args) {
		int age;
			
		Scanner inputReader = new Scanner(System.in);
		
		System.out.println("What is your age?");
		age = Integer.parseInt(inputReader.nextLine());
		
		int max = (220 - age);
		int low = (int) (max*0.5);
		int high = (int) (max*0.85);
		System.out.println("Your maximum heart rate should be " + max + " beats per minute.");
		System.out.println("Your target HR Zone is " + low + " - " + high + " beats per minute.");
	} //main

} //class
