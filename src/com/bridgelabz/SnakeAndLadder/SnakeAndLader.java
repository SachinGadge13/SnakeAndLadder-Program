package com.bridgelabz.SnakeAndLadder;

public class SnakeAndLader {
	public static int rollCheck() {
		int rollValue = (int) (Math.floor(Math.random() * 10 % 7));
		return rollValue;

	}

	public static int options() {
		int option = (int) (Math.floor(Math.random() * 10 % 3));
		return option;
	}

	public static void main(String[] args) {
		int position1 = 0;
		
		System.out.println("Welcome to Snake and Ladder Game");
		System.out.println("Position of Player1 is:" + position1);
		
		int rollDie = rollCheck();
		if (rollDie > 0) {
		
			System.out.println("Value at die is: " + rollDie);
			
			int checkOption = options();
			switch (checkOption) {
			case 0:
				System.out.println("No play");
				break;
			case 1:
				System.out.println("Ladder");
				position1 = position1 + rollDie;
				break;
			case 2:
				System.out.println("Snake");
				position1 = position1 - rollDie;
				if (position1 < 0)
					position1 = 0;
				break;
			}
			System.out.println("Current Position of player1 is: " + position1);

		} else
			System.out.println("Roll the die again!");

	}
}