package com.example.chess.core.model.piece;

import com.example.chess.core.model.Side;
import com.example.chess.core.model.Square;

public abstract class Piece
{
    private final int score;
    private Square square;
    protected final Side side;
    
    protected Piece(Square square, Side side, int score)
    {
        this.square = square;
        this.square.setPiece(this);
        this.score = score;
        this.side = side;
    }
}
