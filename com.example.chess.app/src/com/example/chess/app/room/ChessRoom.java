package com.example.chess.app.room;

import com.example.chess.core.model.Army;
import com.example.chess.core.model.Board;
import com.example.chess.core.model.Side;
import com.example.chess.core.model.piece.Bishop;
import com.example.chess.core.model.piece.BlackPawn;
import com.example.chess.core.model.piece.King;
import com.example.chess.core.model.piece.Knight;
import com.example.chess.core.model.piece.Queen;
import com.example.chess.core.model.piece.Rook;
import com.example.chess.core.model.piece.WhitePawn;

public class ChessRoom
{
    private final Board board;

    public ChessRoom()
    {
        Army whiteArmy = new Army();
        Army blackArmy = new Army();
        board = new Board(whiteArmy, blackArmy);

        for (int c = 0; c < Board.LENGTH; c++)
        {
            whiteArmy.addPiece(new WhitePawn(board.getSquare(1, c), Side.WHITE));
        }
        whiteArmy.addPiece(new Rook(board.getSquare(0, 0), Side.WHITE));
        whiteArmy.addPiece(new Rook(board.getSquare(0, 7), Side.WHITE));
        whiteArmy.addPiece(new Knight(board.getSquare(0, 1), Side.WHITE));
        whiteArmy.addPiece(new Knight(board.getSquare(0, 6), Side.WHITE));
        whiteArmy.addPiece(new Bishop(board.getSquare(0, 2), Side.WHITE));
        whiteArmy.addPiece(new Bishop(board.getSquare(0, 5), Side.WHITE));
        whiteArmy.addPiece(new King(board.getSquare(0, 4), Side.WHITE));
        whiteArmy.addPiece(new Queen(board.getSquare(0, 3), Side.WHITE));

        for (int c = 0; c < Board.LENGTH; c++)
        {
            blackArmy.addPiece(new BlackPawn(board.getSquare(6, c), Side.BLACK));
        }
        blackArmy.addPiece(new Rook(board.getSquare(7, 0), Side.BLACK));
        blackArmy.addPiece(new Rook(board.getSquare(7, 7), Side.BLACK));
        blackArmy.addPiece(new Knight(board.getSquare(7, 1), Side.BLACK));
        blackArmy.addPiece(new Knight(board.getSquare(7, 6), Side.BLACK));
        blackArmy.addPiece(new Bishop(board.getSquare(7, 2), Side.BLACK));
        blackArmy.addPiece(new Bishop(board.getSquare(7, 5), Side.BLACK));
        blackArmy.addPiece(new King(board.getSquare(7, 4), Side.BLACK));
        blackArmy.addPiece(new Queen(board.getSquare(7, 3), Side.BLACK));
    }

    public Board getBoard()
    {
        return board;
    }
}
