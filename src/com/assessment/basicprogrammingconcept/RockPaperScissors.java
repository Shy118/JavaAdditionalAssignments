package com.assessment.basicprogrammingconcept;

import java.util.Random;
import java.util.Scanner;

public class RockPaperScissors {

	public static void main(String[] args) {
		boolean playing = true;
		int userWinCount;
		int comWinCount;
		int tieCount;
		int userChoice;
		int computerChoice;
		int numRounds;
		
		Random rand = new Random();
		Scanner inputReader = new Scanner(System.in);

		System.out.println("Welcome to Rock, Paper, Scissors game");
		while (playing) {
			userWinCount = 0;
			comWinCount = 0;
			tieCount = 0;
			System.out.println("Please choose the number of rounds to play (1 to 10)");
			numRounds = Integer.parseInt(inputReader.nextLine());
			if (numRounds >= 1 && numRounds <= 10) {
				for (int roundCounter = 1; roundCounter <= numRounds; roundCounter++) {
					do {
						System.out.println("Please indicate your choice (1 = Rock, 2 = Paper, 3 = Scissors)");
						userChoice = Integer.parseInt(inputReader.nextLine());;
					} while (userChoice != 1 && userChoice != 2 && userChoice != 3); //do while
					computerChoice = rand.nextInt(3) + 1;
					if (userChoice == computerChoice) {
						System.out.println("It's a tie!");
						tieCount++;
					} //if
					else if (userChoice - computerChoice == 1 || userChoice - computerChoice == -2) {
						System.out.println("You win!");
						userWinCount++;
					} //else if
					else {
						System.out.println("Computer win!");
						comWinCount++;
					} //else
				} //for
				System.out.println("Game Over!");
				System.out.println("Total rounds played: " + numRounds);
				System.out.println("Overall results: " + " Ties = " + tieCount + " | you won " + userWinCount + " | Computer won " + comWinCount);
				if (userWinCount > comWinCount) {
					System.out.println("You are the winner!");
				} //if
				else if (userWinCount < comWinCount) {
					System.out.println("Computer are the winner!");
				} //else if
				else {
					System.out.println("It's a TIE!");
				} //else
				System.out.println("Do you still want to play again? (Yes or No)");
				String cont = inputReader.nextLine();
				if (cont.equals("No")) {
					playing = false;
				} //if
			} //if
			else {
				System.out.println("Eror! Invalid number of rounds entered");
				break;
			} //else
		} //while
		System.out.println("Thanks for playing!");
	} //main

} //class
