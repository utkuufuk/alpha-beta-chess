package com.example.chess.core.model.piece;

import com.example.chess.core.model.Side;
import com.example.chess.core.model.Square;

public class BlackPawn extends Piece
{
    public BlackPawn(Square square, Side side)
    {
        super(square, side, 1);
    }

    @Override
    public String toString()
    {
        return "p";
    }
}
