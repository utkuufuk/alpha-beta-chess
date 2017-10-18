package com.example.chess.core.model.piece;

import com.example.chess.core.model.Side;
import com.example.chess.core.model.Square;

public abstract class Piece
{
    private final int score;
    private Square square;
    private final Side side;
    
    public Piece(int score, Side side)
    {
        this.score = score;
        this.side = side;
    }
}
