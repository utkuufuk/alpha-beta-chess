package com.example.chess.player;

import com.example.chess.core.model.Army;
import com.example.chess.core.model.Board;
import com.example.chess.core.model.ChessMove;
import com.example.chess.core.model.Side;
import com.example.chess.core.model.piece.Piece;

public class ChessPlayer
{
    private Board board;
    private Side side;

    public ChessPlayer(Board board, Side side)
    {
        this.board = board;
        this.side = side;
    }

    public ChessMove decideMove()
    {
        return null;
    }

    public void makeMove(ChessMove move)
    {
        if (move.getTargetPiece() != null)
        {
            Army opponentArmy = board.getArmy(side.opposite());
            opponentArmy.buryPiece(move.getTargetPiece());
        }
        Piece movingPiece = move.getInitialSquare().getPiece();
        movingPiece.setSquare(move.getTargetSquare());
        move.getTargetSquare().setPiece(movingPiece);
        move.getInitialSquare().setPiece(null);
    }
}
