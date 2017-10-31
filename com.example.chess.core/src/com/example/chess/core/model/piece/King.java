package com.example.chess.core.model.piece;

import java.util.List;

import com.example.chess.core.model.Side;
import com.example.chess.core.model.Square;

public class King extends Piece
{
    public King(Square square, Side side)
    {
        super(square, side, 99);
    }

    @Override
    public String toString()
    {
        return side == Side.WHITE ? "G" : "g";
    }

    @Override
    public List<Square> computeLegalMoves()
    {
        // TODO Auto-generated method stub
        return null;
    }
}
