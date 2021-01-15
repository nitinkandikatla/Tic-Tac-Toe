package ticTocToe;

import java.util.Scanner;

public class TicTocToe {

	public static char player=' ';
	public static char[] board;
	public static void main(String[] args) {
		System.out.println(" Welcome ");
		char[] board=createBoard();
		char computer;
		player=letterSelect();
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
		selectIndex(board);
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
	public static void selectIndex(char board[]) {
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter index from 1 to 9 :");
		int index=sc.nextInt();
		if(board[index]==' ') 
		{
			System.out.println("Index is free");
			makeMove(board,index,player);
		}
		else 
		{
			System.out.println("index is not free");
		}
	}
	public static void makeMove(char board[],int index,char player) {
		board[index]=player;
		printBoard(board);
	}
	

}
