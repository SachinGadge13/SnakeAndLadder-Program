package com.bridgelabz.SnakeAndLadder;

public class SnakeAndLader {

	static int player1 = 0, player2 = 0, winningPosition = 10, flag = 0, counter = 0;

	public static void playgame() {
		if (flag == 0) {
			counter++;
			int rollDie = rollCheck();
			System.out.println("Value at die is: " + rollDie);
			int checkOption = options();
			switch (checkOption) {
			case 0:
				System.out.println("No play");
				flag = 1;
				break;
			case 1:
				System.out.println("Ladder");
				player1 = player1 + rollDie;
				if (player1 > winningPosition)
					player1 = player1 - rollDie;
				System.out.println("Player1 is at position: " + player1);
				break;
			case 2:
				System.out.println("Snake");
				player1 = player1 - rollDie;
				if (player1 < 0)
					player1 = 0;
				System.out.println("Player1 is at position: " + player1);
				flag = 1;
				break;
			}
			if (player1 == winningPosition) {
				System.out.println("Player1 is winner");
			}
		} else {
			counter++;
			int rollDie = rollCheck();
			System.out.println("Value at die is: " + rollDie);
			int checkOption = options();
			switch (checkOption) {
			case 0:
				System.out.println("No play");
				flag = 0;
				break;
			case 1:
				System.out.println("Ladder");
				player2 = player2 + rollDie;
				if (player2 > winningPosition)
					player2 = player2 - rollDie;
				System.out.println("Player2 is at position: " + player2);
				break;
			case 2:
				System.out.println("Snake");
				player2 = player2 - rollDie;
				if (player2 < 0)
					player2 = 0;
				System.out.println("Player2 is at position: " + player2);
				flag = 0;
				break;
			}
			if (player2 == winningPosition) {
				System.out.println("Player2 is winner");
			}
		}
	}

	public static int rollCheck() {
		int rollValue = (int) (Math.floor(Math.random() * 10 % 6 + 1));
		return rollValue;

	}

	public static int options() {
		int option = (int) (Math.floor(Math.random() * 10 % 3));
		return option;
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Snake and Ladder Game");
		while (true) {
			if (player1 == winningPosition || player2 == winningPosition) {
				break;
			}
			playgame();
		}
		System.out.println("Number of time dice has rolled is: " + counter);
	}
}