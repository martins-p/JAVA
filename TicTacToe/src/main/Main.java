package main;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		Board board = new Board();
		char move = 'X';
		char exit = 'n';
		while (exit != 'y') {
			System.out.print("Ievadi rindu: ");
			int row = scan.nextInt();
			System.out.print("Ievadi kolonnu: ");
			int col = scan.nextInt();

			if (move == 'X') {
				move = 'O';
			} else {
				move = 'X';
			}
			board.setBoard(col, row, move);
			board.getBoard();
			System.out.print("Iziet? ");
			exit = scan.next().charAt(0);

		}

	}

}
