package com.example.chess.core.model;

import com.example.chess.core.model.piece.Piece;

public class Board
{
    public static final int LENGTH = 8;

    private Square[][] squares;
    private Army whiteArmy;
    private Army blackArmy;

    public Board(Army whiteArmy, Army blackArmy)
    {
        this.whiteArmy = whiteArmy;
        this.blackArmy = blackArmy;
        squares = new Square[LENGTH][LENGTH];

        for (int r = 0; r < LENGTH; r++)
        {
            for (int c = 0; c < LENGTH; c++)
            {
                squares[r][c] = new Square(this, r, c);
            }   
        }
    }

    public Army getArmy(Side side)
    {
        return side == Side.WHITE ? whiteArmy : blackArmy;
    }

    public Square getSquare(int row, int col)
    {
        return (row < 0 || row >= LENGTH || col < 0 || col >= LENGTH) ? null : squares[row][col];
    }

    public int computeRating(Side side)
    {
        int whiteScore = 0;
        int blackScore = 0;
        
        for (Piece p : whiteArmy.getAlivePieces())
        {
            whiteScore += p.getScore();
        }

        for (Piece p : blackArmy.getAlivePieces())
        {
            blackScore += p.getScore();
        }
        return side == Side.BLACK ? blackScore - whiteScore : whiteScore - blackScore;
    }

    public void display()
    {
        for (int r = Board.LENGTH - 1; r >= 0; r--)
        {
            for (int c = 0; c < Board.LENGTH; c++)
            {
                if (squares[r][c].getPiece() != null)
                {
                    System.out.print(squares[r][c].getPiece());
                }
                else
                {
                    System.out.print(".");
                }
            }
            System.out.println();
        }
    }
}
