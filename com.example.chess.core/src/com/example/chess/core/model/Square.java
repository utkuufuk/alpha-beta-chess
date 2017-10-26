package com.example.chess.core.model;

import com.example.chess.core.model.piece.Piece;

public class Square
{
    private final Board board;
    private final int row;
    private final int col;
    private Piece piece;

    public Square(Board board, int row, int col)
    {
        this.board = board;
        this.row = row;
        this.col = col;
    }

    public void setPiece(Piece piece)
    {
        this.piece = piece;
    }

    public Piece getPiece()
    {
        return piece;
    }
}
