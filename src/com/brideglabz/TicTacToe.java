package com.brideglabz;

public class TicTacToe {

	    private static char[] board = new char[10];

	    /*
	     * UC-1 creating board
	     */
	    static void startGame(){
	        for( int i = 1; i <= 9; i++) {
	            board[i] = ' ';
	        }
	    }

	    public static void main(String[] args) {
	        System.out.println("Welcome to Tic Tac Toe Simulation");

	        startGame();
	}
}
