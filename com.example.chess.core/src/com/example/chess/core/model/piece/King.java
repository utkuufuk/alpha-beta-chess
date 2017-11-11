package com.example.chess.core.model.piece;

import java.util.ArrayList;
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
        List<Square> legalMoves = new ArrayList<Square>();
        
        for (int h = -1; h <= 1; h++)
        {
            for (int v = -1; v <= 1; v++)
            {
                Square targetSquare = square.getAdjacentSquare(h, v);
                checkSquare(legalMoves, targetSquare);
            }
        }
        return legalMoves;
    }
}
