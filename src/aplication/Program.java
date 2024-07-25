package aplication;

import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		
	
		ChessMatch chessMacth = new ChessMatch();
		UI.printBoard(chessMacth.getPieces());
	}

}
