package ticTocToe;

public class TicTocToe {

	public static void main(String[] args) {
		System.out.println(" Welcome ");
		char[] board=createBoard();
	}
	private static char[] createBoard() {
		char[] board=new char[10];
		for(int i=1	;i<board.length;i++)
		{
			board[i]=' ';
		}
		return board;
	}

}
