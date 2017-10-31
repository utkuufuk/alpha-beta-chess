package com.example.chess.core.model.piece;

import java.util.List;

import com.example.chess.core.model.Side;
import com.example.chess.core.model.Square;

public class Rook extends Piece
{
    public Rook(Square square, Side side)
    {
        super(square, side, 5);
    }

    @Override
    public String toString()
    {
        return side == Side.WHITE ? "R" : "r";
    }

    @Override
    public List<Square> computeLegalMoves()
    {
        // TODO Auto-generated method stub
        return null;
    }
}
