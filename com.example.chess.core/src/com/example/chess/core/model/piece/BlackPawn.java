package com.example.chess.core.model.piece;

import java.util.ArrayList;
import java.util.List;

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

    @Override
    public List<Square> computeLegalMoves()
    {
        List<Square> legalMoves = new ArrayList<Square>();
        Square targetSquare = square.getAdjacentSquare(0, -1);

        if (targetSquare != null && targetSquare.getPiece() == null)
        {
            legalMoves.add(targetSquare);
            targetSquare = square.getAdjacentSquare(0, -2);

            if (square.getRow() == 6 && targetSquare.getPiece() == null)
            {
                legalMoves.add(targetSquare);
            }
        }
                
        targetSquare = square.getAdjacentSquare(1, -1);

        if (targetSquare != null && targetSquare.getPiece() != null && targetSquare.getPiece().side != side)
        {
            legalMoves.add(targetSquare);
        }

        targetSquare = square.getAdjacentSquare(-1, -1);

        if (targetSquare != null && targetSquare.getPiece() != null && targetSquare.getPiece().side != side)
        {
            legalMoves.add(targetSquare);
        }
        return legalMoves;
    }
}
