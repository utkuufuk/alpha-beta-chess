package com.example.chess.core.model;

import com.example.chess.core.model.piece.Piece;

public class ChessMove
{
    private Square initialSquare;
    private Square targetSquare;
    private Piece targetPiece;

    public ChessMove(Square initialSquare, Square targetSquare, Piece targetPiece)
    {
        this.initialSquare = initialSquare;
        this.targetSquare = targetSquare;
        this.targetPiece = targetPiece;
    }

    public Square getInitialSquare()
    {
        return initialSquare;
    }

    public void setInitialSquare(Square initialSquare)
    {
        this.initialSquare = initialSquare;
    }

    public Square getTargetSquare()
    {
        return targetSquare;
    }

    public void setTargetSquare(Square targetSquare)
    {
        this.targetSquare = targetSquare;
    }

    public Piece getTargetPiece()
    {
        return targetPiece;
    }

    public void setTargetPiece(Piece targetPiece)
    {
        this.targetPiece = targetPiece;
    }

    @Override
    public String toString()
    {
        return initialSquare.getPiece() + ": " + initialSquare + " -> " + targetSquare;
    }
}
