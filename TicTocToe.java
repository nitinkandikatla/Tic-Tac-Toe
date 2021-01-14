package ticTocToe;

import java.util.Scanner;

public class TicTocToe {

	public static void main(String[] args) {
		System.out.println(" Welcome ");
		char[] board=createBoard();
		char computer;
		char player=letterSelect();
		if(player=='X') 
		{
			computer='O';
		}
		else 
		{
			computer='X';
		}
		System.out.println("Player :" +player+ " computer :" + computer);
		printBoard(board);
	}
	private static char[] createBoard() {
		char[] board=new char[10];
		for(int i=1	;i<board.length;i++)
		{
			board[i]=' ';
		}
		System.out.println("Board is created and starting positon is 0");
		return board;
	}
	public static char letterSelect() {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter For player(X/0)");
		char player=sc.next().charAt(0);
		return player;
		
	}
	public static void printBoard(char board[]) {
		 System.out.println("| " + board[1] + " | " + board[2] + " | " + board[3] + " |"); 
		 System.out.println("|-----------|");
		 System.out.println("| " + board[4] + " | " + board[5] + " | " + board[6] + " |");
		 System.out.println("|-----------|");
		 System.out.println("| " + board[7] + " | " + board[8] + " | " + board[9] + " |");
		 System.out.println("|-----------|");
	}
	

}
