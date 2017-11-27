package com.example.chess.core.model.piece;

import java.util.ArrayList;
import java.util.List;

import com.example.chess.core.model.Side;
import com.example.chess.core.model.Square;

public class Queen extends Piece
{
    public Queen(Square square, Side side)
    {
        super(square, side, 9);
    }

    @Override
    public String toString()
    {
        return side == Side.WHITE ? "Q" : "q";
    }

    @Override
    public List<Square> computeLegalMoves()
    {
        List<Square> legalMoves = new ArrayList<Square>();
        legalMoves.addAll(computeLinearMoves(1, 0));
        legalMoves.addAll(computeLinearMoves(-1, 0));
        legalMoves.addAll(computeLinearMoves(0, 1));
        legalMoves.addAll(computeLinearMoves(0, -1));
        legalMoves.addAll(computeLinearMoves(1, 1));
        legalMoves.addAll(computeLinearMoves(1, -1));
        legalMoves.addAll(computeLinearMoves(-1, -1));
        legalMoves.addAll(computeLinearMoves(-1, 1));
        return legalMoves;
    }
}
