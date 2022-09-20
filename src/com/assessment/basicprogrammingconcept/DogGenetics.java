package com.assessment.basicprogrammingconcept;

import java.util.Random;
import java.util.Scanner;

public class DogGenetics {

	public static void main(String[] args) {
		String dogname;
		int[] arr = new int[5];
		int max = 100000;
		int sum = 0;
		Random rand = new Random();
		
		for (int i = 0; i < arr.length; i++ ) {
			int num = rand.nextInt(max) + 1;
			arr[i] = num;
			sum += num;
		} //for
		
		Scanner InputReader = new Scanner(System.in);
		
		System.out.println("What is your dog's name?");
		dogname = InputReader.nextLine();
		System.out.println("Well then, I have this highly reliable report on " + dogname + "'s prestigious background right here.");
	
		System.out.println(dogname + " is:\n");
		System.out.println(arr[0]*100/sum + " Golden Retriever");
		System.out.println(arr[1]*100/sum + " Chihuahua");
		System.out.println(arr[2]*100/sum + " German Shepherd");
		System.out.println(arr[3]*100/sum + " husky");
		System.out.println(100 - arr[0]*100/sum - arr[1]*100/sum - arr[2]*100/sum - arr[3]*100/sum + " St. Bernard");	
	} //main
	
} //class
