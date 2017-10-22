package com.example.chess.core.model;

import java.util.ArrayList;
import java.util.List;

import com.example.chess.core.model.piece.Piece;

public class Army
{
    private final List<Piece> alivePieces;
    private final List<Piece> deadPieces;

    public Army()
    {
        alivePieces = new ArrayList<Piece>();
        deadPieces = new ArrayList<Piece>();
    }

    public List<Piece> getAlivePieces()
    {
        return alivePieces;
    }

    public List<Piece> getDeadPieces()
    {
        return deadPieces;
    }

    public void addPiece(Piece piece)
    {
        alivePieces.add(piece);
    }

    public void buryPiece(Piece piece)
    {
        alivePieces.remove(piece);
        deadPieces.add(piece);
    }
}
