package com.brideglabz;

import java.util.Scanner;

public class TicTacToe {
	/*
	 * UC1
	 */
	
	private static char[] board = new char[10];

	private static char player1;
	static Scanner game = new Scanner(System.in);
	static void startGame() {
		for(int i = 1; i <= 9; i++) {
			board[i] = ' ';
		
		}
	}
	/*
	 * UC2 taking input X/O
	 */
	static void playerInput() {
		System.out.println("select symbol X/O");
		player1 = game.next().charAt(0);
		if (player1 == 'X' || player1 == 'O') {
			System.out.println("player1 input:" + player1);
		}
		else {
			System.out.println("invaild input. please enter X/O onlyl");
			playerInput();
		}
	}
	public static void main(String[] args) {
System.out.println("welcome to tictactoe");
 startGame();
 playerInput();
	}

}
