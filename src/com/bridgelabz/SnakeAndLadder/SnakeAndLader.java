package com.bridgelabz.SnakeAndLadder;

public class SnakeAndLader {
	public static int rollCheck() {
		int rollValue = (int) (Math.floor(Math.random() * 10 % 7));
		return rollValue;

	}

	public static void main(String[] args) {
		int position1 = 0;
		System.out.println("Welcome to Snake and Ladder Game");
		System.out.println("Position of Player1 is:" + position1);
		int rollDie = rollCheck();
		if (rollDie > 0)
			System.out.println("Value at die is: " + rollDie);
		else
			System.out.println("Roll the die again!");
	}
}