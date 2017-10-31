package com.example.chess.core.model.piece;

import java.util.List;

import com.example.chess.core.model.Side;
import com.example.chess.core.model.Square;

public class WhitePawn extends Piece
{
    public WhitePawn(Square square, Side side)
    {
        super(square, side, 1);
    }

    @Override
    public String toString()
    {
        return "P";
    }

    @Override
    public List<Square> computeLegalMoves()
    {
        // TODO Auto-generated method stub
        return null;
    }
}
