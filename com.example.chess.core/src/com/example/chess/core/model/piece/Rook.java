package com.example.chess.core.model.piece;

import java.util.ArrayList;
import java.util.List;

import com.example.chess.core.icon.IconHandler;
import com.example.chess.core.model.Side;
import com.example.chess.core.model.Square;

public class Rook extends Piece
{
    public Rook(Square square, Side side)
    {
        super(square, side, 5, IconHandler.getIcon("Rook", side));
    }

    @Override
    public String toString()
    {
        return side == Side.WHITE ? "R" : "r";
    }

    @Override
    public List<Square> computeLegalMoves()
    {
        List<Square> legalMoves = new ArrayList<Square>();
        legalMoves.addAll(computeLinearMoves(1, 0));
        legalMoves.addAll(computeLinearMoves(-1, 0));
        legalMoves.addAll(computeLinearMoves(0, 1));
        legalMoves.addAll(computeLinearMoves(0, -1));
        return legalMoves;
    }
}
