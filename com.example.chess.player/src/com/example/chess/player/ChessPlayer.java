package com.example.chess.player;

import java.util.ArrayList;
import java.util.List;

import com.example.chess.core.model.Army;
import com.example.chess.core.model.Board;
import com.example.chess.core.model.ChessMove;
import com.example.chess.core.model.Side;
import com.example.chess.core.model.Square;
import com.example.chess.core.model.piece.Piece;

public class ChessPlayer
{
    protected Board board;
    protected Side side;

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

    public List<ChessMove> computeAllLegalMoves()
    {
        List<Piece> alivePieces = board.getArmy(side).getAlivePieces();
        List<ChessMove> legalMoves = new ArrayList<ChessMove>();

        for (Piece p : alivePieces)
        {
            for (Square s : p.computeLegalMoves())
            {
                ChessMove move = new ChessMove(p.getSquare(), s, s.getPiece());
                legalMoves.add(move);
            }
        }
        return legalMoves;
    }

    @Override
    public String toString()
    {
        return "USER";
    }
}
