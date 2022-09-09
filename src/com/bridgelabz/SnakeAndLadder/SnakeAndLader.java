package com.bridgelabz.SnakeAndLadder;

public class SnakeAndLader {

	public static int rollCheck() {
		int rollValue = (int) (Math.floor(Math.random() * 10 % 6 + 1));
		return rollValue;

	}

	public static int options() {
		int option = (int) (Math.floor(Math.random() * 10 % 3));
		return option;
	}

	public static void main(String[] args) {
		int position1 = 0, counter = 0;
		System.out.println("Welcome to Snake and Ladder Game");
		System.out.println("Position of Player1 is:" + position1);
		int winningPosition = 100;
		while (position1 != winningPosition) {
			int rollDie = rollCheck();
			System.out.println("Value at die is: " + rollDie);
			int checkOption = options();
			switch (checkOption) {
			case 0:
				System.out.println("No play");
				break;
			case 1:
				System.out.println("Ladder");
				position1 = position1 + rollDie;
				if (position1 > winningPosition)
					position1 = position1 - rollDie;
				break;
			case 2:
				System.out.println("Snake");
				position1 = position1 - rollDie;
				if (position1 < 0)
					position1 = 0;
				break;
			}
			System.out.println("Current Position of player1 is: " + position1);
			counter++;
		}
		System.out.println("Numbere of times the dice was played are: " + counter);
	}
}