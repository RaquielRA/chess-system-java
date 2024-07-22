package aplication;

import boardgame.Board;
import boardgame.Position;
import chess.ChessMatch;

public class Program {

	public static void main(String[] args) {
		
		Board board = new Board(8, 8);
	
		ChessMatch chessMacth = new ChessMatch();
		UI.printBoard(chessMacth.getPieces());
	}

}
