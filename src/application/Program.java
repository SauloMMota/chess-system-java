package application;

import java.util.Scanner;

import chess.ChessMatch;
import chess.ChessPiece;
import chess.ChessPosition;

public class Program {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		ChessMatch chessMatch = new ChessMatch();

		while (true) {
			UI.printMatch(chessMatch);
			System.out.println();
			System.out.print("Source: ");
			ChessPosition source = UI.readChessPosition(sc);
			
			boolean[][] possibleMoves = chessMatch.possibleMoves(source);
			UI.clearScreen();
			UI.printBoard(chessMatch.getPieces(), possibleMoves);
			
			
			System.out.println();
			
			System.out.println("Target: ");
			ChessPosition target = UI.readChessPosition(sc);
			
			ChessPiece capturedPiece = chessMatch.peformChessMove(source, target); 
		}
	}
}