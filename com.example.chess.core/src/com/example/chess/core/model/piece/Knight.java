package com.example.chess.core.model.piece;

import com.example.chess.core.model.Side;
import com.example.chess.core.model.Square;

public class Knight extends Piece
{
    public Knight(Square square, Side side)
    {
        super(square, side, 3);
    }

    @Override
    public String toString()
    {
        return side == Side.WHITE ? "K" : "k";
    }
}
