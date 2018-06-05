package main;

public class Board {

	private char x = 'X';
	private char o = 'O';
	private char move = x;
	private char line = '|';
	private char space = ' ';
//	private char[][] board = { { line, '1', line, '2', line, '3', line }, { line, '4', line, '5', line, '6', line },
//			{ line, '7', line, '8', line, '9', line } };
	/*private char[][] board = { { line, space, line, space, line, space, line }, 
								{ line, space, line, space, line, space, line },
								{ line, space, line, space, line, space, line } };*/
	private char[][] board = { 	{ space, space, space}, 
								{ space, space, space},
								{ space, space, space} };

	public Board() {

	}

	/*public void getBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.print(board[i][j]);
				if (j == board[i].length - 1) {
					System.out.printf("\n");
				}

			}
		}
	}*/
	
	public void getBoard() {
		for (int i = 0; i < board.length; i++) {
			for (int j = 0; j < board[i].length; j++) {
				System.out.printf("%c%c",line, board[i][j]);
				if (j == board[i].length - 1) {
					System.out.printf("%c\n", line);
				}

			}
		}
	}

	public void setBoard(int row, int col, char value) {
		if (row < 1 || row > 3 || col < 1 || col > 3) {
			System.out.println("Nepareizas koordinatas");
		} else {
/*			switch (row) {
			case 1:
				row = 1;
				break;
			case 2:
				row = 3;
				break;
			default:
				row = 5;
				break;
			}
			switch (col) {
			case 1:
				col = 0;
				break;
			case 2:
				col = 1;
				break;
			default:
				col = 2;
				break;
			}*/
			if (board[col-1][row-1] != x && board[col-1][row-1] != o) {
				board[col-1][row-1] = value;
			} else {
				System.out.println("Aiznemts!");
			}
		}

	}
	public boolean checkPos(int col, int row) {
		char value = board[col][row];
		if (value == x || value == o) {
			return false;
		}
		return true;
	}

}
