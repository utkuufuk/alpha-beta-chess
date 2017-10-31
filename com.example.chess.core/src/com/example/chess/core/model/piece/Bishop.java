package com.example.chess.core.model.piece;

import java.util.List;

import com.example.chess.core.model.Side;
import com.example.chess.core.model.Square;

public class Bishop extends Piece
{
    public Bishop(Square square, Side side)
    {
        super(square, side, 3);
    }

    @Override
    public String toString()
    {
        return side == Side.WHITE ? "B" : "b";
    }

    @Override
    public List<Square> computeLegalMoves()
    {
        // TODO Auto-generated method stub
        return null;
    }
}
